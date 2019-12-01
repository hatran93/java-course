package encapsulation;

public class Main {
    public static void main(String[] args) {

        Printer printer = new Printer(20, 2, true);
        printer.getLevel();
        printer.fillToner(30);
        printer.fillToner(300);
        printer.fillToner(-6);
        printer.getLevel();
        printer.printPage(10);
        printer.printPage(100);
        printer.printPage(99);
    }
}
