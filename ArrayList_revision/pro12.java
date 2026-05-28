package ArrayList_revision;

import java.util.ArrayList;
public class pro12 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6};
        ArrayList<Integer> list = new ArrayList<>();
        for(int i =0; i<nums.length; i++){
                list.add(nums[i]);
        }
        int max =  0;
        for(int i = 0 ; i<list.size(); i++){
            if(max < list.get(i));
            max = list.get(i);
        }

        for(int r = max; r>0; r--){
            for(int c = 0 ; c<list.size(); c++){
                int h = list.get(c);
                if(r <=h){
                    System.out.print(" * ");
                }else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}
