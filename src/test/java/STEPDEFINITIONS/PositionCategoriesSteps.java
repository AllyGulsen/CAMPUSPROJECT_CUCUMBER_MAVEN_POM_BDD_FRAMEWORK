package STEPDEFINITIONS;

import POM.DialogContentElements;
import POM.NavigationBarElements;
import io.cucumber.java.en.*;

public class PositionCategoriesSteps {
    DialogContentElements dialogContentElements;
    NavigationBarElements navigationBarElements;

    @When("Admin User navigate to Position Categories")
    public void admin_user_navigate_to_position_categories() {
        navigationBarElements= new NavigationBarElements();
        navigationBarElements.navigateToPositionCategories();
    }

    @When("Admin User add Position Categories by entering Position Category Name {string}")
    public void admin_user_add_position_categories_by_entering_position_category_name(String positionCategoryName) {
        dialogContentElements=new DialogContentElements();
        dialogContentElements.addPositionCategories(positionCategoryName);
    }

    @When("Admin User Edit Position Categories named {string} by changing Name to {string}")
    public void admin_user_edit_position_categories_named_by_changing_name_to(String positionCategoryName, String updatedPositionCategoryName) {
        dialogContentElements=new DialogContentElements();
        dialogContentElements.editPositionCategories(positionCategoryName, updatedPositionCategoryName);
    }

    @When("Admin User Position Categories named {string}")
    public void admin_user_position_categories_named(String updatedPositionCategoryName) throws InterruptedException {
        dialogContentElements=new DialogContentElements();
        dialogContentElements.deletePositionCategories(updatedPositionCategoryName);
    }

}
