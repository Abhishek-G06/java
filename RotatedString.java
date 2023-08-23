class RotateString{
    public static boolean rotateString(String s, String goal) {
        
        for(int x=0 ; x<s.length() ; x++){
            if(s.equals(goal)){
                return true;
            }
           
            String a=s.substring(1);
            char b= s.charAt(0);
            s = a+ b;
        }
        return false;
    }
    public static void main(String[] args) {
        String s = "abcde";
        String goal = "cdeab";
        boolean result = rotateString(s, goal);
        System.out.println(result);
    }
}