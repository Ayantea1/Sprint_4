package POM;

import org.hamcrest.MatcherAssert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.concurrent.TimeUnit;
import static org.hamcrest.CoreMatchers.containsString;
import java.time.Duration;


public class PageOptions {

    public WebDriver driver;

    public PageOptions(WebDriver driver) {
        this.driver = driver;
    }

    public void clickButton (By button){
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WebElement element = driver.findElement(button);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
        driver.findElement(button).click();
    }

    public void isTextCorrect (By element, String text){
        new WebDriverWait(driver, Duration.ofSeconds(1))
                .until(driver -> (driver.findElement(element).getText().length() != 0));
        MatcherAssert.assertThat(driver.findElement(element).getText(), containsString(text));
    }
}
