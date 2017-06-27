package pattern.creational.factory.document;

public class DocumentApplication {
    public DocumentApplication() {
        DocumentFactory documentFactory = new DocumentFactory();

        Document newContract = documentFactory.makeDocumentByType("contract");
        newContract.setText("Contract text.");
        newContract.printContent();

        Document newCheck = documentFactory.makeDocumentByType("check");
        newCheck.setText("Check content.");
        newCheck.printContent();
    }
}
