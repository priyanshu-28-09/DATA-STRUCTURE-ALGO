package Revision_sheet;

public class R6 {
    public static void main(String[] args) {
         int[] a = {1,2,3,4,5};
        int[] b ={0,2,8,9,1,4,5};
        for(int i = 0; i<a.length; i++){
            for(int j = 0; j<b.length;j++){
                if(a[i] == b[j]){
                    System.out.println(a[i]);
                }
            }
        }
    }
}
