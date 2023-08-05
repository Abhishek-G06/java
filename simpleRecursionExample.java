public class simpleRecursionExample {
    public static void main(String[] args) {
        print(0,50);
    }
    public static void print(int a, int n){
        if(a==n){
            return;
        }

        System.out.println(a+1);
        print(a+1, n);
    }
}
