package Recursion;

import java.util.ArrayList;

public class stair {
    public static void main(String[] args) {
        System.out.println(stair(5));
    }
    public static ArrayList<String> stair(int n) {
      ArrayList<String> ans  =  new ArrayList<>();
         if(n < 0 ){
            return ans;
         }
         if(n ==0 ){
            ans.add("");
            return ans;
         }
         ArrayList<String> onePath = stair(n-1);
          ArrayList<String> twoPath = stair(n-2);
           for(String p : onePath){
                ans.add( 1+ " " +p);
           }for(String p : twoPath){
                ans.add( 2+ " " +p);
           }
         return ans;
    }
}
