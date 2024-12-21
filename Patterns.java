class Patterns{
    public static void main(String[] args) {
        pattern(4);
    }
    static void pattern(int n){
        int original=n;
        n=2*n;
        for(int i=0;i<=n;i++){
            for(int j=0;j<=n;j++){
                int val=original-Math.min(Math.min(i,j),Math.min(n-i,n-j));
                System.out.print(val);
                
            }
            System.out.println();
        }
    //         for(int col=i;col>=1;col--)
    //             System.out.print(col);
    //         for(int col=2;col<=i;col++)
    //             System.out.print(col);
    //     // int i=0;
    //     //     while(i<=n/2){
    //     //         for(int j=1;j<=i;j++){
    //         //         System.out.print(j+" *");
    //     //         }
    //     //         System.out.println();
    //     //     }          
    //     //      while(i<n){
    //     //         for(int j=1;j<=n-i;j++){
    //     //             System.out.println(" *");
    //     //        }
    //     //      System.out.println();  
    //     //     }
    //     //     System.out.println();
    //     // }
    //     System.out.println();
    // }
    // // for(int i=n;i<2*n-1;i++){
    // //     int s=i-n+1;
    // //     for(int j=0;j<n;j++){
    // //         if(j<=s){
    // //             System.out.print(" ");
    // //         }else{
    // //             System.out.print("* ");
    // //         }
    // //     }
    // //     System.out.println();
    // for(int i=n+1;i<=2*n-1;i++){
    //     for(int s=1;s<=i-n;s++){
    //         System.out.print(" ");
    //     }
    //     for(int j=2*n-i;j>=1;j--){
    //         System.out.print(j);
    //     }
    //     for(int m=2;m<=2*n-i;m++){
    //         System.out.print(m);
    //     }
    //     System.out.println();
    // }

    }
}


