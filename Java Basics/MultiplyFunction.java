import java.util.Scanner;

public class MultiplyFunction {
    public static int Product(int a, int b) {
        int product = a*b;
        return product;
    }

    public static void main(String args[]){
        int a,b,product;

        System.out.print("Enter the value of a & b : ");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();

        sc.close();

        product = Product(a,b);

        System.out.print("The product is : "+product);
    }
}
