package AdministrationConsole;

import LenderModule.Models.Lender;
import LenderModule.Models.Title;

public class AdministrationConsoleService {

     // user management
     public void createLender(Lender lender){
          // TODO business logic
     }
     public  void updateLender(Integer lenderID){
         // TODO business logic
     }
     public  void removeLender(Integer lenderID){

         // TODO business logic
     }

     // borrowing management
    public Title checkBookForLender(Integer bookID){
        // TODO business logic
        return null;
    }
    public void issueBookForLender(Integer bookID, Integer lenderID){
        // TODO business logic
    }
    // inventory management

    public void addResources(Title book){
        // TODO business logic
    }
    public void updateInventory(){

        // TODO business logic
    }
}
