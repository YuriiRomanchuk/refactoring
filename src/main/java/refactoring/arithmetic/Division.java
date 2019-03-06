package refactoring.arithmetic;

public class Division implements ArithmeticOperation<Integer> {

    public Integer calculate(Integer a, Integer b) {

        try {
            return a / b;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
