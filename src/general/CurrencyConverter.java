package general;

public class CurrencyConverter implements ICurrencyConverter{

    @Override
    public ConvertionResult convert(ConvertData data, Operator operator) {
        Request request = operator.createRequestToConvert();
        Money fromMoney = new Money();
        Money toMoney = new Money();
        return new ConvertionResult(fromMoney, toMoney);
    }
}
