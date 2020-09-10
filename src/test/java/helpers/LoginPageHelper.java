package helpers;

import pages.LoginPage;
import user.User;

public class LoginPageHelper extends LoginPage {
        public void login(User user){
            login(user.email,user.password);
        }
}
