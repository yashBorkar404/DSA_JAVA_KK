import java.util.*;

// public class Subset1 {
//     public static void main(String[] args) {

//         ArrayList<String> sl=subset("","abc");
//         System.out.println(sl);
//     }
//     static ArrayList<String> subset(String p,String up){
//         if(up.isEmpty()){
//             ArrayList<String> list =  new ArrayList<String>();
//             list.add(p);
//             return list;
//         }
//         char ch =  up.charAt(0);
//         ArrayList<String> left = subset(p + ch,up.substring(1));
//         ArrayList<String> right = subset(p ,up.substring(1));
//         left.addAll(right);
//         return left;
//     } 
// }
//iteration

public class Subset1{
    public static void main(String[] args) {
        int[] a={1,2,3};
        System.out.println(subset(a));
    }
    static List<List <Integer>> subset(int[] arr){
        List<List<Integer>> outer=new ArrayList<>();
        outer.add(new ArrayList<Integer>());
        for(int num:arr){
            int n = outer.size();
            for(int i=0;i<n;i++){
                List<Integer> internal  = new ArrayList<>(outer.get(i));
                internal.add(num);
                outer.add(internal);
                
            }

        }
        return outer;
    }
}