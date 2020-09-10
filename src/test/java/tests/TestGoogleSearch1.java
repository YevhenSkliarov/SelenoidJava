package tests;

import org.testng.Assert;
import org.testng.annotations.Test;


public class TestGoogleSearch1 extends BaseTest {

    @Test
    public void shouldBeBlogTitle3() {
        app().login.open();
        app().login.login(user);
        Assert.assertEquals(app().dashboard.getLblUserEmail(), user.email);
    }

    @Test
    public void shouldBeBlogTitle4() {
        app().login.open();
        app().login.login(user);
        Assert.assertEquals(app().dashboard.getLblUserEmail(), user.email);
    }
}
