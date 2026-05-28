import java.util.*;
public class checkcharacter {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
       // int as = (int) ch;
        // if(as >= 97 && as<=120)
        // {
        //   System.out.println(" lower");  
        // }
        // else if(as >= 65 && as<=90){
        //   System.out.println(" upper");  
        // }else{
        //     System.out.println("not");
        // }
        
        if(ch >='a' && ch <='z')
        {
          System.out.println(" lower");  
        }
        else if(ch >='A' && ch <='Z'){
          System.out.println(" upper");  
        }else{
            System.out.println("not");
        
    }
}
}
