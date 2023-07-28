package Task6;

public class PrinterRed extends Printer {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";

    @Override
    void Print(String value) {
        System.out.println(ANSI_RED + value + ANSI_RESET);
    }
}
