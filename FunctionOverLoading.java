import java.util.Scanner;
/*
4
3
6
3.2
4.8
Sum of 2 integers : 7
Sum of 3 integers : 13
Sum of 2 nums(float, int) : 6.2
Sum of 2 nums(float, float) : 8.0
Sum of 2 nums(int, float) : 8.8
*/
public class Function {
        // Function OverLoading 
        // Multiple functions with the same name but different parameters.
        
        // func to calculate sum of 2 nums
        public static int sum(int a, int b) {
            return a + b;
        }

        // func to calculate sum of 3 nums
        public static int sum(int a, int b, int c) {
            return a + b + c;
        }

        // func to calculate sum of 2 float
        public static float sum(float a, float b) {
            return a + b;
        }

        // func to calculate sum 
        public static float sum(int a, float b) { // first parameter is Type Int and 2nd one is float
            return a + b;
        }
        
        public static float sum(float a, int b) { // first parameter is Type float and 2nd one is int
            return a + b;
        }

        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        float x = sc.nextFloat();
        float y = sc.nextFloat();

        System.out.println("Sum of 2 integers : " +sum(a, b));
        System.out.println("Sum of 3 integers : "+sum(a, b, c));
        System.out.println("Sum of 2 nums(float, int) : "+sum(x, b));
        System.out.println("Sum of 2 nums(float, float) : "+sum(x, y));
        System.out.println("Sum of 2 nums(int, float) : "+sum(a, y));
    }
        
            
}
