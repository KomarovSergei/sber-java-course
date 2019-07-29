package general;

public class ConvertData {
    private Client client;
    private Money money;
    private Currency currency;

    public ConvertData(Client client, Money money, Currency currency) {
        this.client = client;
        this.money = money;
        this.currency = currency;
    }

    public ConvertData(){};
}