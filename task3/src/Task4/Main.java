package Task4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        startDialog();
    }

    private static void startDialog() {
        System.out.println("Enter key for pro and expert version or you can try trial");
        System.out.print(
                "1 - try trial version\n" +
                        "2 - enter key for Pro version\n" +
                        "3 - enter key for Expert version\n" +
                        "Make your chose: ");

        Scanner input = new Scanner(System.in);
        String chose = input.next();
        answerForYourChose(chose);
    }

    private static void answerForYourChose(String chose) {
        switch (chose) {
            case "1": {
                System.out.println("You can try just trial version");
                createDocumentWorker();
                break;
            }
            case "2": {
                System.out.println("Good chose in the next time you can chose better :)");
                createProDocument();
                break;
            }
            case "3": {
                System.out.println("Excellent!");
                createExpertDocument();
                break;
            }
        }
    }

    private static void createExpertDocument() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter password. It's a word with 6 letters ");
        String buffer = input.nextLine();

        boolean available = checkAvailable(buffer);
        if (available) {
            ExpertDocumentWorker expertDocumentWorker = new ExpertDocumentWorker();
            expertDocumentWorker.openDocument();
            expertDocumentWorker.editDocument();
            expertDocumentWorker.saveDocument();
        } else System.out.println("Unfortunately your password is incorrect");
        input.close();
    }

    private static void createProDocument() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter key. It must include 6 numbers from 1 ");
        int key = input.nextInt();
        StringBuffer buffer = new StringBuffer();
        while (key % 10 != 0) {
            int a = key % 10;
            buffer.append(a);
            key = key / 10;
        }
        boolean available = checkAvailable(buffer);
        if (available) {
            ProDocumentWorker proDocumentWorker = new ProDocumentWorker();
            proDocumentWorker.openDocument();
            proDocumentWorker.editDocument();
            proDocumentWorker.saveDocument();
        } else System.out.println("Unfortunately your key is incorrect");

    }

    private static boolean checkAvailable(StringBuffer buffer) {
        if (buffer.length() != 6) {
            return false;
        } else
            return buffer.charAt(5) == '1';

    }

    private static boolean checkAvailable(String buffer) {
        if (buffer.length() != 6)
            return false;
        else for (int i = 0; i < buffer.length(); i++) {
            for (int j = 0; j < 10; j++) {
                String s = String.valueOf(buffer.charAt(i));
                if (s.equals(String.valueOf(j)))
                    return false;
            }
        }
        return true;
    }

    private static void createDocumentWorker() {
        DocumentWorker documentWorker = new DocumentWorker();
        documentWorker.openDocument();
        documentWorker.editDocument();
        documentWorker.saveDocument();
    }
}
