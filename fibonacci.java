public class fibonacci{
    public static void main(String[] args){
        int a= 0, b = 1, n,i;
        System.out.println(a+" "+b);
        for (i = 0; i<10; i++){
            n = a+b;
            System.out.println(""+n);
            a=b;
            b=n;
        }
    }
}