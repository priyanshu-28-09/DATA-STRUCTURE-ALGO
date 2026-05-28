
    package Recursion;

import java.util.ArrayList;

public class Permutation {
    public static void main(String[] args) {
        System.out.println(printPermuation3("abc"));
    }

    public static void printPermuation(String str, String ans) {
        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String rem = str.substring(0, i) + str.substring(i + 1, str.length());
            printPermuation(rem, ans + ch);
        }
    }
    public static ArrayList<String> printPermuation2(String str, String ans) {
        ArrayList<String> list = new ArrayList<>();
        helper2(str, ans, list);
        return list;
    }

    public static void helper2(String str, String ans, ArrayList<String> list) {
        if (str.length() == 0) {
            list.add(ans);
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String rem = str.substring(0, i) + str.substring(i + 1, str.length());
            helper2(rem, ans + ch, list);
        }
    }

    public static ArrayList<String> printPermuation3(String str) {
        ArrayList<String> ans = new ArrayList<>();
        if (str.length() == 0) {
            ans.add("");
            return ans;
        }

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String rem = str.substring(0, i) + str.substring(i + 1, str.length());
            ArrayList<String> remPermutation = printPermuation3(rem);

            for (String p : remPermutation) {
                ans.add(ch + p);
            }
        }
        return ans;

    }

}


// loop - 3,4,5,7,8,9,11,12,14,15,
// pattern- 1,4,5,6,7,8,9, 10,11,12,14,16,18,26,28,29,30,31,32
// array 7,10,13,15,18,20,21,24,25,29,31,32,33
// 2D - 9,10,14,15,16,17 to 21
// String - 16,15,14,13,12,11,9,8,7,5,4,2
// leetcode 9,231,509,1518,1,989,1464,4,268,27,977,167,238,319,747,11
// leetsync
// gfg sd sheet
