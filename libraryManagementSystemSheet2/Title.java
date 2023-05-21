public class Title {

    private String bookName;
    private Integer bookId;
    private String authorName;
    private String ISBN;
    private String language;
    private Copy copy;

    public Title(String bookName, Integer bookId, String authorName, String ISBN, String language) {
        this.bookName = bookName;
        this.bookId = bookId;
        this.authorName = authorName;
        this.ISBN = ISBN;
        this.language = language;
    }

    public Object generateBibTeX(Title title){
        //TODO business logic
        return null;
    }
    public boolean checkISBN(Integer bookId){
        //TODO business logic
        return true;
    }
}
