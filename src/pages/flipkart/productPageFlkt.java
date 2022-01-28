package pages.flipkart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static pages.flipkart.flpktlocators.*;

public class productPageFlkt {
    WebDriver driver;

    public productPageFlkt(WebDriver driver) {

        this.driver = driver;
    }

    public Integer printPrice() {
        Integer intPrice=0;
        String prdctprice = driver.findElement(By.xpath(actualPrice)).getText();
        System.out.println(prdctprice);
        try {
            Thread.sleep(1000);
            driver.findElement(By.xpath(actualPrice)).click();
        } catch (Exception e) {
            System.out.println("Inside catch Block");
        }
        String[] arrOfStr = prdctprice.substring(1).split(",", 3);
        if (arrOfStr.length == 2) {
             intPrice = Integer.parseInt(String.join("", arrOfStr[0], arrOfStr[1]));
        }
        else if (arrOfStr.length==3){
            intPrice = Integer.parseInt(String.join("", arrOfStr[0], arrOfStr[1],arrOfStr[2]));

        }
        System.out.println(intPrice);
        return intPrice;

    }

    public void addToCart() {

        driver.findElement(By.xpath(addToCartXpath)).click();
    }

    public void goToCart() {
        driver.findElement(By.xpath(carticon)).click();
    }


}