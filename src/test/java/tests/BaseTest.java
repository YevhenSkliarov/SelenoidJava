package tests;

import helpers.App;
import org.testng.annotations.*;
import user.User;
import user.UserFactory;
import utils.WebDriverInstansiator;

import java.net.MalformedURLException;

public class BaseTest {
    private ThreadLocal<App> app = new ThreadLocal<>();
    static User user = UserFactory.getUser();

    @BeforeMethod
    @Parameters("browserName")
    public void initDriver(String browserName) throws MalformedURLException {
        WebDriverInstansiator.setDriver(browserName);
        app.set(new App());
    }

    App app() {
        return app.get();
    }

    @AfterMethod
    public void tearDown() {
        WebDriverInstansiator.getDriver().quit();
    }
}
