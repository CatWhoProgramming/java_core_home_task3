package Task4;

public class ExpertDocumentWorker extends ProDocumentWorker {
    @Override
    void saveDocument() {
        System.out.println("You can save your document in pdf, doc or jpeg format");
    }
}
