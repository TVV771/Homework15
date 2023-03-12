import java.util.function.Function;

public class Func3 {
    public static void main(String[] args) {

        Function<Double, Long> function1 = new Function<Double, Long>() {
            @Override
            public Long apply(Double aDouble) {
                return Math.round(aDouble);
            }
        };

        Function<Double, Long> function2 = Math::round;
        Function<Double, Long> function3 = s -> Math.round(s);


    }
}
