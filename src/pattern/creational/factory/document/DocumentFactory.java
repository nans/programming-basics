package pattern.creational.factory.document;

public class DocumentFactory {

    public Document makeDocumentByType(String type) {
        if (type.equals("certificate")) {
            return new Certificate();
        } else if (type.equals("check")) {
            return new Check();
        } else if (type.equals("contract")) {
            return new Contract();
        }
        return null;
    }
}
