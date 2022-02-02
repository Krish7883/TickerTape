package pages.flipkart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

import static pages.flipkart.flpktlocators.FinalPrice;
import static pages.flipkart.flpktlocators.quantityAdd;

public class cartPage {
    WebDriver driver;
    public cartPage(WebDriver driver) {

        this.driver = driver;
    }
    public void addQuantity() throws InterruptedException {
        Thread.sleep(2000);
        List<WebElement> quantityElements=driver.findElements(By.xpath(quantityAdd));
        quantityElements.get(1).click();
    }
    public void FinalPrice() throws InterruptedException {
        Thread.sleep(3000);
        String FinalAmount = driver.findElement(By.xpath(FinalPrice)).getText();
        System.out.println(FinalAmount);
    }
}
