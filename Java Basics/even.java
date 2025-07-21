import java.util.*;

public class even {
    public static void main (String[] args) {
        int n;
        System.out.print("Enter the value of n : ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        sc.close();

        // for(int i=0; i<=n; i++){
        //     if(i%2==0){
        //         System.out.println(i);
        //     }
        // }

        //efficient way
        for(int i=0; i<=n; i+=2){
            System.out.println(i);
        }

    }
}
