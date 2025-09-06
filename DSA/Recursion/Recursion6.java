public class Recursion6 {
    public static int PrintPower(int x, int n){
        if(n==0){
            return 1;
        }

        if(x == 0){
            return 0;
        }

        int x0 = PrintPower(x, n-1);
        int xn = x*x0;
        return xn;
    }

    public static void main (String args[]){
        int x = 5, n = 3;
        int output = PrintPower(x, n);
        System.out.print(output);
    }
}
