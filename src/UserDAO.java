import java.util.ArrayList;

/**
 * Created by madandan on 2017/7/11.
 */
public class UserDAO {
    public static void main(String[] args) {
        //本地验证Main函数
        UserDAO userDAO = new UserDAO();
        System.out.println(userDAO.isLoginOK("123456", "abc123456"));
    }
    //假设的数据源
    public ArrayList<User> users;

    public UserDAO() {
        // TODO Auto-generated constructor stub
        users = new ArrayList<User>();
        users.add(new User("12345678912","abc123"));

    }
    //验证函数
    public boolean isLoginOK(String phoneNumber,String password) {
        for (User user : users) {
            if (user.getPhoneNumber().equals(phoneNumber)) {
                if (user.getPassword().equals(password)) {
                    return true;
                }
            }
        }
        return false;
    }
}
