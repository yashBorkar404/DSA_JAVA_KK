import java.util.Arrays;

public class AllPaths {
    public static void main(String[] args) {
        boolean[][] maze={{true,true,true},{
            true,true,true},
            {true,true,true}
        };
        int[][] path=new int[3][3];
        
        int step=1;
       pathFinderDiag("", 0 ,0 ,maze,path,step); 
    }
    static void pathFinderDiag(String p,int r, int c,boolean[][] maze,int[][] path,int step){
        if(!maze[r][c]){
            return;
        }   
        if( r == maze.length-1 && c== maze[0].length-1){
            path[r][c]=step;
            System.out.println(p);
          for(int[] arr : path){
            System.out.println(Arrays.toString(arr));
          }
            return;
        }
        maze[r][c]=false;
        path[r][c]=step;
        if(r < maze.length-1){
            pathFinderDiag(p+"D" ,r+1 ,c,maze,path,step+1);
        }
        if(c < maze[0].length-1){
            pathFinderDiag(p+"R" ,r ,c+1,maze,path,step+1);
        }
        if( r>0 ){
            pathFinderDiag(p+"U" ,r-1,c,maze,path,step+1);
        }
        if( c>0 ){
            pathFinderDiag(p+"L" ,r ,c-1,maze,path,step+1);
        }
        maze[r][c]=true;
        path[r][c]=0;
        step--;
    }


}

