import java.util.*;

public class Array {
    ArrayList<Integer> list = new ArrayList<>();
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,4,8};
        System.out.print(findIndex(arr, 4, 0));
    } 
    public static ArrayList<Integer> findIndex(int[] arr, int target, int index){
        ArrayList<Integer> list = new ArrayList<>(); 
        
        if(index == arr.length){
            return list;
        }
        //contains ans for that func only
        if (arr[index] == target) {
            list.add(index);
        }

        ArrayList<Integer> ans=  findIndex(arr, target, index+1);
        
        list.addAll(ans);
        return list;

    }
}
