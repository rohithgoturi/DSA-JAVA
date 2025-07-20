import java.util.Scanner;

public class FactorialFunction {
    public static int Factorial(int n) {
        int fact=1;
        for(int i=1; i<=n; i++){
            fact = fact*i;
        }
        return fact;
    }

    public static void main(String args[]){
        int n, factorial;
        System.out.print("Enter any number : ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        sc.close();
        factorial = Factorial(n);
        System.out.print("Factorial is : "+factorial);
    }
}
