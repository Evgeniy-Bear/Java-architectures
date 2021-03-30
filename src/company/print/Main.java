package company.print;

public class Main {
    public static void main(String[] args) {
        PrinterInterface printer=new QuotesDecorator(new RightBracketDecorator(new LeftBracketDecorator(new Printer("TEXT"))));
        printer.print();
    }
}
