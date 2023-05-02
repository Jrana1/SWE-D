package LenderModule;



//  This class acts as a REST Controller
// All the HTTP request related to Lender will be handled by this class

public class LenderController {


    // N.B: this class has same the functionalities as LenderService class
    // But we want separate them. Whenever this class gets an HTTP request, this class will talk to LenderServices
    // and prove the requested services.

    private LenderServices lenderServices;


}
