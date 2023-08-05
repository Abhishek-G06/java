public class GCDRec {
    public static void main(String[] args) {
        int a= 5; int b=35 ; int r= 5;
        System.out.println(gcd(a,b,r));

    }

    public static int gcd(int a, int b, int r){
        if(b == 0){
            return a;
        }
        return gcd(b,r,b%a);
    }
}
