package refactoring;

import java.io.InputStream;
import java.util.Scanner;

public class View {

    private Scanner in;

    public View(InputStream in) {
        this.in = new Scanner(in);
    }

    public void printMessage(String message) {
        System.out.println(message);
    }

    public void printMessage(int message) {
        System.out.println(message);
    }

    public int receiveVariable(String variableName) {

        System.out.print(String.format("Enter %s: ", variableName));

        while (!in.hasNextInt()) {
            printMessage(String.format("Wrong input! Repeat input %s", variableName));
            in.next();
        }
        return in.nextInt();
    }

}
