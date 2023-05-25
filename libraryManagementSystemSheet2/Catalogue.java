import java.util.ArrayList;
import java.util.List;

public class Catalogue {
    private ArrayList<Title> title=new ArrayList<Title>();
    public void addBook(Title book){
        // TODO business logic
    }
    public Title searchBook(Title book){
        // TODO business logic
        return  null;
    }
    public void createBook(String bookName,Integer bookID,String ISBN, Copy copy){
        // TODO business logic
    }

    public String generateBibTeX(Title title){
        //TODO business logic
        return null;
    }
    // in catalogue
    public boolean checkISBN(Integer bookId){
        //TODO business logic
        return true;
    }

    // these methods have been added for extra functionality
    public void modifyBookByID(Integer bookID){
        // TODO business logic
    }
    public List<Title> retriveAllBooks(){

        // TODO business logic
        return  null;
    }
    public void removeBookByID(Integer bookID){
        // TODO business logic
    }

}
