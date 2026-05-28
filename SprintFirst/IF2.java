package SprintFirst;
import java.util.*;
public class IF2 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);

        char ch = sc.next().charAt(0);
       if(ch >= 'A' && ch<='Z'){
        System.out.println("upper- case");

       }else{
        System.out.println("lower case");
       }
    }
}
