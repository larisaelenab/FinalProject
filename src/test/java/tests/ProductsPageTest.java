package tests;

import objectData.LoginObject;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.ProductsPage;
import sharedData.SharedData;

public class ProductsPageTest extends SharedData {

    @Test
    public void testMethod(){

        LoginObject testData = new LoginObject("src/test/resources/testData/LoginData.json");
        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.loginUserStandard(testData);

        ProductsPage productsPage = new ProductsPage(getDriver());
        productsPage.checkPageTitle();
        productsPage.checkProductsSubTitle();


    }
}
