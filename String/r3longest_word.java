
public class r3longest_word {
public static void main(String[] agrs){
    String str = " priyanshu is theeeeeeeee best";
System.out.println(check_length(str));
}    
public static int check_length(String str){
    if(str.length() == 0){
        return 0;
    }
   String maxString ="";
    String ans ="";
    int result =0;
    int count =0;
    for(int i = 0; i<str.length(); i++){
        char ch = str.charAt(i);
        if(ch !=' '){
           ans +=ch;
            count++;
        }
        else{
            if(result < count){
            count = result;
            maxString= ans;
        }
        }
        maxString = "";
        count =0;
        if (result <= count) {
                result = count;
             maxString = ans; 
            }
        
    }
    return count;
}
}
