package fr.diginamic.listes;

import java.util.ArrayList;

public class TestListeInt {
    public static void main(String[] args) {
        ArrayList<Integer> listInt = new ArrayList<>();
        int plusGrand, plusPetit, indexPP;
        listInt.add(-1);
        listInt.add(5);
        listInt.add(7);
        listInt.add(3);
        listInt.add(-2);
        listInt.add(4);
        listInt.add(8);
        listInt.add(5);

        System.out.println(listInt);
        System.out.println("Taille de la liste : " + listInt.size());

        plusGrand = listInt.getFirst();
        plusPetit = listInt.getFirst();
        indexPP = 0;
        for (int i = 0; i < listInt.size(); i++){
            if (listInt.get(i) > plusGrand){
                plusGrand = listInt.get(i);
            }
            if ( plusPetit > listInt.get(i) ){
                plusPetit = listInt.get(i);
                indexPP = i;
            }
        }
        System.out.println("Plus grande valeur de la liste : " + plusGrand);
        listInt.remove(indexPP);
        System.out.println(listInt);

        for (int i = 0; i < listInt.size(); i++) {
            if (listInt.get(i) < 0){
                listInt.set(i, -listInt.get(i));
            }
        }
        System.out.println(listInt);
    }
}
