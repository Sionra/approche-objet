package fr.diginamic.banque.entites;

public abstract class Operation {
    public String date;
    public double ammount;

    public Operation(String date, double ammount) {
        this.date = date;
        this.ammount = ammount;
    }

    public abstract String getType();
}
