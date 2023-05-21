import java.util.Date;

public class RentalInfo {

    private Date checkInDate;
    private Date checkOutDate;
    private Integer lenderID;
    private Integer bookID;

    public RentalInfo(Date checkInDate, Date checkOutDate, Integer lenderID, Integer bookID) {
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
        this.lenderID = lenderID;
        this.bookID = bookID;
    }
}
