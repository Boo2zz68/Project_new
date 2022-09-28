package ДЗ_3;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
public class Test1 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        options.addArguments("start-maximized");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.get("https://icity-store.ru/");
        WebElement webElement1 = driver.findElement(By.xpath("//span[@class='nav-link-text'][normalize-space()='iPhone']"));
        webElement1.click();
        WebElement webElement2 = driver.findElement(By.xpath("//li[@class='cat-item cat-item-80']//a[contains(text(),'iPhone 12 Pro')]"));
        webElement2.click();
        WebElement webElement3 = driver.findElement(By.xpath("//div[contains(@class,'type-product post-7648 status-publish first instock product_cat-iphone-12-pro product_tag-smartfon has-post-thumbnail taxable shipping-taxable purchasable product-type-simple')]//img[@class='attachment-woocommerce_thumbnail size-woocommerce_thumbnail woodmart-lazy-load woodmart-lazy-fade woodmart-loaded']"));
        webElement3.click();
        WebElement webElement4 = driver.findElement(By.xpath("//button[@name='add-to-cart']"));
        webElement4.click();
    }
}
