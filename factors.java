import java.util.*;

public class factors {
    public static void main(String[] args) {
        fact(44);
        System.out.println();
        fact2(44);
        System.out.println();
        fact3(44);
    }
    // O(n)
    public static void fact(int n){
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i+" ");
            }
        }
    }
    // O(sqrt(n))
    public static void fact2(int n){
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                if (n/i == i) {
                    System.out.println(i+" ");
                }else{
                    System.out.print(i+" "+n/i+" ");
                }
            }
        }
    }

    // O(sqrt(n)) for both time and space
    public static void fact3(int n){
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                if (n/i == i) {
                    System.out.println(i+" ");
                }else{
                    System.out.print(i+" ");
                    list.add(n/i);
                }
            }
        }
        for (int i = list.size()-1; i >= 0; i--) {
            System.out.print(list.get(i)+" ");
        }
    }
}
