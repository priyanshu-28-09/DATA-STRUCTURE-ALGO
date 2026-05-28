package Revision_sheet;

public class R14 {
    public static void main(String[] args){
        System.out.println(remove("programming"));
    }
     public static String remove(String str){
        String res="";

        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            if(res.indexOf(c)==-1)
                res+=c;
        }

        return res;
    }

}
