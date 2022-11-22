package POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class NavigationBarElements extends BASEPOM{

    public NavigationBarElements (){PageFactory.initElements(driver,this);}

    @FindBy(xpath = "//span[text()='Setup']/..")
    private WebElement setUpButton;

    @FindBy(xpath = "//span[text()='Parameters']/..")
    private WebElement parametersButton;

    @FindBy(xpath = "//span[text()='Nationalities']/..")
    private WebElement nationalitiesButton;

    @FindBy(xpath = "//span[text()='Discounts']/..")
    private WebElement discountsButton;

    @FindBy(xpath = "//span[text()='Grade Levels']/..")
    private WebElement gradeLevelButton;

    @FindBy(xpath = "//span[text()='Bank Accounts']/..")
    private WebElement bankAccountButton;

    @FindBy(xpath = "//span[text()='School Setup']/..")
    private WebElement schoolSetupButton;

    @FindBy(xpath = "//span[text()='Departments']/..")
    private WebElement departmentsButton;


    @FindBy(xpath = "//span[text()='Locations']/..")
    private WebElement locationsButton;

    @FindBy(xpath = "//span[text()='Education']/..")
    private WebElement educationButton;

    @FindBy(xpath = "(//span[text()='Setup'])[4]/..")
    private WebElement educationSetupButton;

    @FindBy(xpath = "//span[text()='Subject Categories']/..")
    private WebElement subjectCategoriesButton;

    @FindBy(xpath = "//span[text()='Human Resources']/..")
    private WebElement humanResourcesButton;

    @FindBy(xpath = "(//span[text()='Setup'])[3]/..")
    private WebElement humanResourcesSetupButton;

    @FindBy(xpath = "//span[text()='Positions']/..")
    private WebElement positionsButton;

    @FindBy(xpath = "//span[text()='Fields']/..")
    private WebElement fieldsButton;

    @FindBy(xpath = "//span[text()='Document Types']/..")
    private WebElement documentTypesButton;

    @FindBy(xpath = "//span[text()='Attestations']/..")
    private WebElement attestationsButton;

    @FindBy(xpath = "//span[text()='Position Categories']/..")
    private WebElement positionCategoriesButton;

    public void navigateToNationalitiesSection(){
        setUpButton.click();
        parametersButton.click();
        nationalitiesButton.click();
    }

    public void navigateToDiscountSection(){
        setUpButton.click();
        parametersButton.click();
        discountsButton.click();
    }

    public void navigateToGradeLevelSection(){
        setUpButton.click();
        parametersButton.click();
        gradeLevelButton.click();

    }

    public void navigateToBankAccountSection(){
        setUpButton.click();
        parametersButton.click();
        bankAccountButton.click();

    }

    public void navigateToDepartmentsSection(){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        setUpButton.click();
        schoolSetupButton.click();
        departmentsButton.click();
        wait.until(ExpectedConditions.urlContains("https://demo.mersys.io/school-department"));

    }

    public void navigateToLocationsSection(){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        setUpButton.click();
        schoolSetupButton.click();
        locationsButton.click();
        wait.until(ExpectedConditions.urlContains("https://demo.mersys.io/school-location"));
    }

    public void navigateToSubjectCategoriesSection(){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        educationButton.click();
        educationSetupButton.click();
        subjectCategoriesButton.click();
    }

    public void navigateToPositionsSection(){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        humanResourcesButton.click();
        humanResourcesSetupButton.click();
        positionsButton.click();

    }

    public void navigateToFieldsSection(){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        setUpButton.click();
        parametersButton.click();
        fieldsButton.click();
    }

    public void navigateToDocumentsType(){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        setUpButton.click();
        parametersButton.click();
        documentTypesButton.click();
    }

    public void navigateToAttestations(){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        humanResourcesButton.click();
        humanResourcesSetupButton.click();
        attestationsButton.click();
    }

    public void navigateToPositionCategories(){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        humanResourcesButton.click();
        humanResourcesSetupButton.click();
        positionCategoriesButton.click();
    }



/*

    @FindBy()
    private WebElement

 */
}
