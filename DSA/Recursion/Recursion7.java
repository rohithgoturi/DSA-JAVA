public class Recursion7 {
    public static int PrintPower(int x, int n){
        if (n == 0){
            return 1;
        }

        if (x == 0){
            return 0;
        }

        if ( n%2 == 0){
            return PrintPower(x, n/2) * PrintPower(x, n/2);
        }
        else{
            return x * PrintPower(x, n/2) * PrintPower(x, n/2);
        }
    }

    public static void main(String args[]){
        int x = 5, n = 3;
        int output = PrintPower(x, n);
        System.out.print(output);
    }
}
