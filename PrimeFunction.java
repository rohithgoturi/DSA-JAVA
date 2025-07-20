import java.util.Scanner;

public class PrimeFunction {
    public static int PrimeNumber (int n){
        int count=0;
        if(n<=1){
            System.out.print(n+ " is not a prime number");
        }

        for(int i=2; i<=n/2; i++){
            if(n%i==0){
                count++;
                break;
            }
        }

        if(count==0){
            System.out.print(n+ " is a prime number");
        }
        else {
            System.out.print(n+ " is not a prime number");
        }

        return 0;

    }

    public static void main(String args[]){
        int n;
        System.out.print("Enter n = ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        sc.close();
        PrimeNumber(n);
    }
}
