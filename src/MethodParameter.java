public class MethodParameter {

    public static void main(String[] args) {

        sayHello("is", "mail");
        sayHello("Nur", "Khasna");
    }

    static void sayHello(String firstName, String lastName) {
        System.out.println("Hello " + firstName + " " + lastName);
    }
}
