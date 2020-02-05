package Utilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class Screenshot {
    WebDriver driver;
    public void screenshot1(){
        // TO SCROLL DOWN TILL PAGE END
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
    }
}
// //div[@class='nav-primary l-page']//ul//li//li//li//li//li//a[@href='/customers/']