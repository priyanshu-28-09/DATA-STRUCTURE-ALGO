package String;

public class program1 {
    public static void main(String[] args){
         String str = "radar";
System.out.print(chack(str));
    }

public static boolean chack(String str){
         String ans = "";
        
         for(int i = str.length()-1; i>0; i--){
            char ch = str.charAt(i);
                ans +=ch;
                if(str.equals(ans)){
                    return true;
                }  else{
                    return false;
                }          
         }
         
    }

}