import java.util.Scanner;
/*
Enter 3 number : 
4
7
3
The average of 4, 7, and 3 is : 4.0
*/
public class Function {
         
        public static double avgOfNUms(int a, int b, int c) {
            double avg = (a+b+c)/3;
            return avg;
        }
        
        public static void main(String[] args) {
        // Write a Java method to compute the averageof three numbers.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 number : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println("The average of "+a+", "+b+", and "+c+" is : " + avgOfNUms(a,b,c));
    }       
}
