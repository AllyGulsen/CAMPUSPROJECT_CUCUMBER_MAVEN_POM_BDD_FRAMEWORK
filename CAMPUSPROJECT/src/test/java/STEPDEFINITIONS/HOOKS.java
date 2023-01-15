package STEPDEFINITIONS;

import POM.BASEPOM;
import UTILS.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class HOOKS extends BASEPOM {
    /// HOMEPAGE'E GİTMEYİ BEFORE METODA EKLEYEBİLMEK İÇİN HOOK EXTEND ETTİM VE CONSTRUCTOR YARATTIM

    public HOOKS(){PageFactory.initElements(driver,this);}

    WebDriver driver= Driver.getDriver();
   WebDriverWait wait;


    @FindBy(css = "input[formcontrolname='username']")
    private WebElement usernameInput;

    @FindBy(css = "input[formcontrolname='password']")
    private WebElement passwordInput;

    @FindBy(css = "button[aria-label='LOGIN']")
    private WebElement loginButton;

    @FindBy(xpath = "(//button[@class='consent-give'])[1]")
    private WebElement acceptCookiesButton;

    @Before
    public void setup(){
        driver.get("https://demo.mersys.io/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        usernameInput.sendKeys("xxxxusername");
        passwordInput.sendKeys("xxxpassword");
        loginButton.click();
    }




    @After
    public void teardown(){
        Driver.quitDriver();
    }

}
