//Recusrion
public class CountZeros {
    public static void main(String[] args) {
        System.out.println(countZero(903060));
    }

    public static int countZero(int n){
        return count(n,0);
    }

    static int count(int n, int c){
        if(n == 0){
            return c;
        }
        int r = n % 10;
        if(r == 0){
            return count(n/10, c+1);
        }
        return count(n/10, c);
    }
}
