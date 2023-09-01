//import java.util.Scanner;
class RomanToInt {
    public static int romanToInt(String s) {
        int res = value(s.charAt(s.length()-1));
        for(int i = s.length()-2;i>=0;i--){
          
           if(value(s.charAt(i+1)) >value(s.charAt(i))){
                res = res-value(s.charAt(i));
           }
           else{
                res = res+value(s.charAt(i));
           }
        
        }
        return res;
    }
    public static int value(char c){
        switch (c) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0;
        }
    }
    public static void main (String[] args) {
        /* code */
        //Scanner sc = new Scanner(System.in);
        String s = "XCVII";
        
        int result = romanToInt(s);
        System.out.println(result);
    
    }
}