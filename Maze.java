public class Maze {
    public static void main(String[] args) {
        System.out.println(count(3, 3));
    }
    static int count(int r, int c){
        if(r == 1 || c == 1){
            return 1;
        }
        return count(r-1, c)+ count(r, c-1);
    }
}