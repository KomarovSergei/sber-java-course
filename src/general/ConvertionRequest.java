package general;

public class ConvertionRequest {
    public Money money;
    public Currency currency;
    public Double fromRate;
    public Double toRate;

    private static int counter = 0;

    public ConvertionRequest(Money money, Currency currency, Double fromRate, Double toRate) {
        this.money = money;
        this.currency = currency;
        this.fromRate = fromRate;
        this.toRate = toRate;
        counter++;
    }

    public Money getMoney() {
        return money;
    }

    public Currency getCurrency() {
        return currency;
    }

    public Double getFromRate() {
        return fromRate;
    }

    public Double getToRate() {
        return toRate;
    }

    public ConvertionRequest(){ counter++; };
}
