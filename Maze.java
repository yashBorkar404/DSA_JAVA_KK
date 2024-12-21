import java.util.*;
public class Maze {
    public static void main(String[] args) {
        boolean[][] maze={{true,true,true},{
            true,false,true},
            {true,true,true}
        };
        System.out.println(pathFinderDiag("",3, 3,maze));
    }
//     static ArrayList<String> pathFinder(String p,int r, int c){
//         if(r == 1 || c==1 ){
//             ArrayList<String> al = new ArrayList<>();
//             if(r==1 && c==1){
//                 // System.out.println(p);
//                 al.add(p);
//                 return al;
//             }

//             else if(r == 1){
//                 while(c!=1){
//                     p+="r";
//                     c--;
//                 }
//             }
//             else{
//                 while(r!=1){
//                     p+="d";
//                     r--;
//                 }
//             }
                
//             // 
//             al.add(p);
//             return al;
        
             
//         }
//         ArrayList<String> left  = pathFinder(p+"d" ,r-1 ,c);
//         ArrayList <String> right = pathFinder(p+"r",r,c-1);
//         left.addAll(right);
//         return left;
//     }
    
// }
// 
static ArrayList<String> pathFinderDiag(String p,int r, int c,boolean[][] maze){
    if(!maze[3-r][3-c]){
        return new ArrayList<>();
    }
    if(r == 1 || c==1 ){
        ArrayList<String> al = new ArrayList<>();
        if(r==1 && c==1){
            // System.out.println(p);
            al.add(p);
            return al;
        }

        else if(r == 1){
            while(c!=1){
                p+="H";
                c--;
            }
        }
        else{
            while(r!=1){
                p+="V";
                r--;
            }
        }
            
        // 
        al.add(p);
        return al;
    
         
    }
   
    ArrayList<String> left  = pathFinderDiag(p+"V" ,r-1 ,c,maze);
    ArrayList<String> diag = pathFinderDiag(p+"D", r-1, c-1,maze);
    ArrayList <String> right = pathFinderDiag(p+"H",r,c-1,maze);
    left.addAll(right);
    left.addAll(diag);
    return left;
}

}
