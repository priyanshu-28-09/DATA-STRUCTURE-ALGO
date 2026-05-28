import java.util.*;
public class OfferItem {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int quantity = sc.nextInt();
        int price = sc.nextInt();

        if(quantity >100){
            int totalprice = quantity*price;
            // int totalexpenses = totalprice-totalprice*10/100;
            // System.out.println("total price "+totalexpenses);
            System.out.println("total price "+totalprice*0.9);
        }else{
            int total = quantity*price;
            System.out.println("total price "+total);
        }
    }
}
