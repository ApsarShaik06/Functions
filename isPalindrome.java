import java.util.Scanner;
/*
Enter a number : 
121
Given 121 is a Palindrome number
----------
Enter a number : 
1234
Given 1234 is a not Palindrome number
*/
public class Function {
        
        public static int reverseNum(int n) {
    
            int revNum = 0;

            while (n > 0) {
                int LD = n % 10; // reminder as last digit
                revNum = (revNum*10) + LD; // we are giving one extra space to placing new LD in our revNum. by multiplying our revNUm by 10.

                n = n/10; // reducing n 
            }
            return revNum;
        }
        
        public static boolean idPalindrome( int n) {
            int revOfn = reverseNum(n);

            if( revOfn == n) { // comparing original num with reverse num.
                return true;
            }

            return false;
        }
        public static void main(String[] args) {
        /*
        Write a Java program to check if a number is a palindrome in Java? (121 is a palindrome, 321 is not)
        A number is called a palindrome if the number is equal to the reverse of a number
        e.g.,121 is a palindrome because the reverse of 121 is 121 it self. On the other hand, 321 is not a 
        palindrome because the reverse of 321 is 123, which is not equal to 321
        */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();

        if(idPalindrome(n)){
            System.out.println("Given "+n+" is a Palindrome number");
        } else {
            System.out.println("Given "+n+" is a not Palindrome number");
        }
    }       
}
