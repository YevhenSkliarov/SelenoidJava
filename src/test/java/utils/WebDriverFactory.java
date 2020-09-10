package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

public class WebDriverFactory {

    static WebDriver getWebDriver(String browserName) throws MalformedURLException {
        RemoteWebDriver driver = null;
        if (browserName.equals("chrome")) {
            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setBrowserName("chrome");
            capabilities.setVersion("84.0");
            capabilities.setCapability("enableVNC", true);
            capabilities.setCapability("enableVideo", true);

            driver = new RemoteWebDriver(
                    new URL("http://127.0.0.1:4444/wd/hub/"),
                    capabilities
            );
        } else if (browserName.equals("firefox")) {
            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setBrowserName("firefox");
            capabilities.setVersion("80.0");
            capabilities.setCapability("enableVNC", true);
            capabilities.setCapability("enableVideo", true);

            driver = new RemoteWebDriver(
                    new URL("http://127.0.0.1:4444/wd/hub/"),
                    capabilities
            );
        }
        return driver;
    }
}
