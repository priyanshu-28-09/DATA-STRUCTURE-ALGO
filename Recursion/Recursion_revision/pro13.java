// package Recursion.Recursion.java;

public class pro13 {
    public static void main(String[] args) {
         int[] arr = {1,3,2,4,3,11,4,5,6,43,22,2,5};
        System.out.println(max(arr,0));
    }
    public static int max(int[]arr, int idx){
        if(idx == arr.length-1){
            return arr[idx];
        }
        int pMax= max(arr,idx+1);
        int self = arr[idx];
        return Math.max(self,pMax);
    }
}
