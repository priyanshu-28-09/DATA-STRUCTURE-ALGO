package Recursion;
import java.util.*;
public class subsqu {
    public static void main(String[] args) {
        String str = "abc";
        System.out.println(helper(str));
    }
    public static ArrayList<String> helper(String str){
       ArrayList<String> list =new ArrayList<>();

         if(str.length() == 0){
            list.add("");
            return list;
         }if(str.length()==1){
            list.add("");
            list.add(str);
            return list;
         }
         char ch = str.charAt(0);
         String rem = str.substring(1);
         ArrayList<String> remAns = helper(rem);

         for(String s : remAns){
         list.add(" " + s);
         list.add(ch + s);
         }
         return list;
    }
}
