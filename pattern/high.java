import java.util.*;
public class high {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n1 = sc.nextInt();
    int n2 = sc.nextInt();
    int n3 = sc.nextInt();
    int n4 = sc.nextInt();
     
    if(n1>n2&&n1>n3&&n1>n4){
        System.out.println(" n1  great");
    }else if(n2>n1&&n2>n3&&n2>n4){
        System.out.println(" n2 great ");
    }else if(n3>n2&&n3>n4&&n3>n1){
        System.out.println(" n3  great");
    }else{
        System.out.println(" 4n great");
    }
  }  
}
