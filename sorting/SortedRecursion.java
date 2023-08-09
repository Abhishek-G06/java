package sorting;
public class SortedRecursion {
    public static void main(String[] args) {
        int[] ar= {1,2,3,4,5,6,7};
        System.out.println(sorted(ar, 0));
    }

    public static boolean sorted(int[] arr, int ind){

        if(ind == arr.length-1){
            return true;
        }
        return arr[ind] < arr[ind+1] && sorted(arr, ind+1);
    }
}
