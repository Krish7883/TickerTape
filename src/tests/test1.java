package tests;

import org.openqa.selenium.WebDriver;

import pages.flipkart.cartPage;
import utils.initialization;
import pages.flipkart.homepageflkt;
import pages.flipkart.productPageFlkt;

import static utils.common_configs.flkp;
import static utils.common_configs.product_search;


public class test1 {
    public static void main(String[] args) throws Exception {
        initialization init = new initialization();
        WebDriver driver = init.initialize();
        homepageflkt hp=new homepageflkt(driver);
        productPageFlkt pp=new productPageFlkt(driver);
        cartPage cp=new cartPage(driver);

        driver.get(flkp);
        hp.cancelbutton();
        hp.searchproduct(product_search);
        hp.selectFirstProduct();
        pp.printPrice();
        pp.addToCart();
        cp.addQuantity();
        cp.FinalPrice();
        //driver.quit();


    }
}