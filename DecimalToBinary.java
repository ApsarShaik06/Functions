import java.util.Scanner;
/*
Enter Decimal number : 
7
The binary number of 7 is : 111
-----------------
Enter Decimal number : 
4
The binary number of 4 is : 100
*/
public class Function {
         
        public static int decToBin(int n) {
            int binaryNum = 0;
            int pow = 0;

            while ( n > 0) {
                int reminder = n % 2; // we are diving with 2, because we are converting from base 10(Decimal) to base 2(Binary).
                binaryNum += reminder * Math.pow(10, pow);

                pow++; // increasing power by 1.
                n = n/2; // diving given n by 2, for reducing the number.
            }
            return binaryNum;
        }
        
        public static void main(String[] args) {
        // Convert Decimal to Binary.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Decimal number : ");
        int n = sc.nextInt();
        System.out.println("The binary number of "+n+" is : " + decToBin(n));
    }       
}
