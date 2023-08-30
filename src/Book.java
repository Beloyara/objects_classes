public class Book {
    String bookName;
    Author authorName;;
    int publishingYear;

    public Book(String bookName, int publishingYear) {
        this.bookName = bookName;
        this.authorName = new Author("authorName");
        this.publishingYear = publishingYear;
    }

    public String getBookName() {
        return this.bookName;
    }

    public int getPublishingYear() {
        return this.publishingYear;
    }
}