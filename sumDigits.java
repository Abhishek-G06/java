public class sumDigits {
    public static void main(String[] args) {
        System.out.println(sum(1234));
    }

    public static int sum(int n){
        if (n == 0) {
            return n;
        }
        return (n%10) + sum(n/10);
    }
}
