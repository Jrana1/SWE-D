package BookInventoryModule;
//  This class acts as a REST Controller
// All the HTTP request related to Books will be handled by this class
public class BookInventoryController {

    // N.B: this class has the quite same  name but different functionalities  as BookInventoryService class
    // But we want to separate them from each other and make it a layered structure . Whenever this class gets an HTTP request, this class will talk to BookInventoryService
    // and provide the requested services via bookInventoryService.
    private BookInventoryService bookInventoryService;

}
