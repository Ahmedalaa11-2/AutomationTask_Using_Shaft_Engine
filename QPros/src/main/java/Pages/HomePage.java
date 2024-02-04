package Pages;

import com.shaft.driver.SHAFT;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import java.time.Duration;

public class HomePage {

    private  SHAFT.GUI.WebDriver driver;
    //Constructor
    public HomePage(SHAFT.GUI.WebDriver driver) {this.driver = driver;}
    //WebElements
    private By thinkingInHTMLBook = By.xpath("//*[text() ='Thinking in HTML']");
    private By priceOfThinkingInHTMLBook = By.xpath("(//span[@class='woocommerce-Price-amount amount'])[3]");
    private By addToBasketButton = By.xpath("//a[@href= '/?add-to-cart=163']");
    private By viewBasketButton =By.xpath("(//a[@href='https://practice.automationtesting.in/basket/'])[1]");


    public void NavigateToHomePage(){
        driver.browser().navigateToURL("https://practice.automationtesting.in/");
    }

    public void CheckThatBookIsDisplayed (){
        driver.element().scrollToElement(thinkingInHTMLBook);
        driver.assertThat().element(thinkingInHTMLBook).text().contains("Thinking in HTML").perform();
    }

    public String CheckThatPriceOfTheBookIsDisplayed(){
        return driver.element().getText(priceOfThinkingInHTMLBook);
    }
    public void ClickOnAddToBasket(){
        driver.element().click(addToBasketButton);
    }

    public BasketPage ClickOnViewBasket(){

        driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.element().click(viewBasketButton);
        return new BasketPage(driver);

    }

}
