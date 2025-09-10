class Person {
    String name;
    int age;

    Person() {
        System.out.println("The default constructor was called!!");
    }

    public void showDetails () {
        System.out.println(this.name);
        System.out.println(this.age);
    }
}


public class DefaultConstructor {
    public static void main(String[] args) {

        Person p1 = new Person();
        p1.name = "Rohith";
        p1.age = 20;

        p1.showDetails();
    }
}
