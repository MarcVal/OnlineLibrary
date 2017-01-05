package ro.OnlineLibrary.steps.genericSteps;

import ro.OnlineLibrary.utils.config.InitDriver;
import ro.OnlineLibrary.utils.config.WebDriverConfig;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.io.IOException;

public class TestBase {

    protected static WebDriver driver = WebDriverConfig.getDriver();

    static {
        if (driver == null) {
            try {
                InitDriver.initialize();
                driver = WebDriverConfig.getDriver();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void mouseOver(WebElement element) {
        Actions builder = new Actions(driver);
        builder.moveToElement(element).perform();
    }

    public void focusAndSendKeys(String text, WebElement element) {
        Actions actions = new Actions(driver);
        actions.moveToElement(element);
        actions.click();
        actions.sendKeys(text);
        actions.build().perform();
    }
}
