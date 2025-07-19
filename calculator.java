import java.util.*;

public class calculator{
    public static void main(String[] args){
        System.out.print("Enter operator : ");
        Scanner sc = new Scanner(System.in);
        String operator = sc.next();

        //reading numbers
        System.out.print("Enter value of a = ");
        float a = sc.nextFloat();
        System.out.print("Enter value of b = ");
        float b = sc.nextFloat();

        float result;

        //OPERATOR SELECTION USING SWITCH CONDITION
        switch(operator){
            case "*" : result = a*b;
            System.out.println("Product = "+result);
            break;

            case "/" : result = a/b;
            System.out.println("Division = "+result);
            break;

            case "+" : result = a+b;
            System.out.println("Sum = "+result);
            break;

            case "-" : result = a-b;
            System.out.println("Sum = "+result);
            break;

            default : System.out.println("Enter a valid operator");
            break;

        }

        sc.close();

    }
}