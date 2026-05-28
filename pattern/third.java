//package pattern;

public class third {
    public static void main(String [] args){
        int n = 5;
        for(int row = 1; row <=n; row ++){// starting cursor
            // print space
            for(int sp = 1; sp<=(n-row); sp++){
                System.out.print("   ");

            }for(int st = 1; st <= row; st++){
                System.out.print(" * ");
            }System.out.println();

}

    }
}
