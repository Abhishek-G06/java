package sorting;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {8,7,6,5,4};
        sort(arr, 0 , arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    public static void sort(int[] arr, int low, int high){
        if (low >= high){
            return;
        }
        int s = low; int e = high; 
        int mid = e + (s-e)/2;
        int p = arr[mid]; 

        while (s <= e) {
            while (arr[s] < p) {
                s++;
            }
            while (arr[e] > p ) {
                e--;
            }

            if (s <= e ) {
                int t = arr[s];
                arr[s] = arr[e];
                arr[e] = t;

                s++; e--;
            }
        }
        sort(arr, low, e);
        sort(arr, s, high);
    }
}
