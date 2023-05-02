package RentalManagementModule.Models;

public class Rental {

    private Integer lenderID;
    private Integer bookID;
    private  Reservation reservation;
    private  RentalInfo rentalInfo;

    public Rental(Integer lenderID, Integer bookID, Reservation reservation, RentalInfo rentalInfo) {
        this.lenderID = lenderID;
        this.bookID = bookID;
        this.reservation = reservation;
        this.rentalInfo = rentalInfo;
    }
}
