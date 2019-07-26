public class Converter {
    private Converter converter;
    private Operator operator;
    private DUL dul;
    private Client client;
    private Printer print;

    public Converter(Converter converter, Printer print) {
        this.converter = converter;
        this.print = print;
    }

    public void run(Operator operator, DUL dul, Client client) {
        this.operator = operator;
        this.dul = dul;
        this.client = client;
    }
}
