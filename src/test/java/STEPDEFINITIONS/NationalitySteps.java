package STEPDEFINITIONS;

import POM.DialogContentElements;
import POM.HomePageElements;
import POM.NavigationBarElements;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;

public class NationalitySteps {

    DialogContentElements dialogContentElements;
    NavigationBarElements navigationBarElements;
    HomePageElements homePageElements;

    @Given("Admin User is  on homepage")
    public void admin_user_is_on_homepage() {
        homePageElements =new HomePageElements();
        homePageElements.userOnHomePageValidation();
    }

    @When("Admin User navigate to Nationalities Section")
    public void admin_user_navigate_to_nationalities_section() {
        navigationBarElements=new NavigationBarElements();
        navigationBarElements.navigateToNationalitiesSection();
    }

    @When("Admin User Add Nationality {string}")
    public void admin_user_add_nationality(String addedNationalityName) {
            dialogContentElements= new DialogContentElements();
            dialogContentElements.addNationalities(addedNationalityName);
    }

    @Then("Admin User should be able receive the success message")
    public void admin_user_should_be_able_receive_the_success_message() {
        dialogContentElements=new DialogContentElements();
        dialogContentElements.validateSuccessMessage();
    }


    @When("Admin User Edit Nationality from {string} to {string}")
    public void admin_user_edit_nationality_from_to(String firstAddedNationality, String editedNationalityName) {
        dialogContentElements=new DialogContentElements();
        dialogContentElements.editNationalities(firstAddedNationality, editedNationalityName);
    }


    @When("Admin User Delete Nationality {string}")
    public void admin_user_delete_nationality(String deletedNationalityName) throws InterruptedException {
        dialogContentElements=new DialogContentElements();
        dialogContentElements.deleteNationalities(deletedNationalityName);
    }







}
