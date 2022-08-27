package online.Deemah.entities;

public class Book {

    private Long ISBN;
    private String Title;
    private String AuthorName;
    private Long publishYear;

    public Book() {
    }

    public Book(Long ISBN, String Title, String AuthorName, Long publishYear) {
        this.ISBN = ISBN;
        this.Title = Title;
        this.AuthorName = AuthorName;
        this.publishYear = publishYear;
    }
    
     public Book( String Title, String AuthorName, Long publishYear) {
        this(null , Title , AuthorName , publishYear );
    }

    public Long getISBN() {
        return ISBN;
    }

    public void setISBN(Long ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String Title) {
        this.Title = Title;
    }

    public String getAuthorName() {
        return AuthorName;
    }

    public void setAuthorName(String AuthorName) {
        this.AuthorName = AuthorName;
    }

    public Long getPublishYear() {
        return publishYear;
    }

    public void setPublishYear(Long publishYear) {
        this.publishYear = publishYear;
    }

    @Override
    public String toString() {
        return "Book{" + "ISBN=" + ISBN + ", Title=" + Title + ", AuthorName=" + AuthorName + ", publishYear=" + publishYear + '}';
    }

}
