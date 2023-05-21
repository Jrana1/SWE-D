import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Lender extends User {

    private Date checkOoutDate;
    private Date checkInDate;
    private List<Title> rentedBooks;
    private Integer lenderID;
    private Rental rental;

    public Lender(String userName, String eMail, String password, Date DOB, String role, Date checkOoutDate, Title rentedBook, Integer lenderID, Rental rental) {
        super(userName, eMail, password, DOB, role);
        this.checkOoutDate = checkOoutDate;
        this.checkInDate = checkInDate;
        this.lenderID = lenderID;
        this.rental = rental;
        this.rentedBooks=new ArrayList<Title>();
    }


}
