package RentalManagementModule.Models;

import java.util.Date;

public class Reservation {

    private Integer reservationID;
    private Integer bookID;
    private Integer lenderID;

    private Date reserveTill;

    public Reservation(Integer reservationID, Integer bookID, Integer lenderID, Date reserveTill) {
        this.reservationID = reservationID;
        this.bookID = bookID;
        this.lenderID = lenderID;
        this.reserveTill = reserveTill;
    }
}
