// package Recursion.Recursion.java;

public class pro16 {
    public static void main(String[] args) {
    int[] arr = {1,2,4,3,11,4,5,6,43,22,2,5};
        System.out.println(firstOcc(arr,6,arr.length-1));
    }
    public static int firstOcc(int[]arr, int target, int idx){
        if(idx < 0){
            return -1;
        }
        else if(arr[idx]== target){
            return idx;
        }
        return firstOcc(arr,target,idx-1);
    }
}

