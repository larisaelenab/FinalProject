package pages;


import loggerUtility.LoggerUtility;
import objectData.LoginObject;
import objectData.ProductsObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class ProductInfoPage extends BasePage{

    public ProductInfoPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//div[text()='Sauce Labs Backpack']")
    public WebElement nameSLB;
    @FindBy(xpath = "//div[@class = 'inventory_details_desc large_size']")
    public WebElement descriptionSLB;
    @FindBy(xpath = "//div[@class = 'inventory_details_price']")
    public WebElement priceSLB;
    @FindBy(xpath = "//img[@src = '/static/media/sauce-backpack-1200x1500.0a0b85a3.jpg']")
    public WebElement imageUrlSLB;

    @FindBy(xpath = "//div[text()='Sauce Labs Bike Light']")
    public WebElement nameSLBL;
    @FindBy(xpath = "//div[@class = 'inventory_details_desc large_size']")
    public WebElement descriptionSLBL;
    @FindBy(xpath = "//div[@class = 'inventory_details_price']")
    public WebElement priceSLBL;
    @FindBy(xpath = "//img[@src= '/static/media/bike-light-1200x1500.37c843b0.jpg']")
    public WebElement imageUrlSLBL;

    @FindBy(xpath = "//div[text()='Sauce Labs Bolt T-Shirt']")
    public WebElement nameSLBT;
    @FindBy(xpath = "//div[@class = 'inventory_details_desc large_size']")
    public WebElement descriptionSLBT;
    @FindBy(xpath = "//div[@class = 'inventory_details_price']")
    public WebElement priceSLBT;
    @FindBy(xpath = "//img[@src= '/static/media/bolt-shirt-1200x1500.c2599ac5.jpg']")
    public WebElement imageUrlSLBT;

    @FindBy(xpath = "//div[text()='Sauce Labs Fleece Jacket']")
    public WebElement nameSLFJ;
    @FindBy(xpath = "//div[@class = 'inventory_details_desc large_size']")
    public WebElement descriptionSLFJ;
    @FindBy(xpath = "//div[@class = 'inventory_details_price']")
    public WebElement priceSLFJ;
    @FindBy(xpath = "//img[@src= '/static/media/sauce-pullover-1200x1500.51d7ffaf.jpg']")
    public WebElement imageUrlSLFJ;

    @FindBy(xpath = "//div[text()='Sauce Labs Onesie']")
    public WebElement nameSLO;
    @FindBy(xpath = "//div[@class = 'inventory_details_desc large_size']")
    public WebElement descriptionSLO;
    @FindBy(xpath = "//div[@class = 'inventory_details_price']")
    public WebElement priceSLO;
    @FindBy(xpath = "//img[@src= '/static/media/red-onesie-1200x1500.2ec615b2.jpg']")
    public WebElement imageUrlSLO;

    @FindBy(xpath = "//div[text()='Test.allTheThings() T-Shirt (Red)']")
    public WebElement nameTR;
    @FindBy(xpath = "//div[@class = 'inventory_details_desc large_size']")
    public WebElement descriptionTR;
    @FindBy(xpath = "//div[@class = 'inventory_details_price']")
    public WebElement priceTR;
    @FindBy(xpath = "//img[@src= '/static/media/red-tatt-1200x1500.30dadef4.jpg']")
    public WebElement imageUrlTR;

    @FindBy(id = "back-to-products")
    public WebElement backToProductsElement;

    public void productInfoSLB(ProductsObject testData){
        elementsMethod.clickElement(nameSLB);
        Assert.assertEquals(nameSLB.getText(), testData.getNameSLB());
        LoggerUtility.info("The name of the product SLB is: " + testData.getNameSLB());
        Assert.assertEquals(descriptionSLB.getText(), testData.getDescriptionSLB());
        LoggerUtility.info("The description of the product SLB is: " + testData.getDescriptionSLB());
        Assert.assertEquals(priceSLB.getText(), testData.getPriceSLB());
        LoggerUtility.info("The price of the product SLB is: " + testData.getPriceSLB());
        Assert.assertEquals(imageUrlSLB.getAttribute("src"), testData.getImageUrlSLB());
        LoggerUtility.info("The image of the product SLB is: " + testData.getImageUrlSLB());
    }

    public void productInfoSLBL(ProductsObject testData){
        elementsMethod.clickElement(nameSLBL);
        Assert.assertEquals(nameSLBL.getText(), testData.getNameSLBL());
        LoggerUtility.info("The name of the product SLBL is: " + testData.getNameSLBL());
        Assert.assertEquals(descriptionSLBL.getText(), testData.getDescriptionSLBL());
        LoggerUtility.info("The description of the product SLBL is: " + testData.getDescriptionSLBL());
        Assert.assertEquals(priceSLBL.getText(), testData.getPriceSLBL());
        LoggerUtility.info("The price of the product SLBL is: " + testData.getPriceSLBL());
        Assert.assertEquals(imageUrlSLBL.getAttribute("src"), testData.getImageUrlSLBL());
        LoggerUtility.info("The image of the product SLBL is: " + testData.getImageUrlSLBL());
    }

    public void productInfoSLBT(ProductsObject testData){
        elementsMethod.clickElement(nameSLBT);
        Assert.assertEquals(nameSLBT.getText(), testData.getNameSLBT());
        LoggerUtility.info("The name of the product SLBT is: " + testData.getNameSLBT());
        Assert.assertEquals(descriptionSLBT.getText(), testData.getDescriptionSLBT());
        LoggerUtility.info("The description of the product SLBT is: " + testData.getDescriptionSLBT());
        Assert.assertEquals(priceSLBT.getText(), testData.getPriceSLBT());
        LoggerUtility.info("The price of the product SLBT is: " + testData.getPriceSLBT());
        Assert.assertEquals(imageUrlSLBT.getAttribute("src"), testData.getImageUrlSLBT());
        LoggerUtility.info("The image of the product SLBT is: " + testData.getImageUrlSLBT());
    }

    public void productInfoSLFJ(ProductsObject testData){
        elementsMethod.clickElement(nameSLFJ);
        Assert.assertEquals(nameSLFJ.getText(), testData.getNameSLFJ());
        LoggerUtility.info("The name of the product SLFJ is: " + testData.getNameSLFJ());
        Assert.assertEquals(descriptionSLFJ.getText(), testData.getDescriptionSLFJ());
        LoggerUtility.info("The description of the product SLFJ is: " + testData.getDescriptionSLFJ());
        Assert.assertEquals(priceSLFJ.getText(), testData.getPriceSLFJ());
        LoggerUtility.info("The price of the product SLFJ is: " + testData.getPriceSLFJ());
        Assert.assertEquals(imageUrlSLFJ.getAttribute("src"), testData.getImageUrlSLFJ());
        LoggerUtility.info("The image of the product SLFJ is: " + testData.getImageUrlSLFJ());
    }

    public void productInfoSLO(ProductsObject testData){
        elementsMethod.clickElement(nameSLO);
        Assert.assertEquals(nameSLO.getText(), testData.getNameSLO());
        LoggerUtility.info("The name of the product SLO is: " + testData.getNameSLO());
        Assert.assertEquals(descriptionSLO.getText(), testData.getDescriptionSLO());
        LoggerUtility.info("The description of the product SLO is: " + testData.getDescriptionSLO());
        Assert.assertEquals(priceSLO.getText(), testData.getPriceSLO());
        LoggerUtility.info("The price of the product SLO is: " + testData.getPriceSLO());
        Assert.assertEquals(imageUrlSLO.getAttribute("src"), testData.getImageUrlSLO());
        LoggerUtility.info("The image of the product SLO is: " + testData.getImageUrlSLO());
    }

    public void productInfoTR(ProductsObject testData){
        elementsMethod.clickElement(nameTR);
        Assert.assertEquals(nameTR.getText(), testData.getNameTR());
        LoggerUtility.info("The name of the product TR is: " + testData.getNameTR());
        Assert.assertEquals(descriptionTR.getText(), testData.getDescriptionTR());
        LoggerUtility.info("The description of the product TR is: " + testData.getDescriptionTR());
        Assert.assertEquals(priceTR.getText(), testData.getPriceTR());
        LoggerUtility.info("The price of the product TR is: " + testData.getPriceTR());
        Assert.assertEquals(imageUrlTR.getAttribute("src"), testData.getImageUrlTR());
        LoggerUtility.info("The image of the product TR is: " + testData.getImageUrlTR());
    }

    public void backToProducts(){
        elementsMethod.clickElement(backToProductsElement);
    }
}
