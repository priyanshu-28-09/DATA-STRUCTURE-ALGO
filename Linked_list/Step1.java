// import java.util.*;
// public class Step1 {
//     public static void main(String[] args){
//         LinkedList list = new LinkedList();
//          list = insert(list, 1); 
//         list = insert(list, 2); 
//         list = insert(list, 3); 
//         list = insert(list, 4); 
//         list = insert(list, 5); 

//         print
//     }
// }
package Linked_list;
 import java.util.*;
 public class Step1 {
    // public static void main(String[] args){
    //     Scanner sc = new Scanner(System.in);
    //     LinkedList<Integer>list = new LinkedList<>();
    //     System.out.println(" Enter how many number you want");
    //     int nums = sc.nextInt();
    //     for(int i = 0; i<nums; i++){
    //         System.out.println("Enter Element at index " +i);
    //         list.add(sc.nextInt());

    //     }
    //     System.out.print(list +" ");

    //    // sc.close();
    //     }  
    // }
  

     public static void main(String[] args){

        LinkedList<Integer> ll = new LinkedList<>();
             Scanner sc = new Scanner(System.in);
            System.out.println(" Enter total count of element");
            int num = sc.nextInt();

            while(num>0){
                ll.add(sc.nextInt());
                num--;
                System.out.println(ll);
            }
     }
 }
