 package String;

public class program2 {

    public static void main(String[] args){
         String str = "radar";
System.out.print(chack(str));
    }

public static boolean chack(String str){
         String ans = "";

         if(str.length() ==0 && str.length() == 1){
            return true;
         }
        int  p1= 0;
        int p2 = str.length()-1;
         while(p1<p2){
        
            if(str.charAt(p1) != str.charAt(p2)){
                return false;
            }
                p1++;
                p2--;   
     }
     return true;
    }

    public static String convert( String str){
        if(str.length() == 0){
            return str;
        }
        
    }
}



