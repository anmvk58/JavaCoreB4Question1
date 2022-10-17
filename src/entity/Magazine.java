package entity;

public class Magazine extends Document{
    private int publishCode; //số phát hành
    private String monthOfPublish; //tháng phát hành

    public Magazine(String documentCode, String publishingCompany, String numberOfPublish, int publishCode, String monthOfPublish) {
        super(documentCode, publishingCompany, numberOfPublish);
        this.publishCode = publishCode;
        this.monthOfPublish = monthOfPublish;
    }

    public int getPublishCode() {
        return publishCode;
    }

    public void setPublishCode(int publishCode) {
        this.publishCode = publishCode;
    }

    public String getMonthOfPublish() {
        return monthOfPublish;
    }

    public void setMonthOfPublish(String monthOfPublish) {
        this.monthOfPublish = monthOfPublish;
    }
}
