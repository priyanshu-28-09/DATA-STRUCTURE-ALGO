// import java.util.*;
// public class fisrtclass {
//     public static void main(String [] args){
//          Scanner sc = new Scanner(System.in);
//          int n = sc.nextInt();
//  if(n > 0){
//                 System.out.print("positive");
//             }else if ( n < 0){
//                 System.out.println("not valid");
         
//                }   }
//     }

//         // System.out.println("hello");
//         // System.out.println(234);
//         //  // System.out.println("234");
//         // System.out.print("Priyanshu ");
//         // System.out.println("Vishwakarma");
//         // String s = "priynshu";
//         // int age = 21;

//         // System.out.println("print word = " + s + " your age" +age);

//                        //number positive or nagative
//                        Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the number : ");
//         int n = sc.nextInt();

//         // System.out.println("Enter the String : ");
//         // String str = sc.next();

//         // System.out.println("Enter the value of double : ");
//         // double db = sc.nextDouble();

//         // System.out.println("Enter the Character : ");
//         // char ch = sc.next().charAt(0);
//         //     System.out.println("there is all value " + n +" -> String  :" +str + " ->value" +db + " ->char" + ch); 
        


//             // VOTING
            
//             if(n > 0){
//                 System.out.print("positive");
//             }else if ( n < 0){
//                 System.out.println("not valid");
//             }
//     }
    
// }
// // 3


// import java.util.*;
// public class fisrtclass {
//     public static void main(String [] args){
//       Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the character : ");
//          char ch = sc.next().charAt(0);
//          if(ch >='A' && ch <='Z'){
//              System.out.println("upper case : ");
//          }else if(ch >='a' && ch <='z'){
//             System.out.println("lower case : ");
//          }else{
//             System.out.println("Invalid : ");
//          }
         
//     }
//     }

        // 2

//         import java.util.*;
// public class fisrtclass {
//     public static void main(String [] args){
//       Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the character : ");
//          char ch = sc.next().charAt(0);
//          if(ch =='A' || ch =='E'||ch =='I' || ch =='O'||ch =='U'){
//              System.out.println("upper case vowel : ");
         
//          } else if(ch =='a' || ch =='e'||ch =='i' || ch =='o'||ch =='u'){
//              System.out.println("lower case vowel : ");
//          }else{
//             System.out.println("consonant: ");
//          }
         
//     }
//     }


            //  5
// import java.util.*;
// public class fisrtclass {
//     public static void main(String [] args){
//       Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number : ");
//         int month = sc.nextInt();
//         if(month == 1){
//             System.out.println("January");
//         }else if(month == 2){
//             System.out.println("February");
//         }else if(month == 3){
//             System.out.println("March");
//         }else if(month == 4){
//             System.out.println("April");
//         }else if(month == 5){
//             System.out.println("May");
//         }else if(month == 6){
//             System.out.println("June");
//         }else if(month == 7){
//             System.out.println("July");
//         }else if(month == 8){
//             System.out.println("August");
//         }else if(month == 9){
//             System.out.println("September");
//         }else if(month == 10){
//             System.out.println("October");
//         }else if(month == 11){
//             System.out.println("November");
//         }else if(month == 12){
//             System.out.println("December");
//         }else{
//             System.out.println("Invalid month number!");
//         }
//     }
// }


            // 18

//           import java.util.*;
// public class fisrtclass {
//     public static void main(String [] args){
//       Scanner sc = new Scanner(System.in);
//       int num1 = sc.nextInt();
//         int num2 = sc.nextInt();
//        System.out.print("Enter operator (+, -, *, /, %): ");
//         char op = sc.next().charAt(0);

//         double result;

//         if(op == '+') {
//             result = num1 + num2;
//             System.out.println("Result: " + result);
//         } else if(op == '-') {
//             result = num1 - num2;
//             System.out.println("Result: " + result);
//         } else if(op == '*') {
//             result = num1 * num2;
//             System.out.println("Result: " + result);
//         } else if(op == '/') {
//             if(num2 != 0)
//                 System.out.println("Result: " + (num1 / num2));
//             else
//                 System.out.println("Error: Division by zero!");
//         } else if(op == '%') {
//             if(num2 != 0)
//                 System.out.println("Result: " + (num1 % num2));
//             else
//                 System.out.println("Error: Division by zero!");
//         } else {
//             System.out.println("Invalid operator!");
//         }
// //     }
// // }

//10

// import java.util.*;
// public class MultipleOf5 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter an integer: ");
//         int num = sc.nextInt();

//         if(num % 5 == 0) {
//             System.out.println(num + " is a multiple of 5");
//         } else {
//             System.out.println(num + " is not a multiple of 5");
//         }
//     }
// }

//11

// import java.util.*;
// public class MultipleOf5And7 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter an integer: ");
//         int num = sc.nextInt();

//         if(num % 5 == 0 && num % 7 == 0) {
//             System.out.println(num + " is a multiple of both 5 and 7");
//         } else {
//             System.out.println(num + " is not a multiple of both 5 and 7");
//         }
//     }
// }



//11

// import java.util.*;
// public class DaysInMonth {
//      public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter year: ");
//         int year = sc.nextInt();
//         System.out.print("Enter month number (1-12): ");
//         int month = sc.nextInt();

//         int days = 0;

//         if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
//             days = 31;
//         } else if(month == 4 || month == 6 || month == 9 || month == 11) {
//             days = 30;
//         } else if(month == 2) {
//             // Leap year check
            
            
//                 days = 28;
//         } else {
//             System.out.println("Invalid month number!");
//             return;
//         }

//         System.out.println("Number of days: " + days);
//     }
// }
//    //8
//    import java.util.*;
// public class Youngest {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
        
//         System.out.print("Enter age of Ram: ");
//         int ram = sc.nextInt();
//         System.out.print("Enter age of Shyam: ");
//         int shyam = sc.nextInt();
//         System.out.print("Enter age of Ajay: ");
//         int ajay = sc.nextInt();
        
//         if(ram < shyam && ram < ajay) {
//             System.out.println("Ram is the youngest.");
//         } else if(shyam < ram && shyam < ajay) {
//             System.out.println("Shyam is the youngest.");
//         } else if(ajay < ram && ajay < shyam) {
//             System.out.println("Ajay is the youngest.");
//         } else {
//             System.out.println("Two or more have the same youngest age.");
//         }
//     }
// }


//9
// import java.util.*;
// public class EqualNumbers {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter first number: ");
//         int a = sc.nextInt();
//         System.out.print("Enter second number: ");
//         int b = sc.nextInt();
//         System.out.print("Enter third number: ");
//         int c = sc.nextInt();

//         if(a == b && b == c) {
//             System.out.println("All numbers are equal.");
//         } else {
//             System.out.println("Numbers are not equal.");
//         }
//     }
// }

// import java.util.*;
// public class EvenOdd {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter a number: ");
//         int num = sc.nextInt();

//         if(num % 2 == 0) {
//             System.out.println(num + " is Even");
//         } else {
//             System.out.println(num + " is Odd");
//         }
//     }
// }
