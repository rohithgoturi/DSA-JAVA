public class Recursion5 {
    public static void PrintFibo(int a, int b, int n){

        if(n==0){
            return;
        }

        System.out.print(a+" ");
        PrintFibo(b, a+1, n-1);
    }

    public static void main (String args[]){
        PrintFibo(0, 1, 5);
    }
}
