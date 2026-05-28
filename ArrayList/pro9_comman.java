package ArrayList;

import java.util.ArrayList;

public class pro9_comman {
     public static void main(String[] args){
     ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(12);
        list1.add(14);
        list1.add(15);
        list1.add(13);

        
     ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(13);
        list2.add(14);
        list2.add(15);
        list2.add(16);

        int count =0;
      for(int i = 0 ; i<list1.size(); i++){
        for(int j =0; j<list2.size(); j++){
            if(list1.get(i)== list2.get(j)){
                
                System.out.println(list1.get(i));
                count++;
            }
        }
      }


}
}