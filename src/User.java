import java.io.Serializable;
import java.util.Date;

/**
 * Created by madandan on 2017/7/11.
 */
public class User implements Serializable {
    private int id;
    private String phoneNumber;
    private String password;
    private Date registerTime;
    //用于URL传参和取参时的key
    public static String PHONENUMBER = "phoneNumber";
    public static String PASSWORD = "passWord";

    //构造函数
    public User(String phoneNumber,String password){
        this.phoneNumber = phoneNumber;
        this.password = password;
        registerTime = new Date();
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
