import java.util.function.Supplier;

public class Rand {
    public static void main(String[] args) {

        Supplier<Integer> supplier1 = new Supplier<Integer>() {
            @Override
            public Integer get() {
                return (int) (Math.random() * 100);
            }
        };

        Supplier<Integer> supplier2 = () -> (int) (Math.random() * 100);

    }
}
