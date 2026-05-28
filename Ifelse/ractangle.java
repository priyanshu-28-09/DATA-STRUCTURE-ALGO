import java.util.*;

public class ractangle {
  public static void main(String[] args){
     // You are given two integers that are the length and breadth of the rectangle. Check whether the area or perimeter is greater 
    Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int b  = sc.nextInt();
        int area = l *b;
        System.out.println("Area of ractangle : " +area +"m^2");
        int perimeter = 2*(l+b);
        System.out.println("perimeter of ractangle : " +perimeter +"m");
        if(area < perimeter){
            System.out.println("perimeter is greter then area");
        }else{
            System.out.println("perimeter is less then area");
        }
  }  
}
