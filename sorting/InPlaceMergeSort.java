package sorting;
import java.util.Arrays;

public class InPlaceMergeSort {
    public static void main(String[] args) {
        int[] arr= {5,4,3,2,1};
        inPlaceMergeSort(arr,0,arr.length);
        System.out.println(Arrays.toString(arr));
    }

    public static void inPlaceMergeSort(int[] arr,int s, int e) {
        if (e - s == 1) {
            return;    
        }
        int mid = (s+e)/2;

        inPlaceMergeSort(arr, s, mid);
        inPlaceMergeSort(arr, mid, e);
        
        inPlaceMerge(arr, s, mid, e);
    }
    public static void inPlaceMerge(int[] arr, int s, int m, int e){
        int[] mix = new int[ e - s];
        
        int i = s;
        int j = m ;
        int k = 0;

        while(i < m && j < e){
            if(arr[i] < arr[j]){
                mix[k] = arr[i];
                i++; 
            }else{
                mix[k] = arr[j];
                j++;
            }
            k++;
        }
        while (i < m) {
            mix[k] = arr[i]; i++; k++;
        }

        while (j < e) {
            mix[k] = arr[j]; j++; k++;
        }

        //System.arraycopy(mix, 0, arr, s+0, mix.length);
        for (int l = 0; l < mix.length; l++) {
            arr[s+l] = mix[l];
        }
    }
}