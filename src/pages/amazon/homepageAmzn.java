package pages.amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import static pages.amazon.amznlocators.*;
import static utils.common_configs.product_search;

public class homepageAmzn {
    WebDriver driver;
    public homepageAmzn(WebDriver driver) {
        this.driver=driver;
    }

    public void searchproduct(String productname){
        driver.findElement(By.xpath(search_box)).sendKeys(product_search);
        driver.findElement(By.xpath(search)).click();

    }
    public void SelectFirstProduct(){
        List<WebElement> myList = driver.findElements(By.xpath(First_product));
        String parent = driver.getWindowHandle();
        myList.get(0).click();
        Set<String> s = driver.getWindowHandles();
        Iterator<String> I1 = s.iterator();

        while (I1.hasNext()) {

            String child_window = I1.next();

            if (!parent.equals(child_window)) {
                driver.switchTo().window(child_window);
                System.out.println(driver.getTitle() +"from Amazon.in");
            }
        }
    }
    public void SwitchTo(){
        ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(0));
        driver.close();
        driver.switchTo().window(tabs2.get(1));
    }
}
