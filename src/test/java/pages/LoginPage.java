package pages;

import loggerUtility.LoggerUtility;
import objectData.LoginObject;
import objectData.URLObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class LoginPage extends BasePage{

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "user-name")
    public WebElement username;
    @FindBy(id = "password")
    public WebElement password;
    @FindBy(id = "login-button")
    public WebElement login;
    @FindBy(xpath = "//h3[text()='Epic sadface: Sorry, this user has been locked out.']")
    public WebElement lockedOutErrorElement;

    public void loginUserStandard(LoginObject testData){
        elementsMethod.clickElement(username);
        LoggerUtility.info("The user clicks on the username field");
        elementsMethod.fillElement(username, testData.getUsernameStandard());
        LoggerUtility.info("The user fills the standard username value: " + testData.getUsernameStandard());
        elementsMethod.clickElement(password);
        LoggerUtility.info("The user clicks on the password field");
        elementsMethod.fillElement(password, testData.getPassword());
        LoggerUtility.info("The user fills the password value: " + testData.getPassword());
        elementsMethod.clickElement(login);
        LoggerUtility.info("The user clicks on the login button");
    }

    public void loginUserLockedOut(LoginObject testData){
        elementsMethod.clickElement(username);
        LoggerUtility.info("The user clicks on the username field");
        elementsMethod.fillElement(username, testData.getUsernameLocked());
        LoggerUtility.info("The user fills the locked out username value: " + testData.getUsernameLocked());
        elementsMethod.clickElement(password);
        LoggerUtility.info("The user clicks on the password field");
        elementsMethod.fillElement(password, testData.getPassword());
        LoggerUtility.info("The user fills the password value: " + testData.getPassword());
        elementsMethod.clickElement(login);
        LoggerUtility.info("The user clicks on the login button");
    }

    public void loginUserProblem(LoginObject testData){
        elementsMethod.clickElement(username);
        LoggerUtility.info("The user clicks on the username field");
        elementsMethod.fillElement(username, testData.getUsernameProblem());
        LoggerUtility.info("The user fills the problem username value: " + testData.getUsernameProblem());
        elementsMethod.clickElement(password);
        LoggerUtility.info("The user clicks on the password field");
        elementsMethod.fillElement(password, testData.getPassword());
        LoggerUtility.info("The user fills the password value: " + testData.getPassword());
        elementsMethod.clickElement(login);
        LoggerUtility.info("The user clicks on the login button");
    }

    public void loginUserPerformance(LoginObject testData){
        elementsMethod.clickElement(username);
        LoggerUtility.info("The user clicks on the username field");
        elementsMethod.fillElement(username, testData.getUsernamePerformance());
        LoggerUtility.info("The user fills the performance username value: " + testData.getUsernamePerformance());
        elementsMethod.clickElement(password);
        LoggerUtility.info("The user clicks on the password field");
        elementsMethod.fillElement(password, testData.getPassword());
        LoggerUtility.info("The user fills the password value: " + testData.getPassword());
        elementsMethod.clickElement(login);
        LoggerUtility.info("The user clicks on the login button");
    }

    public void loginUserError(LoginObject testData){
        elementsMethod.clickElement(username);
        LoggerUtility.info("The user clicks on the username field");
        elementsMethod.fillElement(username, testData.getUsernameError());
        LoggerUtility.info("The user fills the error username value: " + testData.getUsernameError());
        elementsMethod.clickElement(password);
        LoggerUtility.info("The user clicks on the password field");
        elementsMethod.fillElement(password, testData.getPassword());
        LoggerUtility.info("The user fills the password value: " + testData.getPassword());
        elementsMethod.clickElement(login);
        LoggerUtility.info("The user clicks on the login button");
    }

    public void loginUserVisual(LoginObject testData){
        elementsMethod.clickElement(username);
        LoggerUtility.info("The user clicks on the username field");
        elementsMethod.fillElement(username, testData.getUsernameVisual());
        LoggerUtility.info("The user fills the visual username value: " + testData.getUsernameVisual());
        elementsMethod.clickElement(password);
        LoggerUtility.info("The user clicks on the password field");
        elementsMethod.fillElement(password, testData.getPassword());
        LoggerUtility.info("The user fills the password value: " + testData.getPassword());
        elementsMethod.clickElement(login);
        LoggerUtility.info("The user clicks on the login button");
    }

    public void lockedOutError(){
        Assert.assertEquals(lockedOutErrorElement.getText(), "Epic sadface: Sorry, this user has been locked out.");
        LoggerUtility.info("The locked out error is present on the screen: " + lockedOutErrorElement.getText());
    }


}
