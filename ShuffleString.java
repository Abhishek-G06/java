public class ShuffleString {
    public static String reverseStr(String s, int k) {
        
        char[] c = s.toCharArray();
        

       for(int i = 0;i < s.length(); i += 2*k){
           int st = i;
           int e = Math.min(i+k-1,c.length-1);
           
           while(st < e){
               char temp = c[st];
               c[st++] = c[e];
               c[e--] = temp;
           }
       }
       return String.valueOf(c);
    }
    public static void main(String[] args) {
        String s = "abcdefg"; 
        int k = 2;
        System.out.println(reverseStr(s, k));
    }
}