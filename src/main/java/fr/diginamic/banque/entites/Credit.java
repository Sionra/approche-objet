package fr.diginamic.banque.entites;

public class Credit extends Operation {
    public Credit(String date, double ammount) {
        super(date, ammount);
    }

    @Override
    public String getType() {
        return "CREDIT";
    }
}
