public class factorial {
    public static void main(String[] args) {
        fact(6);
    }
    public static int fact(int n){
        if (n == 1){
            return 1;
        
        }
        n *= fact(n-1); 
        System.out.println(n);
        return n;
    }
}
