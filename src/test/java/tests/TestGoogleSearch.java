package tests;

import org.testng.Assert;
import org.testng.annotations.Test;


public class TestGoogleSearch extends BaseTest {

    @Test
    public void shouldBeBlogTitle() {
        app().login.open();
        app().login.login(user);
        Assert.assertEquals(app().dashboard.getLblUserEmail(), user.email);
    }

    @Test
    public void shouldBeBlogTitle1() {
        app().login.open();
        app().login.login(user);
        Assert.assertEquals(app().dashboard.getLblUserEmail(), user.email);
    }

}
