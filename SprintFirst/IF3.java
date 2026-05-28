package SprintFirst;
import java.util.*;
public class IF3 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        double s1 = sc.nextDouble();
        double s2 = sc.nextDouble();
        double s3 = sc.nextDouble();
       if(s1==s2 && s2==s3){
        System.out.println("eque");

       }
       else if( s1==s2&& s1!=s3|| s1==s3&& s3!=s2|| s2==s3&& s2!=s1){
        System.out.println(" iso");
       }else if( s1!=s2&& s2!=s3){
        System.out.println("sca");
       }

       }
    
    
}
