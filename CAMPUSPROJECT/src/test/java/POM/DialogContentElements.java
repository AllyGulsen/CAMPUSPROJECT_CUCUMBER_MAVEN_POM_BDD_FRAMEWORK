package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class DialogContentElements extends BASEPOM{

    public DialogContentElements (){PageFactory.initElements(driver,this);}


    @FindBy(xpath = "//ms-add-button[contains(@tooltip,'TITLE.ADD')]//button")
    private WebElement addButton;

    @FindBy(xpath ="//ms-text-field[@formcontrolname='name']//input")
    private WebElement nameInput;

    @FindBy(xpath = "//ms-text-field[contains(@placeholder, 'GENERAL.FIELD.SHORTNAME')]//input")
    private WebElement shortNameInput;

    @FindBy(xpath = "(//mat-select[@role='combobox'])[2]")
    private WebElement nextGradeSelectBox;

    @FindBy(css = "div[role='listbox']")
    private WebElement nextGradeListBox;

    @FindBy(tagName = "ms-save-button")
    private WebElement saveButton;

    @FindBy(xpath="//ms-text-field[@placeholder='GENERAL.FIELD.NAME']//input")
    private WebElement searchNameInput;

    @FindBy(tagName = "ms-search-button")
    private WebElement searchButton;


    @FindBy(xpath = "//div[contains(text(),'successfully')]")
    private WebElement SuccessMessage;

    @FindBy(css = "ms-edit-button>button")
    private WebElement editButton;

    @FindBy(css = "ms-delete-button")
    private WebElement deleteButton;

    @FindBy(xpath = "//span[text()=' Delete ']")
    private WebElement submitDeleteButton;

    @FindBy(css = "#ms-text-field-0>input")
    private WebElement discountSearchDescriptionInputBox;

    @FindBy(xpath="//ms-text-field[@placeholder='GENERAL.FIELD.CODE']//input")
    private WebElement CodeInputBox;

    @FindBy(xpath = "(//ms-text-field[@placeholder='DISCOUNT.TITLE.DESCRIPTION']//input)[2]")
    private WebElement newDescriptionInputBox;

    @FindBy(css = "ms-text-field[placeholder='GENERAL.FIELD.INTEGRATION_CODE']>input")
    private WebElement integrationCodeInputBox;

    @FindBy(css = "ms-integer-field[placeholder='GENERAL.FIELD.PRIORITY']>input")
    private WebElement priorityInputBox;

    @FindBy(css = "ms-text-field[placeholder='GENERAL.FIELD.ORDER']>input")
    private WebElement orderInput;

    @FindBy(xpath = "//span[text()=' lec10 ']/..")
    private WebElement nextGradeOption;

    @FindBy(xpath = "//td[text()='LECTURE1']/..//ms-edit-button//button")
    private WebElement editButtonForLecture1;

    @FindBy(xpath = "//td[text()='LECTURE1']/..//ms-delete-button//button")
    private WebElement deleteButtonForLecture1;

    @FindBy(css = "ms-masked-text-field[formcontrolname='iban']>input")
    private WebElement ibanInputBox;

    @FindBy(css = "(//mat-select[@role='combobox'])[3]")
    private WebElement currencyOptionTriggerBox;

    @FindBy(css = "div[role='listbox']")
    private WebElement listOfOptionBox;

    @FindBy(xpath = "//span[text()=' USD ']")
    private WebElement usdCurrencyOption;

    @FindBy(xpath = "//td[text()='UpdatedUserNameForBankAccount']/..//ms-delete-button")
    private WebElement bankAccountDeleteButton;

    @FindBy(id = "#container-3")
    private WebElement pageContainer;

    @FindBy(xpath = "//div[text()='Campus Project']/..")
    private WebElement schoolOptionContainer;



    @FindBy(xpath = "//span[text()='New Auckland School']")
    private WebElement campusProjectSchoolOption;

    @FindBy(xpath = "(//td[text()='SDET']/..//button)[1]")
    private WebElement editButtonForSchoolDepartment;

    @FindBy(xpath = "(//td[text()='SDET']/..//button)[2]")
    private WebElement deleteButtonForDepartments;



    @FindBy(xpath = "//span[text()=' New Auckland School ']")
    private WebElement schoolOptionNewAuckland;

    @FindBy(xpath = "(//mat-select[@role='combobox'])[3]")
    private WebElement locationType;

    @FindBy(css = "ms-integer-field[formcontrolname='capacity']>input")
    private WebElement capacityInput;

    @FindBy(xpath = "//span[text()=' Laboratory ']")
    private WebElement locationTypeOptionLaboratory;

    @FindBy(xpath = "(//mat-select[@role='combobox'])[1]//div")
    private WebElement schoolSelectBox;


    @FindBy(xpath = "(//div[contains(@class,'mat-select-arrow-wrapper')])[1]")
    private WebElement arrowWrapper;

    @FindBy(xpath = "(//td[text()=' SCHL ']/..//button)[1]")
    private WebElement schoolLocationEditButton;

    @FindBy(xpath = "//td[text()=' SCHL ']/..//ms-delete-button")
    private WebElement schoolLocationDeleteButton;


    @FindBy(xpath = "(//ms-text-field[@placeholder='GENERAL.FIELD.CODE']//input)[2]")
    private WebElement subjectCategoryCodeInput;

    @FindBy(xpath = "//td[text()='MySubjectCat']/..//ms-delete-button")
    private WebElement subjectCategoryDeleteButton;

    @FindBy(xpath = "//td[text()='Professor']/..//ms-edit-button")
    private WebElement positionsEditButton;

    @FindBy(xpath = "//td[text()='Assistant Professor']/..//ms-delete-button")
    private WebElement positionsDeleteButton;

    @FindBy(xpath = "(//ms-text-field[contains(@placeholder, 'GENERAL.FIELD.SHORTNAME')]//input)[2]")
    private WebElement positionShortNameInput;

    @FindBy(xpath="(//ms-text-field[@placeholder='GENERAL.FIELD.CODE']//input)[2]")
    private WebElement newFieldCodeInputBox;

    @FindBy(xpath = "(//div[contains(@class,'mat-select-arrow-wrapper')])[2]")
    private WebElement fieldArrowWrapper;

    @FindBy(xpath = "//span[text()=' Date ']")
    private WebElement fieldDateOption;

    @FindBy(xpath = "(//td[text()='Class Dates']/..//button)[1]")
    private WebElement fieldEditButton;

    @FindBy(xpath = "(//td[text()='Class Dates']/..//button)[2]")
    private WebElement fieldDeleteButton;

    @FindBy(css = "ms-add-button[tooltip='GENERAL.BUTTON.ADD']")
    private WebElement fieldAddButton;

    @FindBy(xpath = "(//mat-select[@role='combobox'])[3]")
    private WebElement stageSelectBox;

    @FindBy(xpath = "//span[text()=' Contract ']")
    private WebElement stageContractOption;

    @FindBy(css = "textarea[formcontrolname='description']")
    private WebElement documentDescriptionInputBox;

    @FindBy(xpath = "//td[text()='Salary Information']/..//ms-edit-button")
    private WebElement documentEditButton;

    @FindBy(xpath = "(//td[text()='Salary Information']/..//button)[2]")
    private WebElement documentDeleteButton;

    @FindBy(xpath = "//td[text()='SDET Certificate']/..//ms-edit-button")
    private WebElement attestationsEditButton;

    @FindBy(xpath = "(//td[text()='SDET Certificate Attestation']/..//button)[2]")
    private WebElement attestationsDeleteButton;

    @FindBy(css = "button[type='submit']")
    private WebElement positionCategoriesDeleteButton;

    public void addNationalities(String firstAddedNationality){
        addButton.click();
        nameInput.sendKeys(firstAddedNationality);
        saveButton.click();
    }

    public void validateSuccessMessage(){
        wait.until(ExpectedConditions.visibilityOf(SuccessMessage));
        Assert.assertTrue(SuccessMessage.isDisplayed());
        Assert.assertTrue(SuccessMessage.getText().toLowerCase().contains("successfully"));
    }

    public void editNationalities(String firstAddedNationality, String editedNationality){
        searchNameInput.sendKeys(firstAddedNationality);
        searchButton.click();
        editButton.click();
        nameInput.clear();
        nameInput.sendKeys(editedNationality);
        saveButton.click();
    }


    public void deleteNationalities(String editedNationality) throws InterruptedException {
        searchNameInput.sendKeys(editedNationality);
        searchButton.click();
        Thread.sleep(3000);
        deleteButton.click();
        submitDeleteButton.click();

    }

    public void addDiscount(String descriptionInfo, String integrationCodeInfo,String priorityInfo) {

        addButton.click();
        newDescriptionInputBox.sendKeys(descriptionInfo);
        wait.until(ExpectedConditions.visibilityOf(newDescriptionInputBox));
        integrationCodeInputBox.sendKeys(integrationCodeInfo);
        priorityInputBox.sendKeys(priorityInfo);
        saveButton.click();
    }

    public void editDiscount(String descriptionInfo, String editedDescriptionInfo){
        discountSearchDescriptionInputBox.sendKeys(descriptionInfo);
        searchButton.click();
        editButton.click();
        newDescriptionInputBox.clear();
        newDescriptionInputBox.sendKeys(editedDescriptionInfo);
        saveButton.click();

    }

    public void deleteDiscount(String editedDescriptionInfo) throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        discountSearchDescriptionInputBox.sendKeys(editedDescriptionInfo);
        searchButton.click();
        deleteButton.click();
        wait.until(ExpectedConditions.elementToBeClickable(deleteButton));
        submitDeleteButton.click();
        wait.until(ExpectedConditions.visibilityOf(submitDeleteButton));
        wait.until(ExpectedConditions.elementToBeClickable(submitDeleteButton));
    }

    public void addGradeLevel(String courseName, String shortName, String order){
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        addButton.click();
        nameInput.sendKeys(courseName);
        shortNameInput.sendKeys(shortName);
        orderInput.sendKeys(order);

        nextGradeSelectBox.click();
        Actions action= new Actions(driver);
        action.moveToElement(nextGradeListBox).perform();
        action.moveToElement(nextGradeOption).perform();
        nextGradeOption.click();
        wait.until(ExpectedConditions.elementToBeClickable(nextGradeOption));
        saveButton.click();

    }

    public void editGradeLevel(String order2){
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        editButtonForLecture1.click();
        orderInput.clear();
        orderInput.sendKeys(order2);
        saveButton.click();
        System.out.println("ORDER 2: "+ order2);



    }


    public void deleteGradeLevel(){
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
    deleteButtonForLecture1.click();
    submitDeleteButton.click();
    wait.until(ExpectedConditions.elementToBeClickable(submitDeleteButton));
    }

    public void addBankAccount(String userName, String iban, String integrationCode){
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        addButton.click();
        nameInput.sendKeys(userName);
        ibanInputBox.sendKeys(iban);
        integrationCodeInputBox.sendKeys(integrationCode);
        currencyOptionTriggerBox.click();
        Actions action= new Actions(driver);
        action.moveToElement(listOfOptionBox);
        action.moveToElement(usdCurrencyOption);
        usdCurrencyOption.click();
        saveButton.click();

    }
    public void editBankAccount(String userNameForSearch, String updatedUserName){
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        searchNameInput.sendKeys(userNameForSearch);
        searchButton.click();
        editButton.click();
        wait.until(ExpectedConditions.elementToBeClickable(editButton));
        nameInput.clear();
        nameInput.sendKeys(updatedUserName);
        saveButton.click();

    }

    public void deleteBankAccount(){
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        bankAccountDeleteButton.click();
        submitDeleteButton.click();
    }

    public void addDepartments(String departmantName,String schoolDepartmentCode) throws InterruptedException {

        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        Actions action= new Actions(driver);
        schoolSelectBox.click();
        action.moveToElement(listOfOptionBox).perform();
        action.moveToElement(schoolOptionNewAuckland).perform();
        schoolOptionNewAuckland.click();
        searchButton.click();

        addButton.click();
        nameInput.sendKeys(departmantName);
        CodeInputBox.sendKeys(schoolDepartmentCode);
        saveButton.click();
    }

    public void editDepartments(String updatedDepartmentCode){
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        Actions action= new Actions(driver);
        schoolSelectBox.click();
        action.moveToElement(listOfOptionBox).perform();
        wait.until(ExpectedConditions.visibilityOf(listOfOptionBox));
        action.moveToElement(schoolOptionNewAuckland).perform();
        wait.until(ExpectedConditions.visibilityOf(schoolOptionNewAuckland));
        schoolOptionNewAuckland.click();
        wait.until(ExpectedConditions.textToBePresentInElement(schoolOptionNewAuckland,"New Auckland School"));
        searchButton.click();


        editButtonForSchoolDepartment.click();
        wait.until(ExpectedConditions.elementToBeClickable(editButtonForSchoolDepartment));
        CodeInputBox.clear();
        CodeInputBox.sendKeys(updatedDepartmentCode);
        saveButton.click();

    }

    public void deleteDepartments(){
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        Actions action= new Actions(driver);
        schoolSelectBox.click();
        wait.until(ExpectedConditions.visibilityOf(schoolSelectBox));
        wait.until(ExpectedConditions.elementToBeClickable(schoolSelectBox));
        action.moveToElement(listOfOptionBox).perform();
        action.moveToElement(schoolOptionNewAuckland).perform();
        schoolOptionNewAuckland.click();
        searchButton.click();

        deleteButtonForDepartments.click();
        wait.until(ExpectedConditions.visibilityOf(deleteButtonForDepartments));
        wait.until(ExpectedConditions.elementToBeClickable(deleteButtonForDepartments));
        submitDeleteButton.click();
    }

    public void addLocation(String locationName, String shortName, String capacity){
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        Actions action= new Actions(driver);
       arrowWrapper.click();
        waitUntilVisibleClickable(arrowWrapper);
        action.moveToElement(listOfOptionBox).perform();
        waitUntilVisible(listOfOptionBox);
        action.moveToElement(schoolOptionNewAuckland).perform();
        waitUntilVisible(schoolOptionNewAuckland);
        schoolOptionNewAuckland.click();
        waitUntilVisibleClickable(schoolOptionNewAuckland);
        searchButton.click();
        waitUntilVisibleClickable(searchButton);

        addButton.click();
        nameInput.sendKeys(locationName);
        shortNameInput.sendKeys(shortName);
        capacityInput.clear();
        capacityInput.sendKeys(capacity);
        locationType.click();
        action.moveToElement(listOfOptionBox).perform();
        action.moveToElement(locationTypeOptionLaboratory).perform();
        locationTypeOptionLaboratory.click();
        saveButton.click();
    }

    public void editLocation(String updatedCapacity){
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        Actions action= new Actions(driver);
        arrowWrapper.click();
        waitUntilVisibleClickable(arrowWrapper);
        action.moveToElement(listOfOptionBox).perform();
        waitUntilVisible(listOfOptionBox);
        action.moveToElement(schoolOptionNewAuckland).perform();
        waitUntilVisible(schoolOptionNewAuckland);
        schoolOptionNewAuckland.click();
        waitUntilVisibleClickable(schoolOptionNewAuckland);
        searchButton.click();
        waitUntilVisibleClickable(searchButton);

        schoolLocationEditButton.click();
        capacityInput.clear();
        capacityInput.sendKeys(updatedCapacity);
        saveButton.click();

    }

    public void deleteLocation(){
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        Actions action= new Actions(driver);
        arrowWrapper.click();
        waitUntilVisibleClickable(arrowWrapper);
        action.moveToElement(listOfOptionBox).perform();
        waitUntilVisible(listOfOptionBox);
        action.moveToElement(schoolOptionNewAuckland).perform();
        waitUntilVisible(schoolOptionNewAuckland);
        schoolOptionNewAuckland.click();
        waitUntilVisibleClickable(schoolOptionNewAuckland);
        searchButton.click();
        waitUntilVisibleClickable(searchButton);

        schoolLocationDeleteButton.click();
        submitDeleteButton.click();
    }

    public void addSubjectCategories(String subjectCategoryName, String subjectCategoryCode){
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        addButton.click();
        nameInput.sendKeys(subjectCategoryName);
        subjectCategoryCodeInput.sendKeys(subjectCategoryCode);
        saveButton.click();
    }

    public void editSubjectCategory(String updatedSubjectCategoryCode){
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        editButton.click();
        subjectCategoryCodeInput.clear();
        subjectCategoryCodeInput.sendKeys(updatedSubjectCategoryCode);
        saveButton.click();

    }
    public void deleteSubjectCategory(){
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        subjectCategoryDeleteButton.click();
        submitDeleteButton.click();

    }
    public void addPosition(String positionName, String shortName){
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        addButton.click();
        nameInput.sendKeys(positionName);
        positionShortNameInput.sendKeys(shortName);
        saveButton.click();
    }

    public void editPosition(String searchName, String updatedPositionName, String updatedShortName){
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        searchNameInput.sendKeys(searchName);
        searchButton.click();
        waitUntilVisibleClickable(positionsEditButton);
        editButton.click();
        nameInput.clear();
        nameInput.sendKeys(updatedPositionName);
        positionShortNameInput.clear();
        positionShortNameInput.sendKeys(updatedShortName);
        saveButton.click();
    }

    public void deletePosition(){

        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        wait.until(ExpectedConditions.urlContains("https://demo.mersys.io/employee-position"));
       positionsDeleteButton.click();
       waitUntilVisibleClickable(positionsDeleteButton);
       submitDeleteButton.click();
    }

    public void addFields(String fieldName, String code){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        fieldAddButton.click();
        nameInput.sendKeys(fieldName);
        newFieldCodeInputBox.sendKeys(code);
        fieldArrowWrapper.click();
        Actions action= new Actions(driver);
        action.moveToElement(listOfOptionBox).perform();
        action.moveToElement(fieldDateOption).perform();
        fieldDateOption.click();
        saveButton.click();
    }

    public void editFields(String updatedFieldCode){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        wait.until(ExpectedConditions.urlContains("https://demo.mersys.io/entity-fields/list"));
        fieldEditButton.click();
        newFieldCodeInputBox.clear();
        newFieldCodeInputBox.sendKeys(updatedFieldCode);
        saveButton.click();
    }
    public void deleteFields(){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        fieldDeleteButton.click();
        submitDeleteButton.click();
    }

    public void addDocument(String documentName, String documentDescription){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        addButton.click();
        stageSelectBox.click();
        nameInput.sendKeys(documentName);
        documentDescriptionInputBox.sendKeys(documentDescription);

        Actions action= new Actions(driver);
        action.moveToElement(listOfOptionBox).perform();
        action.moveToElement(stageContractOption).perform();
        stageContractOption.click();
        action.doubleClick(saveButton).perform();
    }

    public void editDocument(String documentName, String updatedDocumentDescription){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        searchNameInput.sendKeys(documentName);
        searchButton.click();
        documentEditButton.click();
        waitUntilVisibleClickable(documentEditButton);
        documentDescriptionInputBox.clear();
        documentDescriptionInputBox.sendKeys(updatedDocumentDescription);
        saveButton.click();
    }
    public void deleteDocument(String documentName){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        searchNameInput.sendKeys(documentName);
        searchButton.click();
        documentDeleteButton.click();
        waitUntilVisibleClickable(documentDeleteButton);
        submitDeleteButton.click();
    }

    public void addAttestations(String attestationName){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        addButton.click();
        nameInput.sendKeys(attestationName);
        saveButton.click();
    }

    public void editAttestations(String attestationName, String updatedAttestationName){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        searchNameInput.sendKeys(attestationName);
        searchButton.click();
        attestationsEditButton.click();
        nameInput.clear();
        nameInput.sendKeys(updatedAttestationName);
        saveButton.click();

    }
    public void deleteAttestations(String updatedAttestationName){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        searchNameInput.sendKeys(updatedAttestationName);
        searchButton.click();
        attestationsDeleteButton.click();
        waitUntilVisibleClickable(attestationsDeleteButton);
        submitDeleteButton.click();
        waitUntilVisibleClickable(submitDeleteButton);

    }
    public void addPositionCategories(String positionCategoryName){
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        addButton.click();
        nameInput.sendKeys(positionCategoryName);
        saveButton.click();
    }

    public void editPositionCategories(String positionCategoryName, String updatedPositionCategoryName){
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        searchNameInput.sendKeys(positionCategoryName);
        searchButton.click();
        editButton.click();
        waitUntilVisibleClickable(editButton);
        nameInput.clear();
        nameInput.sendKeys(updatedPositionCategoryName);
        saveButton.click();
    }

    public void deletePositionCategories(String updatedPositionCategoryName) throws InterruptedException {

        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        searchNameInput.sendKeys(updatedPositionCategoryName);
        searchButton.click();
        deleteButton.click();
        Thread.sleep(2);
        submitDeleteButton.click();


    }





    /*
    @FindBy()
    private WebElement

     */



}
