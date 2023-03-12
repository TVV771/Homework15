import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {

        Predicate<Integer> predicate1 = new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                if (integer < 0) {
                    return false;
                }
                return true;
            }
        };

        Predicate<Integer> predicate2 = x -> x > 0;
        System.out.println(predicate1.test(-100));
        System.out.println(predicate2.test(100));

    }

}