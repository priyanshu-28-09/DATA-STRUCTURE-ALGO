//package pattern;

public class pattern4 {
    public static void main(String [] args){
        int n = 5;
       for(int row = 1; row <= n; row++){ // cursor
            // for sp
            for(int sp = 1; sp <=(row-1); sp++){
                System.out.print(" ");
            }
            

              for(int st = 1 ; st<=(n+1-row);st++){
                    System.out.print("*");
            }
            System.out.println();
       }

    }

}
