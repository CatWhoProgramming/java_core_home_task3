package Task6;

public class PrinterBlue extends Printer {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLUE = "\u001B[34m";

    @Override
    void Print(String value) {
        System.out.println(ANSI_BLUE + value + ANSI_RESET);
    }
}
