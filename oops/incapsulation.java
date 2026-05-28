public class incapsulation {
   int age;
   String name;
    public void incap(){
    System.out.println(" write any thing");
    }


}
class oops{
    public static void main(String[] args){
        incapsulation s1 = new incapsulation();
        s1.age = 21;
        s1.name = "priyanshu";
        s1.incap();
    }
}
