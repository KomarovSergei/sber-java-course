package general;

import general.Currency;

public class Money {
    private Currency currency;
    private double amount;

    public Money(Currency currency, double amount) {
        this.currency = currency;
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Money: " + this.currency
                + ", amount: " + this.amount;
    }

    public Currency getCurrency() {
        return currency;
    }

    public double getAmount() {
        return amount;
    }

    public Money(){};
}