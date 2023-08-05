public class reverseRecur {
    public static void main(String[] args) {
        System.out.println(reverse("1234"," "));
    }

    public static String reverse(String s, String ans){
        if(s.length()-1<0){
            return ans;
        }
        ans += s.charAt(s.length()-1);
        return reverse(s.substring(0, s.length()-1), ans); 
    }
}