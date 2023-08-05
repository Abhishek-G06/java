public class BSRecurr {
    public static void main(String[] args) {
        int[] n = {2,3,4,5,6,7,8,9};
        int target = 7;
        System.out.println(BS(n,target,0,n.length-1));
    }
    public static int BS(int[] n ,int target, int s, int e){
        while(s < e){
            int mid = s+(e-s)/2;
            if(target == n[mid]){
                return mid;
            }else if(target<n[mid]){
                return BS(n, target, s, mid-1);
            }else{
                return BS(n, target, mid+1, e);
            } 
        }
        return -1;
    }
}
