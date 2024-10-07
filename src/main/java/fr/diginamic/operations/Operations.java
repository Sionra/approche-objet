package fr.diginamic.operations;

public class Operations {
    public static double calcule(double a, double b, char operateur) {
        switch (operateur) {
            case '-':
                return a - b;
            case '+':
                return a + b;
            case '*':
                return a * b;
            case '/':
                return a / b;
            default:
                return 0.0;
        }
    }
}
