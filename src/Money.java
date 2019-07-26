public class Money {
    private Currency currency;
    private int amount;

    public Money(Currency currency, int amount) {
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

    public int getAmount() {
        return amount;
    }

    public Money(){};
}