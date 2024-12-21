import java.util.ArrayList;

public class PhinePad {
    public static void main(String[] args) {
        System.out.println(pat("","12"));
    }
    static ArrayList<String> pat(String p, String up){
        if(up.isEmpty()){                             
            ArrayList<String> al= new ArrayList<>();
            al.add(p); 
            return al;
    }
    int digit = up.charAt(0) - '0';
    ArrayList<String> al =new ArrayList<>();

    for (int i = (digit - 2)*3;i<((digit - 1)*3) + digit/7;i++){
        if(digit == 8 & i== ((digit - 1)*3 + (digit/7 )-1))
            continue;
        char ch = (char)('a' + i);
        al.addAll(pat(p + ch, up.substring(1)));
    }
    return al;
    
    }
}
