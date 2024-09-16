package tests;

import objectData.LoginObject;
import objectData.ProductsObject;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.ProductInfoPage;
import sharedData.SharedData;

public class ProductInfoTest extends SharedData {

    @Test
    public void testMethod(){


        LoginObject testData = new LoginObject("src/test/resources/testData/LoginData.json");
        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.loginUserStandard(testData);

        ProductsObject testData1 = new ProductsObject("src/test/resources/testData/ProductsData.json");
        ProductInfoPage productInfoPage = new ProductInfoPage(getDriver());
        productInfoPage.productInfoSLB(testData1);
        productInfoPage.backToProducts();
        productInfoPage.productInfoSLBL(testData1);
        productInfoPage.backToProducts();
        productInfoPage.productInfoSLBT(testData1);
        productInfoPage.backToProducts();
        productInfoPage.productInfoSLFJ(testData1);
        productInfoPage.backToProducts();
        productInfoPage.productInfoSLO(testData1);
        productInfoPage.backToProducts();
        productInfoPage.productInfoTR(testData1);
        productInfoPage.backToProducts();

    }
}
