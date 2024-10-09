package fr.diginamic.sets;

import java.util.HashSet;
import java.util.Iterator;

public class TestSetDouble {
    public static void main(String[] args) {
        HashSet<Double> hashDouble = new HashSet<>();
        double plusGrand = 0;
        double plusPetit = 0;

        hashDouble.add(1.5);
        hashDouble.add(8.25);
        hashDouble.add(-7.32);
        hashDouble.add(13.3);
        hashDouble.add(-12.45);
        hashDouble.add(48.5);
        hashDouble.add(0.01);

        System.out.println(hashDouble);

        Iterator<Double> iter = hashDouble.iterator();
        while (iter.hasNext()){
            double temp = iter.next();
            if (temp > plusGrand){
                plusGrand = temp;
            }
        }

        plusPetit = Integer.MAX_VALUE;
        for (double val : hashDouble){
            if (val < plusPetit){
                plusPetit = val;
            }
        }
        hashDouble.remove(plusPetit);
        System.out.println(hashDouble);
    }
}
