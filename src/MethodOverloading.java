public class MethodOverloading {

    public static void main(String[] args) {
        sayHello();
        sayHello("mail");
        sayHello("is", "mail");
    }

    static void sayHello() {
        System.out.println("hello");
    }

    static void sayHello(String name) {
        System.out.println("hello "+ name);
    }

    static void sayHello(String firstName, String lastName) {
        System.out.println("hello " + firstName + " "+ lastName);
    }
}
