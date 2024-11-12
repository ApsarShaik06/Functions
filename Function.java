import java.util.Scanner;

public class Function {

    public static int calculateSum(int num1, int num2) { //(num1, num2) are called as Parameters or Formal Parameters. 
        int sum = num1 + num2;
        return sum;
    }

    public static int calculateProd(int a, int b) {
        int prod = a * b;
        return prod;
    }

    public static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
        System.out.println("A value after swapping : "+a);
        System.out.println("B value after swapping : "+b);
    }
    public static int factorial(int n) {
        int fact =1; // factorial of n = n*(n-1)*(n-2)*....3*2*1  and 1! = 1 as well as 0! = 1.

        for (int i=1; i<=n; i++){
            fact *=i;
        }
        return fact;
    }

    public static int binomialCoeff(int n, int r) {
        //formula for Binomial Coefficient is nCr = n!/(r!*(n-r)!)
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_nmr = factorial(n-r);

        int binCoeff = fact_n / (fact_r * fact_nmr);
        return binCoeff;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int sum = calculateSum(a, b); // (a,b) are called as Actual Parameters or Arguments.
        System.out.println("Sum of a and b is : "+sum);

        int multiply = calculateProd(a, b);
        System.out.println("Product of a and b is : "+multiply);
        
        swap(a, b);
        System.out.println("After swapping the values are \nA : "+a+"\nB : "+b); 
        // In java, only Call by value will work 
        // ( means the arguments which we are passing to a function they are just copy of the original values).
        //  So If you change anything inside function, it's won't effect/change in main function.
        // for example analyse the swap fuction. and below print statment which is in main function.
        
        int factorialOfn = factorial(a);
        System.out.println("Factorial of "+a+" is : "+factorialOfn);

        int binomialCoefficient = binomialCoeff(a, b);
        System.out.println("Binomial Coefficient of a , b is : "+binomialCoefficient);
    }
        
            
}
