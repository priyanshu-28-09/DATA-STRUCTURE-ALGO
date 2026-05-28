package Arrays;

public class Barchart {
    public static void main(String[] args){
        int[] data = {5,4,3,2,7,8,3,2,3};
        for(int i  = 0; i<data.length; i++){
            System.out.print(" Index" + i);
            for(int j = 0; j<data[i];j++){
                System.out.print("*");
            }
            System.out.println( "(" + data[i] + " )");
        }
    }
}