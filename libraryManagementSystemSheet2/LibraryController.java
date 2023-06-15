public interface LibraryController {

    public Title searchBook(Title book);
    public void createBook(String bookName,String bookInfo);
    public String generateBibTeX(Title title);
    public boolean checkISBN(Integer bookId);
    public void rentBook(Title book, Lender lender);
    public void returnBook(Title book,Lender lender);
    public void registerUser(Lender lender);
    public void deactivateUser(Integer lenderID);
    public boolean addBook(String location,Integer bookID);
    public QRCodeScanner generate(Integer ID);
    public boolean checkAvailability(Integer bookID);

}
