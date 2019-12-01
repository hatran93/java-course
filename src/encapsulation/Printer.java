package encapsulation;

public class Printer {
    private int level;
    private int pagesPrinted = 0;
    boolean isDuplex;

    public Printer(int level, int pagesPrinted, boolean isDuplex) {
        this.level = level;
        this.pagesPrinted = pagesPrinted;
        this.isDuplex = isDuplex;
    }

    public void fillToner(int fillLevel) {
        if (fillLevel < 0) {
            System.out.println("Must be more than 0");
        } else if ((this.level += fillLevel) > 100) {
            this.level = 100;
            getLevel();
        } else {
            this.level += fillLevel;
            getLevel();
        }
    }
    public void printPage(int noOfPages){
        this.pagesPrinted += noOfPages;
        System.out.println("The printer already printed " + pagesPrinted + " pages.");
    }

    public void getLevel() {
        System.out.println("Level of the printer is " + this.level);
    }


}
