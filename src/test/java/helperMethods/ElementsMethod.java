package helperMethods;

import loggerUtility.LoggerUtility;
import lombok.AllArgsConstructor;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

@AllArgsConstructor
public class ElementsMethod {
    public WebDriver driver;

    public void waitForElementVisible(WebElement element){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void clickElement(WebElement element){
        waitForElementVisible(element);
        element.click();
    }

    public void fillElement(WebElement element, String text){
        waitForElementVisible(element);
        element.sendKeys(text);
    }

    public void pressElement(WebElement element, Keys key){
        waitForElementVisible(element);
        element.sendKeys(key);
    }

    public void clickJSElement(WebElement element) {
        waitForElementVisible(element);
        JavascriptExecutor jsClick = (JavascriptExecutor) driver;
        jsClick.executeScript("arguments[0].click();", element);
    }

    public void clearFillElement(WebElement element, String text){
        waitForElementVisible(element);
        element.clear();
        element.sendKeys(text);
    }

}
