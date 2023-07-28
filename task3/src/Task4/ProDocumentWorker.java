package Task4;

public class ProDocumentWorker extends DocumentWorker{
    @Override
    void editDocument() {
        System.out.println("Document is edited");
    }

    @Override
    void saveDocument() {
        System.out.println("Document saved in old version, \n" +
                " to save in another format is available in Expert version" );
    }
}
