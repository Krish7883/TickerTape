package pages.amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static pages.amazon.amznlocators.*;

public class productpageAmzn {
    WebDriver driver;

    public productpageAmzn(WebDriver driver) {
        this.driver = driver;


    }

    public void getProductPrice() throws InterruptedException {
        Thread.sleep(5000);
        String price = driver.findElement(By.xpath(actualPrice)).getText();
//        String price1=price.findElements(By.tagName("span")).get(1).getText();
        System.out.println("printing price from amazon product page" +price);
    }

    public void addToCart() {
        driver.findElement(By.id(addToCartId)).click();

    }
    public void goToCart() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.id("attach-close_sideSheet-link")).click();
        driver.findElement(By.id(goToCart)).click();
    }


    }

