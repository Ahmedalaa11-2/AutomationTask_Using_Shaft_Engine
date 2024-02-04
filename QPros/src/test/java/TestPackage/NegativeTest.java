package TestPackage;

import Pages.HomePage;
import com.shaft.driver.SHAFT;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import static org.testng.AssertJUnit.assertEquals;

public class NegativeTest {

    SHAFT.GUI.WebDriver driver;
    HomePage homePage;
    private String priceOfTheBookInHomePage;

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
        assertEquals(homePage.CheckThatPriceOfTheBookIsDisplayed(),"₹500.00");
        homePage.ClickOnAddToBasket();
    }
}
