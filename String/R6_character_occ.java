package String;

public class R6_character_occ {
    public static void main(String[] args){
        String str = " priyanshu vishwakarma";
        char ch = 'a';
        System.out.println(count(str,ch));
    }
   
    public static int count(String str,char ch){
        int c=0;

        for(int i=0;i<str.length();i++)
            if(str.charAt(i)==ch)
                c++;

        return c;
    }

    
}


