package sorting;
public class RotatedSortedArray {
    public static void main(String[] args) {
        int[] nums={4,5,6,7,0,1,2};
        int target = 0;
        System.out.println(search(nums, target));
    }
    // This code will not work on duplicate elements in an array.  
    public static int search(int[] nums, int target) {
        int pivot = findPivot(nums);

        // if pivot not found, means array is not rotated.

        if(pivot == -1){
            return BS(nums, target, 0, nums.length-1);
        }

        // if pivot is found, then 2 asc sorted array is also found.

        if (nums[pivot] == target){
            return pivot;
        }

        if (target >= nums[0]){
            return BS(nums, target, 0, pivot-1);
        }
        return BS(nums, target, pivot+1, nums.length-1);
    }

    // Applying binary search for sorted array
    static int BS(int[] arr, int target, int s, int e){
        while(s <= e){
            int mid = (s + (e-s)/2);

            if (target < arr[mid]){
                e = mid-1;
            }else if(target > arr[mid]){
                s = mid +1;
            }else{
                return mid;
            }
        }
        return -1;
    }
    //finding the larget number in an array.
    static int findPivot(int[] arr){
        int s = 0;
        int e = arr.length-1;

        while(s <= e){
            int mid = (s + (e-s)/2);

            if (mid < e && arr[mid] > arr[mid +1]){
                return mid;
            }else if(mid > s && arr[mid] < arr[mid -1]){
                return mid-1;
            }else if(arr[mid] <= arr[s]){
                e = mid -1;
            }else{
                s = mid +1;
            }
        }
        return -1;
    }
}