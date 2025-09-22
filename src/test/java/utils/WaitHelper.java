package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WaitHelper {
        WebDriver driver;
        public WaitHelper(WebDriver driver1){
            driver=driver1;
        }
        public void waitforElement(WebElement element, long timeOutofseconds){
            WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(timeOutofseconds));
            wait.until(ExpectedConditions.visibilityOf(element));
            waitforElement();
            wait;
        }
    }


