package ДЗ_3;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
public class Test3 {
    public static void main( String[] args ) {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        options.addArguments("start-maximized");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.get("https://icity-store.ru/");
        WebElement webElement1 = driver.findElement(By.cssSelector("div[class='product-grid-item product woodmart-hover-alt col-md-3 col-sm-4 col-6 first type-product post-8830 status-publish first instock product_cat-iphone-13-pro product_tag-smartfon has-post-thumbnail taxable shipping-taxable purchasable product-type-simple'] img[class='attachment-woocommerce_thumbnail size-woocommerce_thumbnail woodmart-lazy-load woodmart-lazy-fade woodmart-loaded']"));
        webElement1.click();
        WebElement webElement2 = driver.findElement(By.cssSelector("button[value='8830']"));
        webElement2.click();
        WebElement webElement3 = driver.findElement(By.cssSelector("div[class='cart-widget-side woodmart-cart-opened'] a[class='close-side-widget wd-cross-button wd-with-text-left']"));
        webElement3.click();
        WebElement webElement4 = driver.findElement(By.cssSelector(".woodmart-cart-icon.wd-tools-icon"));
        webElement4.click();
        WebElement webElement5 = driver.findElement(By.cssSelector("div[class='widget woocommerce widget_shopping_cart'] a[class='button btn-cart wc-forward']"));
        webElement5.click();
        WebElement webElement6 = driver.findElement(By.cssSelector("a[class='remove']"));
        webElement6.click();
    }
}
