package tests;

import helperMethods.WindowMethods;
import objectData.LoginObject;
import objectData.URLObject;
import org.testng.annotations.Test;
import pages.LoginPage;
import sharedData.SharedData;

public class LoginLockedOutUserTest extends SharedData {

    @Test
    public void testMethod(){

        LoginObject testData = new LoginObject("src/test/resources/testData/LoginData.json");
        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.loginUserLockedOut(testData);

        loginPage.lockedOutError();

        URLObject testData1 = new URLObject("src/test/resources/testData/URLData.json");
        WindowMethods windowMethods = new WindowMethods(getDriver());
        windowMethods.checkURLLogin(testData1);

    }
}
