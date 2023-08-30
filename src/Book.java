public class Book {
    private String bookName;
    private Author authorName;;
    private int publishingYear;

    public Book(String bookName, int publishingYear) {
        this.bookName = bookName;
        this.authorName = new Author("name", "surname");
        this.publishingYear = publishingYear;
    }

    public String getBookName() {
        return this.bookName;
    }

    public int getPublishingYear() {
        return this.publishingYear;
    }

    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }
}