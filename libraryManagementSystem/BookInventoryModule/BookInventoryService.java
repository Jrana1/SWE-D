package BookInventoryModule;


import LenderModule.Models.Title;

import java.util.List;

// This class will provide all the services related to Book Inventory
// This class will talk to Database according to the request from Admin and Client
public class BookInventoryService {


    private Title book;

    public void addBook(Title title){
        // TODO business logic
    }
    public void removeBookByID(Integer bookID){
        // TODO business logic
    }

    public Title findBookByID(Integer bookID){
        // TODO business logic
        return  null;
    }
    public void modifyBookByID(Integer bookID){
        // TODO business logic
    }
    public List<Title>retriveAllBooks(){

        // TODO business logic
        return  null;
    }

}
