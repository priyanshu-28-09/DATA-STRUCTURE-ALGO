import java.util.*;
public class compare4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        
        if(a<b){
            if(a<c){
                if(a<d){
                    System.out.println("a small");
                }else{
                    System.out.println("d small");
                }
            }else{
                if(c<d){
                    System.out.println("c small");
                }else{
                    System.out.println("d small");
                }
            }
        }else{
            if(b<c){
                if(b<d){
                    System.out.println("b small");
                }else{
                    System.out.println("d small");
                }
            }else{
                if(c<d){
                    System.out.println("c small");
                }else{
                    System.out.println("d small");
                }
            }
        }
    }
}


