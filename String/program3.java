package String;

public class program3 {
    public static void main(String[] args){
        String str = " Priyanshu Vishwakarma is ";
        int count  = 0;
        for(int i =0 ; i<str.length(); i++){
            char ch   = str.charAt(i);
            if(ch == 'a'||ch == 'A'||ch == 'e'||ch == 'E'||ch == 'I'||ch == 'i'||ch == 'O'||ch == 'o'||ch == 'U'||ch == 'u'){
                count++;
            }
           
        }
         System.out.println(count);
    }
}
