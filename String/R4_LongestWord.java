package String;
public class R4_LongestWord {
public static void main(String[] args){
        System.out.println(longestWord("I love programming"));
    }

    static int longestWord(String str){
        String words[]=str.split(" ");
        int max=0;

        for(int i=0;i<words.length;i++)
            if(words[i].length()>max)
                max=words[i].length();

        return max;
    }

    
}
