import java.util.*;

public class NameFunction {
    public static void PrintName(String name) {
        System.out.print(name);
        return;
    }

    public static void main (String args[]) {
        String name;
        System.out.print("Enter Your name : ");
        Scanner sc = new Scanner(System.in);
        name = sc.next();
        sc.close();
        PrintName(name);
    }
}
