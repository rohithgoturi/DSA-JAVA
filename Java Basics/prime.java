import java.util.*;

public class prime{
    public static void main(String[] args){
        int n,count = 0;
        System.out.print("Enter n = ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        sc.close();
        for(int i=1; i<=n; i++){
            if(n%i==0){
                count++;
                if(count==2){
                    System.out.print("Entered number is prime");
                }
            }
        }
    }
}