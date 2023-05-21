
import java.util.Date;

public class User {

    private String userName;
    private  String eMail;
    private String password;
    private Date DOB;
    private String role;

    public User(String userName, String eMail, String password, Date DOB, String role) {
        this.userName = userName;
        this.eMail = eMail;
        this.password = password;
        this.DOB = DOB;
        this.role = role;
    }
}
