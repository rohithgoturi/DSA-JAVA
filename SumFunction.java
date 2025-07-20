import java.util.Scanner;

public class SumFunction {
    public static int SumFunctn (int a, int b){
        return a+b;
    }

    public static void main(String args[]){
        int a, b;
        System.out.print("Enter a & b : ");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        sc.close();
        System.out.println(SumFunctn(a,b));
    }
}
