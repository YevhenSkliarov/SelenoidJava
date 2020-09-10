package user;


import java.util.ResourceBundle;

public class UserFactory {
    private static ResourceBundle user = ResourceBundle.getBundle("user");

    public static User getUser() {
        return new User(user.getString("email"),
                user.getString("password"));
    }
}
