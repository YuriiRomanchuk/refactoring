package refactoring.arithmetic;

public class StringOperation implements ArithmeticOperation<String> {
    public String calculate(String a, String b) {
        try {
            return a + b;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
