// public class String_a_removal {
//      public static void main(String[] args) {

//         skip("","aaaaaaa");
//      }
//     static void skip(String p,String up){
//         if(up.isEmpty()){
//             System.out.println(p);
//             return;
//         }
//         char ch = up.charAt(0);
//         if(ch!= 'a'){
//             p+=ch;

//         }
//         skip(p,up.substring(1));
//     }
// } 
public class String_a_removal {
    public static void main(String[] args) {

       skipApple("","aaaappleaaaa");
    }
   static void skipApple(String p,String up){
       if(up.isEmpty()){
           System.out.println(p) ;
           return;
       }
       char ch = up.charAt(0);
       if(up.startsWith("apple")){
        skipApple(p, up.substring(5));
       }else{
        p+=ch;
        skipApple(p, up.substring(1));
       }
      
   }
}


