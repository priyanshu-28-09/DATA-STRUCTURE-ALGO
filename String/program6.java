package String;

public class program6 {
         public static void main(String[] args){
        String str = "Priyanshu Vishwakarma is the best";
       
        int count =0 ;
        for(int i =0; i<str.length(); i++){
            if(str.charAt(i) == ' '){
                count++;

        }
           }
           String  str2 = "";
           for(int i =0 ; i<str.length(); i++){
            if(str.charAt(i) != ' '){
                str2  = str2 + str.charAt(i);
            }
           }System.out.println(str2);
}

}
