package entity;

public class NewsPaper extends Document{
    private String dayOfPublish;

    public NewsPaper(String documentCode, String publishingCompany, String numberOfPublish, String dayOfPublish) {
        super(documentCode, publishingCompany, numberOfPublish);
        this.dayOfPublish = dayOfPublish;
    }

    public String getDayOfPublish() {
        return dayOfPublish;
    }

    public void setDayOfPublish(String dayOfPublish) {
        this.dayOfPublish = dayOfPublish;
    }
}
