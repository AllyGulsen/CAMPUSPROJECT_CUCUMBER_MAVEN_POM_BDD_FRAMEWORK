package POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class HomePageElements extends BASEPOM{


    public HomePageElements(){PageFactory.initElements(driver,this);}


        @FindBy(xpath = "(//span[contains(text(),'Dashboard')])[2]")
        private WebElement loginValidationDashboardText;


    public void userOnHomePageValidation(){

        wait.until(ExpectedConditions.visibilityOf(loginValidationDashboardText));
        Assert.assertTrue(loginValidationDashboardText.isDisplayed());
    }






}
