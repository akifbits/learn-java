public class MethodParameter {
    public static void main(String[] args) {
        sayHello("Nik", "Akif");
    }

    static void sayHello(String firstName, String lastName) {
        System.out.println("Hello "+ firstName + " " + lastName);
    }
}
