
public class N_Queens {
       public static void main(String[] args) {
        int n=4;
        boolean[][] board=new boolean[n][n];   
        queens(board,0);
    }
        static int queens(boolean[][] board , int r){
            if(r == board.length){
                display(board);
                return 1;

            }
            int count = 0;
            for(int col=0;col<board.length;col++){
                if(isSafe(board, r, col)){
                    board[r][col]=true;
                    count += queens(board, r+1);
                    board[r][col]=false;
                }
            }
            return count;
        }
        private static void display(boolean[][] board){
            for(boolean[] arr:board){
                for(boolean i: arr){
                    if(i){
                        System.out.print("Q");
                    }else{
                        System.out.print("X");
                    }
                }
                System.out.println();
            }
        }
        private static boolean isSafe(boolean[][] board,int r,int c){
            int row=r;
            int col=c;
            while(r>0 && c>0){
                if(board[--r][--c])
                    return false;
            }
            r=row;
            c=col;
            while(r>0 && c<board.length-1){
                if(board[--r][++c])
                    return false;
            }
            r=row;
            c=col;
            while(r>0){
                if(board[--r][c]){
                    return false;
                }
            }
            return true;
        }        
}
