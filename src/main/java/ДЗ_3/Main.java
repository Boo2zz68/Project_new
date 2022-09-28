package ДЗ_3;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
public class Main {
    public static void main( String[] args ) {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        options.addArguments("start-maximized");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.get("https://www.chitai-gorod.ru/");
        WebElement webElement1 = driver.findElement(By.cssSelector("input[placeholder='Поиск...']"));
        webElement1.sendKeys("книга");
        WebElement webElement2 = driver.findElement(By.cssSelector("body > div:nth-child(21) > header:nth-child(1) > div:nth-child(3) > nav:nth-child(4) > div:nth-child(1) > ul:nth-child(1) > li:nth-child(1) > a:nth-child(1) > b:nth-child(1)"));
        webElement2.click();
    }
}
