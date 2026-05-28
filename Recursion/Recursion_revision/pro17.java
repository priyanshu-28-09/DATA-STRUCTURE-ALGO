// package Recursion.Recursion.java;

public class pro17 {
    public static void main(String[] args) {
        int[] arr = {1,2,4,3,11,4,5,6,43,22,2,5};
       AllOcc(arr,2,0);
    }
    public static void AllOcc(int[]arr, int target, int idx){
        if(idx == arr.length){
            return ;
        }
        if(arr[idx]== target){
             System.out.print(idx + " ");
        }
        AllOcc(arr,target,idx+1);
        
    }

    }

