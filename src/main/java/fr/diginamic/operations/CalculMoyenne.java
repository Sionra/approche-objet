package fr.diginamic.operations;

import java.util.ArrayList;

public class CalculMoyenne {
    private ArrayList<Double> doubleList;

    public CalculMoyenne() {
        this.doubleList = new ArrayList<>();
    }

    public void addDouble(double val) {
        this.doubleList.add(val);
    }

    public double calcul() {
        double result = 0;
        for (double value : doubleList) {
            result += value;
        }
        return result / this.doubleList.size();
    }
}
