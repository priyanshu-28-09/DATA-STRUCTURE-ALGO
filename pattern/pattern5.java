// package pattern;

// public class pattern5 {
//     public static void main(String [] args){
//         int n = 5;
//        for(int row = 1; row <= n; row++){ // cursor
//             // for sp
//             for(int sp = 1; sp <=(n-row); sp++){
//                 System.out.print(" ");
//             }
            
//                 //star
//               for(int st = 1 ; st<=(2*row-1);st++){
//                     System.out.print("*");
//             }
//             System.out.println();
//        }

//     }

// }


//package pattern5;

public class pattern5 {
    public static void main(String [] args){
        int n = 5;
        int nst = 1;
       for(int row = 1; row <= n; row++){ // cursor
            // for sp
            for(int sp = 1; sp <=(n-row); sp++){
                System.out.print(" ");
            }
            
                //star
              for(int st = 1 ; st<=nst;st++){
                    System.out.print("*");
            }
            System.out.println();
            nst +=2;
       }

    }

}
