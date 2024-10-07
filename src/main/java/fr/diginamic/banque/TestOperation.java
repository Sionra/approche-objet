package fr.diginamic.banque;

import fr.diginamic.banque.entites.Credit;
import fr.diginamic.banque.entites.Debit;
import fr.diginamic.banque.entites.Operation;

import java.util.ArrayList;

public class TestOperation {
    public static void main(String[] args) {
        ArrayList<Operation> tableOperation = new ArrayList<>();
        double totalOperation = 0;

        tableOperation.add(new Credit("2024/10/07", 500.34));
        tableOperation.add(new Debit("2024/10/07", 5.24));
        tableOperation.add(new Debit("2024/10/07", 35.21));
        tableOperation.add(new Credit("2024/10/07", 10));
        tableOperation.add(new Credit("2024/10/07", 210.83));
        tableOperation.add(new Debit("2024/10/07", 31.1));
        tableOperation.add(new Debit("2024/10/07", 400.21));
        tableOperation.add(new Credit("2024/10/07", 2));

        for (Operation value : tableOperation){
            if (value.getType().equals("DEBIT")){
                totalOperation -= value.getAmmount();
            } else {
                totalOperation += value.getAmmount();
            }
            System.out.println("Date : " + value.getDate() + " | " + value.getType() + " | Valeur : " + value.getAmmount() + "€");
        }

        System.out.println("Total des opération : " + String.format("%.2f", totalOperation) + '€');
    }
}
