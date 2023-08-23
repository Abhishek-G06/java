/*
Problem Statement::

Given an unsorted array A of size N that contains only non-negative integers, 
find a continuous sub-array that adds to a given number S and return the left and right indexes of that sub-array. 
In the case of multiple subarrays, return the subarray indexes that come first when moving from left to right.

*/

import java.util.*;

class Solution{
    ArrayList<Integer> subarraySum(int[] arr, int n, int s) {
        ArrayList <Integer> al=new ArrayList<>();
        Integer i=0,st=0,sum=0;
        
        while(i<n){
            sum+=arr[i];
            
            if(sum==s){
                al.add(st+1);
                al.add(i+1);
                return al;
            }
            while(sum>s){
                sum-=arr[st];
                st=st+1;
            }
            if(sum==s){
                if(st<=i){
                    al.add(st+1);
                    al.add(i+1);
                    return al;
                }
            }
            i++;
        }
        al.add(-1);
        return al;
    }
}
class Main{
    public static void main(String [] args){
        //Scanner sc = new Scanner(System.in);
        int l = 5;
        int[] arrl = {1,2,3,7,5};
        int sum = 12;
        
        for(int i = 0; i < l; i++){
            arrl[i] = arrl[i];
        }
        
        Solution s=new Solution();
        ArrayList <Integer> al = s.subarraySum(arrl,l,sum);
        
        for(int i = 0; i < al.size(); i++){
            System.out.print(al.get(i)+" ");
        }
       // sc.close();
    }
}