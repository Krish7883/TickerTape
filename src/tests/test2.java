package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.amazon.checkoutAmzn;
import pages.amazon.productpageAmzn;
import pages.flipkart.cartPage;
import pages.flipkart.homepageflkt;
import pages.flipkart.productPageFlkt;
import utils.initialization;
import pages.amazon.homepageAmzn;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import static pages.amazon.amznlocators.*;
import static utils.common_configs.*;

import static utils.common_configs.flkp;
import static utils.common_configs.product_search;

public class test2 {
    public static void main(String[] args) throws Exception {
        initialization init = new initialization();
        WebDriver driver = init.initialize();
        homepageAmzn hp = new homepageAmzn(driver);
        productpageAmzn pp=new productpageAmzn(driver);
        homepageflkt hhf=new homepageflkt(driver);
        productPageFlkt ppf=new productPageFlkt(driver);
        cartPage cp=new cartPage(driver);
        checkoutAmzn checkprice=new checkoutAmzn(driver);

        //common_configs cmn=new common_configs();
        //amznlocators amzloc=new amznlocators();

        driver.get(flkp);
        hhf.cancelbutton();
        hhf.searchproduct(product_search);
        hhf.selectFirstProduct();
        Integer FlipkartPrice=ppf.printPrice();
        ppf.addToCart();
        cp.FinalPrice();
        //driver.close();
        //driver.quit();

        //AMAZON
        //String FlipkartPage=driver.getWindowHandle();
        driver.get(amzn);
        hp.SwitchTo();
        hp.searchproduct(product_search);
        hp.SelectFirstProduct();
        pp.getProductPrice();
        pp.addToCart();
        pp.goToCart();
        Integer amazonPrice=checkprice.cartPrice();

        if (amazonPrice>FlipkartPrice){
            System.out.println("The Product is cheaper in Flipkart " +FlipkartPrice);
        }
        else {
            System.out.println("The Product is cheaper in Amazon " +amazonPrice);

        }
        driver.quit();



    }
}
