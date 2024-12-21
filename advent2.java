import java.util.*;

class advent2{
    /**
     * @param args
     */
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> a = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine().trim();
            if (line.isEmpty()) {
                break; // Stop on empty line
            }

            // Split the line into number strings and parse to integers
            String[] elements = line.split("\\s+");
            ArrayList<Integer> r= new ArrayList<Integer>();
            for (int i = 0; i < elements.length; i++) {
                r.add(Integer.parseInt(elements[i]))  ;
            }
            a.add(r);
        }
        boolean[] res = allowedLevels(a);
        int count=0;
        for(boolean i: res){
            if(i)
                count++;
        }
        System.out.println(count);
        
}
 static boolean[] allowedLevels(ArrayList<ArrayList<Integer>> a){
    // ArrayList<ArrayList<Integer>> a = new ArrayList<>();
        boolean[] res=new boolean[a.size()];
        for(int i=0;i<res.length;i++){
            res[i]=true;
        }
        // for(int i=0;i<rows;i++){
        //     ArrayList<Integer> m=new ArrayList<Integer>();
        //     a.add(m);
        // }
        for(ArrayList<Integer> arr:a){
            int[] order=new int[2];
            for(int i=1;i<arr.size()
            ;i++){
                if(arr.get(i)>arr.get(i-1)){
                    order[(i-1)%2]=0;
                }
                else{
                    order[(i-1)%2]=1;
                }if(arr.get(i)==arr.get(i-1)){
                    res[a.indexOf(arr)] = false;
                    break;
                }

                   
                    if(i-1 >=0){
                        int diff=Math.abs(arr.get(i)-arr.get(i-1));
                        if(diff<1 || diff>3){
                            res[a.indexOf(arr)] = false;
                            break;
                        }
                    }
                    if(i>=2){
                        if(order[(i-1)%2]!= order[i%2]){
                            res[a.indexOf(arr)] = false;
                            break;
                        }
                    }
                }

            }
        
        return res;
    }
 }