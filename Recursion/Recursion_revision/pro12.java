// package Recursion.Recursion.java;

public class pro12 {
    public static void main(String[] args) {
        int[] arr = {1,3,2,4,3,11,4,5,6,43,22,2,5};
        display(arr,0);

    }
    public static void display(int [] arr, int idx){
        if(arr.length == idx){
            return;
        }
        System.out.println(arr[idx]);
        display(arr, idx +1);
       
        
    }
}
