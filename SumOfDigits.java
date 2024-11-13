import java.util.Scanner;
/*
Enter a number : 
123
Sum of Digits of 123 is : 6
---------
Enter a number : 
687315413
Sum of Digits of 687315413 is : 38
*/
public class Function {
        
        public static int sumOfDigitsInNum(int number) {
            int sum =0;

            while( number > 0) {
                int LD = number % 10; // taking last digit ( reminder of num)
                sum += LD; // adding each LD in sum.

                number = number/10; //reducing num.
            }
            return sum;
        }
        public static void main(String[] args) {
        /*
        Write a Java method to compute the sum of the digits in an integer.
        */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();

        System.out.println("Sum of Digits of "+n+" is : "+sumOfDigitsInNum(n));
    }       
}
