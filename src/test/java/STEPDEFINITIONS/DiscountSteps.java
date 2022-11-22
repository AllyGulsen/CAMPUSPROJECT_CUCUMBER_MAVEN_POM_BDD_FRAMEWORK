package STEPDEFINITIONS;

import POM.DialogContentElements;
import POM.HomePageElements;
import POM.NavigationBarElements;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;

public class DiscountSteps {


    DialogContentElements dialogContentElements;
    HomePageElements homePageElements;
    NavigationBarElements navigationBarElements;

    @When("Admin User navigate to Discount Section")
    public void admin_user_navigate_to_discount_section() {
        navigationBarElements= new NavigationBarElements();
        navigationBarElements.navigateToDiscountSection();

    }
    @When("Admin User Add Discount by entering Description Code {string}, Integration Code {string}, Priority {string}")
     public void admin_user_add_discount_by_entering_description_code_ıntegration_code_priority_priority1(String descriptionInfo, String integrationCodeInfo,String priorityInfo) {
        dialogContentElements= new DialogContentElements();
        dialogContentElements.addDiscount(descriptionInfo, integrationCodeInfo, priorityInfo);
    }

    @When("Admin User Edit Discount by Entering Description Code from {string} to {string}")
    public void admin_user_edit_discount_by_entering_description_code_from_to(String descriptionInfo, String editedDescriptionInfo) {
        dialogContentElements= new DialogContentElements();
        dialogContentElements.editDiscount(descriptionInfo,editedDescriptionInfo);
    }

    @When("Admin User Delete Discount with {string} Description")
    public void admin_user_delete_discount_with_description(String editedDescriptionInfo) throws InterruptedException {
        dialogContentElements=new DialogContentElements();
        dialogContentElements.deleteDiscount(editedDescriptionInfo);
    }




}
