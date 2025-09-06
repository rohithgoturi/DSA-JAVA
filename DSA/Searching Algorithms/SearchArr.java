import java.util.Scanner;

public class SearchArr {
    public static void main (String args[]){
        int size;
        System.out.print("Eneter size of array: ");
        Scanner sc = new Scanner(System.in);
        size = sc.nextInt();
        int [] arr = new int[size];
        System.out.print("Enter Element : ");
        int element = sc.nextInt();

        System.out.print("Insert Array Elements: ");

        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }

        for(int i=0; i<arr.length; i++){
            if(arr[i]==element){
                System.out.print("Element found at  "+i);
            }
            else{
                System.out.print("Element not found");
            }
        }
        sc.close();
    }
}
