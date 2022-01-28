package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class initialization {
    WebDriver driver;

    public WebDriver initialize() throws Exception {
        System.setProperty("webdriver.chrome.driver", "/home/krishna/IdeaProjects/selenium/src/utils/chromedriver");
        this.driver = new ChromeDriver();
        driver.manage().window().maximize();
        return driver;
//        driver.get("https://www.google.com");
//        driver.findElement(By.xpath("//input[@name=\"q\"]")).sendKeys("testing");
    }


}
