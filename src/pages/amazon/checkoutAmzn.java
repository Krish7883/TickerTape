package pages.amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static pages.amazon.amznlocators.*;

public class checkoutAmzn {
    WebDriver driver;

    public checkoutAmzn(WebDriver driver) {
        this.driver = driver;

    }
    public Integer cartPrice(){
        Integer intPrice=0;
        String Price=driver.findElement(By.xpath(cartTotal)).getText();
        //System.out.println(Price);
        String splitprice=Price.substring(0,Price.length()-3);
        String[] arrOfStr = splitprice.trim().split(",", 3);
        if (arrOfStr.length == 2) {
            intPrice = Integer.parseInt(String.join("", arrOfStr[0],arrOfStr[1]));
        }
        else if (arrOfStr.length==3){
            intPrice = Integer.parseInt(String.join("", arrOfStr[0], arrOfStr[1],arrOfStr[2]));

        }
        System.out.println("price of product in Anazon" +intPrice);
        return intPrice;
    }
}
