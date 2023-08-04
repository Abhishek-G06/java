public class NewtonSQRT{
    public static void main(String[] args) {
        System.out.printf("%.2f",sqrt(56));
    }

    public static double sqrt(double n){
        double x = n;
        double root;
        while (true) {
            root = 0.5 * (n+(n/x)); 

            if (Math.abs(root - x) < 0.5) {
                break;
            }

            x= root;

        }
        return root;
    }
}