package general;

public interface ICurrencyConverter {
    ConvertionResult convert(ConvertData data, Operator operator);
}
