import java.util.function.Consumer;

public class Name {
    public static void main(String[] args) {

        Consumer<String> consumer1 = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println("Hello " + s + "!");
            }
        };

        Consumer<String> consumer2 = s -> System.out.println("Hello " + s + "!");
        consumer2.accept("PAVEL");
        consumer2.accept("NASTYA");

    }
}
