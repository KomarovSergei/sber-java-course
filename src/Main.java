import general.*;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
//        Operator operator = new Operator("Ivanov", "1234/5678");
////        System.out.println(operator.toString());
//
//        Date dateNow = new Date(1988, 11, 27);
//        Client client1 = new Client("Петров А.А.", dateNow, new DUL());
////        System.out.println(client1.toString());
//
//        Money from = new Money(Currency.RUB, 10_000);
////        System.out.println(from.toString());
//
////        ConvertionRequest req = operator.createRequest(client1, from, Currency.EUR, 1, 62.35);
//
//        // Simple convert
//        System.out.println(from.getAmount() * Operator.getCurrencyRate(from.getCurrency(), Currency.EUR));
// -------------- before refactor ------------------
        // cmd+alt+p
        init();
        run();
        finish();
    }

    public static void init() {
        Client client = new Client("FIO", new Date(), new DUL());
        Money money = new Money(Currency.USD, 127.50);
        ConvertData convertData = new ConvertData(client, money, Currency.RUB);
    }

    public static void run() {

    }

    public static void finish() {

    }
}
