package entity;

public class Book extends Document{
    private String author;
    private int totalPage;

    public Book(String documentCode, String publishingCompany, String numberOfPublish, String author, int totalPage) {
        super(documentCode, publishingCompany, numberOfPublish);
        this.author = author;
        this.totalPage = totalPage;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }
}
