package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class DashboardPage extends BasePage {
    @FindBy(xpath = "//span[@class='sn_menu_title']")
    private WebElement lblUserEmail;


    public String getLblUserEmail() {
        BASE_DRIVER_WAIT.until(ExpectedConditions.visibilityOf(lblUserEmail));
        return lblUserEmail.getText();
    }
}
