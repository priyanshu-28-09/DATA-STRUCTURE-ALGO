package String;

public class R5_RemoveSpace {
     public static void main(String[] args){
       String str = "hello world java";
       System.out.println(remove(str));
    }

    public static String remove(String str){
        String res="";

        for(int i=0;i<str.length();i++)
            if(str.charAt(i)!=' ')
                res+=str.charAt(i);

        return res;
    }

   
}


