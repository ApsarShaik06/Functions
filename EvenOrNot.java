import java.util.Scanner;
/*
Enter a number : 
5
false
--------------
Enter a number : 
4
true
*/
public class Function {
        
        public static boolean isEven(int n) {
            if( n % 2 == 0){
                return true;
            }

            return false;
        }
        
        public static void main(String[] args) {
        /*
        Write a method named isEven that accepts an int argument.
        The method should return true if the argument is even, or false otherwise.
        Also write a program to test your method
        */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();

        System.out.println(isEven(n));
    }       
}
