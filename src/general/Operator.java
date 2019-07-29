package general;

public class Operator extends Person{
  private String vsp;

  public Operator(String login, String vsp) {
    super(login);
    this.vsp = vsp;
  }

  public ConvertionRequest createRequest(Person person, Money from, Currency to, double fromRate, double toRate) {
    return new ConvertionRequest(from, to, fromRate, toRate);
  }

  public Request createRequestToConvert(){
    return new Request();
  }

  public static Double getCurrencyRate(Currency curIn, Currency curOut) {
    System.out.println("getCurrencyRate");
    Double exchangeRate = 1.0;

    switch(curIn) {
      case RUB:
        if(curOut == Currency.EUR) {
          exchangeRate = 0.01422;
        }
        if(curOut == Currency.USD) {
          exchangeRate = 0.0158;
        }
        break;
      case EUR:
        if(curOut == Currency.RUB) {
          exchangeRate = 70.41;
        }
        if(curOut == Currency.USD) {
          exchangeRate = 1.1132;
        }
        break;
      case USD:
        if(curOut == Currency.RUB) {
          exchangeRate = 63.12;
        }
        if(curOut == Currency.USD) {
          exchangeRate = 0.89646;
        }
        break;
      default:
        System.out.println("We dont have such currency!");
    }

    return exchangeRate;
  }

  @Override
  public String toString() {
    return "Operator: " + this.name
            + ", from: " + this.vsp;
  }

  public Operator(){}
}
