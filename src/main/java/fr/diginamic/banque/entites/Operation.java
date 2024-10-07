package fr.diginamic.banque.entites;

public abstract class Operation {
    private String date;
    private double ammount;

    public Operation(String date, double ammount) {
        this.date = date;
        this.ammount = ammount;
    }

    public double getAmmount() {
        return this.ammount;
    }

    public String getDate() {
        return this.date;
    }

    public abstract String getType();
}
