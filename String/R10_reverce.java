package String;

public class R10_reverce {
     public static void main(String[] args){
        System.out.println(reverse("I love Java"));
    }
    static String reverse(String str){
        String w[]=str.split(" ");
        String res="";

        for(int i=w.length-1;i>=0;i--)
            res+=w[i]+" ";

        return res.trim();
    }

   

}
