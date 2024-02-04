package Pages;

import com.shaft.driver.SHAFT;
import org.openqa.selenium.By;
public class BasketPage {
   private  SHAFT.GUI.WebDriver driver;
    //Constructor
    public BasketPage(SHAFT.GUI.WebDriver driver) {this.driver=driver;}
    //WebElements
    private By bookNameInBasket = By.xpath("(//a[@href='https://practice.automationtesting.in/product/thinking-in-html/'])[2]");
    private By priceOfTheBookInBasket =By.xpath("(//span[text() ='400.00'])[1]");
    private By proceedToCheckoutButton = By.xpath("//a[@href='https://practice.automationtesting.in/checkout/']");


    public void checkThatBookDisplayedInBasket(){
        driver.assertThat().element(bookNameInBasket).text().contains("Thinking in HTML").perform();
    }

    public String checkThatPriceOfTheBookDisplayedInBasket(){
        return driver.element().getText(priceOfTheBookInBasket);
    }
    public CheckOutPage clickOnProceedToCheckOutButton(){
        driver.element().click(proceedToCheckoutButton);
        return new CheckOutPage(driver);
    }

}