package TestPackage;

import Pages.BasketPage;
import Pages.CheckOutPage;
import Pages.HomePage;
import com.shaft.driver.SHAFT;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import static org.testng.AssertJUnit.assertEquals;

public class E2ETest {

    SHAFT.GUI.WebDriver driver;
    private String priceOfTheBookInHomePage;
    HomePage homePage;
    BasketPage basketPage;
    CheckOutPage checkOutPage;


    @BeforeClass
    public void SetUp(){
        driver = new SHAFT.GUI.WebDriver();
    }

    @Test
    public void addToCart() throws NoSuchMethodException {
        homePage =new HomePage(driver);
        homePage.NavigateToHomePage();
        homePage.CheckThatBookIsDisplayed();
        priceOfTheBookInHomePage = new HomePage(driver).CheckThatPriceOfTheBookIsDisplayed();
        assertEquals(homePage.CheckThatPriceOfTheBookIsDisplayed(),"₹400.00");
        homePage.ClickOnAddToBasket();
    }
    @Test(dependsOnMethods = "addToCart")
    public void continueToBasketPage(){
        basketPage = new BasketPage(driver);
        homePage.ClickOnViewBasket();
        basketPage.checkThatBookDisplayedInBasket();
        String priceOfTheBookInBasket = new BasketPage(driver).checkThatPriceOfTheBookDisplayedInBasket();
        assertEquals(priceOfTheBookInHomePage,priceOfTheBookInBasket);
    }
    @Test(dependsOnMethods = "continueToBasketPage")
    public void continueToCheckOutPage(){
        checkOutPage = new CheckOutPage(driver);
        basketPage.clickOnProceedToCheckOutButton();
        checkOutPage.checkThatBillingDetailsFormDisplayed();
        checkOutPage.checkThatProductNameDisplayedInCheckOutPage();

    }
    @AfterClass
    public void tearDown(){
        driver.quit();
    }
}
