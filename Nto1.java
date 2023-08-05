public class Nto1 {
    public static void main(String[] args) {
        funcBoth(5);
    }
    public static void func(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        func(n-1);
    }

    public static void funcRev(int n){
        if(n==0){
            return;
        }
        funcRev(n-1);
        System.out.println(n);
    }

    public static void funcBoth(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        funcBoth(n-1);
        System.out.println(n);
    }
}