import java.util.*;
public class triangle {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("1st angle : ");
        int First = sc.nextInt();
        System.out.print("2nd angle : ");
        int second = sc.nextInt();
        System.out.print("3rd angle : ");
        int third = sc.nextInt();
        int total = First + second+ third;
        if(total >180){
System.out.println("not valid");
        }else if(total < 180){
            System.out.println(" not valid");
        }else {
            System.out.println("valid");
        }
    }
}
