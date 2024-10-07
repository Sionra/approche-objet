package fr.diginamic.essais;

import fr.diginamic.operations.Operations;

public class TestOperations {
    public static void main(String[] args) {
        int a = 2;
        int b = 10;

        System.out.println(a + " - " + b + " = " + Operations.calcule(a, b, '-'));
        System.out.println(a + " + " + b + " = " + Operations.calcule(a, b, '+'));
        System.out.println(a + " * " + b + " = " + Operations.calcule(a, b, '*'));
        System.out.println(a + " / " + b + " = " + Operations.calcule(a, b, '/'));
    }
}
