package refactoring;

public class Main {

    public static void main(String[] args) {

        AccessPoint accessPoint = new AccessPoint(new View(System.in));
        accessPoint.startProgram();
    }

}