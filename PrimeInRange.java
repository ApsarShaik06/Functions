import java.util.Scanner;

/*
Enter the range : 
100
2 3 5 7 11 13 17 19 23 29 31 37 41 43 47 53 59 61 67 71 73 79 83 89 97 
*/
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
        
        public static void primeInRange(int n) {

            for(int i = 2; i <= n; i++){
                if(isPrime(i)){ // if true will print the digit.
                    System.out.print(i+" ");
                }
            }
        }
        public static void main(String[] args) {
        // check given number is prime or not.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range : ");
        int n = sc.nextInt();
        primeInRange(n);
    }
        
            
}
