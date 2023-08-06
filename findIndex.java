public class findIndex {
    public static void main(String[] args) {
        int[] ar = {61,62,63,64,65,66,67,68,69};
        System.out.println(find(ar, 67, 0));
    }

    public static int find(int[] arr, int target, int ind){
        if(ind == arr.length){
            return -1;
        }

        if(arr[ind] == target){
            return ind;
        }else{
            return find(arr, target, ind+1);
        }
    }
}
