public class BSRecurr {
    public static void main(String[] args) {
        int[] n = {2,3,4,5,6};
        int target = 4;
        int s = 0;
        int e = n.length;
        System.out.println(BS(n,target,s,e));
    }
    public static int BS(int[] n ,int target, int s, int e){
        while(s <= e){
            int mid = s+(e-s)/2;
            if(target == n[mid]){
                return mid;
            }else if(target<n[mid]){
                e = mid-1;
            }else{
                s = mid+1;
            } 
        }
        return -1;
    }
}
