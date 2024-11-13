import java.util.Scanner;

public class Function {
        
        public static boolean isPrime(int n){

            if (n == 2){
                return true;
            }

            for(int i=2; i<=Math.sqrt(n); i++){
                if(n % i == 0){
                    return false;
                }
            }

            return true;
        }
         /* 
         --> Brute force approach as we are checking till n-1, is it dividing.
        public static boolean isPrime(int n){
            if (n == 2){
                return true;
            }

            for(int i=2; i<=n-1; i++){
                if(n % i == 0){
                    return false;
                }
            }

            return true;
        }
         */
        public static void main(String[] args) {
        // check given number is prime or not.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        if(isPrime(n)){
            System.out.println("Given number is Prime.");
        } else {
            System.out.println("Given number is not Prime.");
        }
    }
        
            
}
