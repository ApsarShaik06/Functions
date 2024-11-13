import java.util.Scanner;
/*
Enter Binary number : 
10100011
The decimal number is : 163
------------
Enter Binary number : 
1001
The decimal number is : 9
*/
public class Function {
         
        public static int binToDec(int n){
            int decimal = 0;
            int pow =0;

            // while run the loop till th given number becomes zero.
            while (n != 0) {
                int LD = n % 10; // LD- it will give the last digit in the number.
                decimal += LD*Math.pow(2,pow); // adding each and assigning to decimal varible.
                pow++; // increasing pow by 1.
                n = n/10; // will remove the last digit from n.
            }

            return decimal;
        }
        public static void main(String[] args) {
        // Convert Binary to Decimal.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Binary number : ");
        int n = sc.nextInt();
        System.out.println("The decimal number is : " + binToDec(n));
    }       
}
