package pages.flipkart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.Keys;


import java.util.Iterator;
import java.util.List;
import java.util.Set;

import static pages.flipkart.flpktlocators.*;
import static utils.common_configs.product_search;


public class homepageflkt {
    WebDriver driver;

    public homepageflkt(WebDriver driver) {
        this.driver = driver;
    }

    public void cancelbutton() {
        driver.findElement(By.xpath(cancel)).click();

    }

    public void searchproduct(String productname) throws InterruptedException {
        driver.findElement(By.className(search_box)).sendKeys(product_search,Keys.ENTER);
        Thread.sleep(1000);
        //WebElement.sendKeys(Keys.ENTER);
        //driver.findElement(By.className(search)).click();
        //Thread.sleep(5);
        //System.out.println("out of search");
    }

    public void selectFirstProduct() throws InterruptedException {
        List<WebElement> myList = driver.findElements(By.xpath(First_product));
        Thread.sleep(2000);
        //System.out.println("inside select product");
        String parent = driver.getWindowHandle();
        myList.get(0).click();
        //System.out.println("inside select product");
        Set<String> s = driver.getWindowHandles();
        Iterator<String> I1 = s.iterator();

        while (I1.hasNext()) {

            String child_window = I1.next();

            if (!parent.equals(child_window)) {
                driver.switchTo().window(child_window);
                //System.out.println(driver.getTitle()+"from Flipkart.com");
            }
        }
    }

}


