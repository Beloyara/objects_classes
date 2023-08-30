public class Author {
    String name;
    String surname;
    String authorName = name + surname;

    public Author(String authorName) {
        this.authorName = authorName;
    }

    public String getAuthorName(){
        return this.authorName;
    }
}
