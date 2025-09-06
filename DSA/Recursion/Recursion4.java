public class Recursion4 {
    public static int fact(int n){
        if(n==0){
            return 1;
        }
        int facto = fact(n-1);
        int factorial = n*facto;
        return factorial;
    }

    public static void main (String args[]){
        int n = 5;
        int result = fact(n);
        System.out.print(result);
    }
}