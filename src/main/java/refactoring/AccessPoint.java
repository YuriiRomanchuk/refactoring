package refactoring;

import refactoring.arithmetic.*;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class AccessPoint {

    private View view;

    public AccessPoint(View view) {
        this.view = view;
    }

    public void startProgram() {

        List<Consumer<View>> operations = receiveOperations(view.receiveVariable("a"), view.receiveVariable("b"));

        for (Consumer<View> operation : operations) {
            operation.accept(view);
        }
    }


    private List<Consumer<View>> receiveOperations(int a, int b) {

        List<Consumer<View>> operations = new ArrayList<>();

        operations.add((view) -> view.printMessage(new Plus().calculate(a, b)));
        operations.add((view) -> view.printMessage(new Minus().calculate(a, b)));
        operations.add((view) -> view.printMessage(new Division().calculate(a, b)));
        operations.add((view) -> view.printMessage(new Multiplication().calculate(a, b)));
        operations.add((view) -> view.printMessage(new StringOperation().calculate(String.valueOf(a), String.valueOf(b))));

        return operations;
    }


}
