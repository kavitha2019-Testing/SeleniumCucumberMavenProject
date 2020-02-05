package StepDefinitions;


import Pages.LoginPage;
import cucumber.api.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class APStepdefinition {
   public  WebDriver driver ;
   public  LoginPage LP;
    public LoginPage Lp;

    @Given("User Launch Chromebrowser")
    public void user_Launch_Chromebrowser() {
        // System.setProperty("webdriver.chrome.driver" ,"C:/Users/kavitha/Desktop/softwareFolder/chromedriver.exe" );
        System.setProperty("webdriver.chrome.driver" ,"./Drivers/chromedriver.exe" );
        driver = new ChromeDriver();
        Lp= new LoginPage();
    }
    @When("User opened URL  {string}")
    public void user_opened_URL(String string) throws InterruptedException {
       driver.get("https://www.freshworks.com/");
       driver.manage().window().maximize();
       driver.manage().deleteAllCookies();
       driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.MILLISECONDS);
       driver.manage().timeouts().implicitlyWait(30,TimeUnit.MILLISECONDS);
        Thread.sleep(5000);

       // driver.get("http://automationpractice.com/index.php?");
    }
    @Then("User verify logo of Freshworks")
    public void user_verify_logo_of_Freshworks() {
        //Boolean  B =  driver.findElement(By.className("logo img-responsive")).isDisplayed();
       Boolean B= driver.findElement(By.xpath("//a[@class='logo logo-fworks']")).isDisplayed();
        Assert.assertTrue(B);
        System.out.println("Logo is displayed");
    }
    @When("User click on contactUs button")
    public void user_click_on_contactUs_button() throws InterruptedException {
  //      TO SCROLL DOWN WINDOW TILL TO BOTTOM PAGE
//       JavascriptExecutor js = (JavascriptExecutor) driver;
//       js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        System.out.println("page scroll down");
        driver.findElement(By.xpath("//div[@ class='button button--solid in-page-scroll']")).click();
        Thread.sleep(5000);
        System.out.println("User clicked properly");
    }

       @Then("close browser")
    public void close_browser() {
        driver.close();
    }
    }
