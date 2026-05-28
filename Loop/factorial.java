import java.util.*;
public class factorial {
    public static void main(String[] args){
        int s =5;
       
        //for(int i = 1; i<=5; i ++){
            for(int i= 5; i>=1; --i){
            s = s*i;
            System.out.println(s);
        }
    }
}
