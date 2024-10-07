package fr.diginamic.essais;

import fr.diginamic.operations.CalculMoyenne;

public class TestMoyenne {
    public static void main(String[] args) {
        CalculMoyenne cm1 = new CalculMoyenne();
        CalculMoyenne cm2 = new CalculMoyenne();

        cm1.addDouble(1);
        cm1.addDouble(1);
        cm1.addDouble(1);
        cm1.addDouble(1);
        cm1.addDouble(1);

        cm2.addDouble(1);
        cm2.addDouble(2);
        cm2.addDouble(3);
        cm2.addDouble(4);
        cm2.addDouble(5);
        cm2.addDouble(6);
        cm2.addDouble(7);
        cm2.addDouble(8);
        cm2.addDouble(9);
        cm2.addDouble(10);

        System.out.println(cm1.calcul());
        System.out.println(cm2.calcul());

    }
}
