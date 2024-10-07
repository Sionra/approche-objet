package fr.diginamic.banque.entites;

public class Debit extends Operation {
    public Debit(String date, double ammount) {
        super(date, ammount);
    }

    @Override
    public String getType() {
        return "DEBIT";
    }
}
