public class findTarget {
    public static void main(String[] args) {
        int[] ar = {11,22,33,44,55,66,77,88,99};
        System.out.println(find(ar, 66 , 0));
    }

    public static boolean find(int[] ar, int target, int index){
        if(index == ar.length){
            return false;
        }
        return (ar[index] == target) || find(ar, target, index+1);
    }
}