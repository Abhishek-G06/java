package codes;
import java.util.Scanner;
class c {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        int a[] = new int[10];

        for (int i=0; i<10; i++)
        {
            a[i] = ob.nextInt();
        }
        for (int i=0; i<10; i++)
        {
            System.out.println(" "+a[i]);
        }
    }
}
