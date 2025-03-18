interface Greeting {
    void greet();
}

public class Main {
    public static void main(String[] args) {
        String name = "Alice"; // Effectively final variable

        Greeting greeting = new Greeting() {
            @Override
            public void greet() {
                System.out.println("Hello, " + name + "!");
            }
        };

        greeting.greet();
    }
}
