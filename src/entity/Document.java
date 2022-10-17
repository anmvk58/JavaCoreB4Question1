package entity;

public class Document {
    private String  documentCode;
    private String  publishingCompany;
    private String  numberOfPublish;

    public Document(String documentCode, String publishingCompany, String numberOfPublish) {
        this.documentCode = documentCode;
        this.publishingCompany = publishingCompany;
        this.numberOfPublish = numberOfPublish;
    }

    public String getDocumentCode() {
        return documentCode;
    }

    public void setDocumentCode(String documentCode) {
        this.documentCode = documentCode;
    }

    public String getPublishingCompany() {
        return publishingCompany;
    }

    public void setPublishingCompany(String publishingCompany) {
        this.publishingCompany = publishingCompany;
    }

    public String getNumberOfPublish() {
        return numberOfPublish;
    }

    public void setNumberOfPublish(String numberOfPublish) {
        this.numberOfPublish = numberOfPublish;
    }
}
