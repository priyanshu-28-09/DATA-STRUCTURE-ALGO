import java.util.*;
public class hiring {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
         System.out.println("Enter status ");
        char status = sc.next().charAt(0);
         System.out.println("Enter gender ");
        char gender = sc.next().charAt(0);
        System.out.println("Enter age ");
        int age = sc.nextInt();
        if(status =='m' || status=='M'){
            //System.out.println("hired");
         if ((gender == 'M' || gender =='m') && age >30){
            System.out.println("hired");
               }
               else{
                 System.out.println("not hired ");
               }
        if ((gender == 'f' || gender =='F') && age >25){
            System.out.println("hired");
        }
        else {
            System.out.println("not hired ");
        }
    }else {
         System.out.println("not hired ");
    }


    }
}
