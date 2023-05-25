import java.util.ArrayList;

public class Title {

    private String bookName;
    private Integer bookId;
    private String ISBN;
    private ArrayList<Copy> copy = new ArrayList<>();

    public Title(String bookName, Integer bookId, String ISBN) {
        this.bookName = bookName;
        this.bookId = bookId;
        this.ISBN = ISBN;
    }

    // in catalogue

}
