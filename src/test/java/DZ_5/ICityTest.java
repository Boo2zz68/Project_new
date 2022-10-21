package DZ_5;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;

public class ICityTest extends AbstractTest {

    @Test
    void myActiontest() throws InterruptedException {

        // Создадим экземпляр класса Actions
        Actions searchElement = new Actions(driver);
        searchElement.click(driver.findElement(By.xpath("//span[@class='nav-link-text'][normalize-space()='iPhone']")))
                .click(driver.findElement(By.xpath("//li[@class='cat-item cat-item-80']//a[contains(text(),'iPhone 12 Pro')]")))
                .click(driver.findElement(By.xpath("//div[contains(@class,'type-product post-7648 status-publish first instock product_cat-iphone-12-pro product_tag-smartfon has-post-thumbnail taxable shipping-taxable purchasable product-type-simple')]//img[@class='attachment-woocommerce_thumbnail size-woocommerce_thumbnail woodmart-lazy-load woodmart-lazy-fade woodmart-loaded']")))
                .click(driver.findElement(By.xpath("//button[@name='add-to-cart']")))
                .build()
                .perform();
        Thread.sleep(1000);

    }
}
