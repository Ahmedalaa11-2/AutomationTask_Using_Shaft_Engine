package Pages;

import com.shaft.driver.SHAFT;
import org.openqa.selenium.By;
public class CheckOutPage {
    private  SHAFT.GUI.WebDriver driver;
    //Constructor
    public CheckOutPage(SHAFT.GUI.WebDriver driver) {this.driver = driver;}
    //WebElements
    private By billingDetailsForm = By.xpath("//div[@class='woocommerce-billing-fields']//h3[contains(text() , 'Billing Details')]");
    private By bookNameInCheckOutPage= By.xpath("//td[@class= 'product-name']");


    public void checkThatBillingDetailsFormDisplayed(){
        driver.assertThat().element(billingDetailsForm).text().contains("Billing Details").perform();
    }
    public void checkThatProductNameDisplayedInCheckOutPage(){
       driver.element().scrollToElement(bookNameInCheckOutPage);
        driver.assertThat().element(bookNameInCheckOutPage).text().contains("Thinking in HTML  × 1").perform();
    }
}

