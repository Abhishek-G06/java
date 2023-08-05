public class sumDigits {
    public static void main(String[] args) {
        System.out.println(sum(1234));
    }

    public static int sum(int n){
        if (n == 0) {
            return n;
        }
        int a = (n%10);
        int s =sum(n/10);
        return a + s;
    }
}
