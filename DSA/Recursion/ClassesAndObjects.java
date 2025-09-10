public class ClassesAndObjects {
    public static void main(String[] args) {
        Shirt s1 = new Shirt();
        s1.type = "formal";
        s1.price = 300;

        s1.printDetails();
    }
}


class Shirt {
    String type;
    int price;

    public void printDetails () {
        System.out.println(this.type);
        System.out.println(this.price);
    }
}