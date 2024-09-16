package helperMethods;

import loggerUtility.LoggerUtility;
import lombok.AllArgsConstructor;
import objectData.URLObject;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

@AllArgsConstructor
public class WindowMethods {

    public WebDriver driver;

    public void checkURLLogin(URLObject testData){
        String URL = driver.getCurrentUrl();
        Assert.assertEquals(URL, testData.getCurrentURLLogin());
        LoggerUtility.info("The current url is the login one: " + URL);
    }

    public void checkURLProducts(URLObject testData){
        String URL = driver.getCurrentUrl();
        Assert.assertEquals(URL, testData.getCurrentURLProducts());
        LoggerUtility.info("The current url is the products one: " + URL);
    }

}
