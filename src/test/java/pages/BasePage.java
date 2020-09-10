package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.WebDriverInstansiator;


public class BasePage {
    WebDriver driver = WebDriverInstansiator.getDriver();
    WebDriverWait BASE_DRIVER_WAIT = new WebDriverWait(driver,20);

    public BasePage() {
        PageFactory.initElements(driver,this);
    }
}
