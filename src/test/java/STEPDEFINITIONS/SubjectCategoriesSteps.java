package STEPDEFINITIONS;

import POM.DialogContentElements;
import POM.NavigationBarElements;
import io.cucumber.java.en.*;

public class SubjectCategoriesSteps {
    NavigationBarElements navigationBarElements;
    DialogContentElements dialogContentElements;

    @When("Admin User navigate to Subject Categories Section")
    public void admin_user_navigate_to_subject_categories_section() {
        navigationBarElements= new NavigationBarElements();
        navigationBarElements.navigateToSubjectCategoriesSection();
    }

    @When("Admin User Add Subject Categories by entering Subject Category Name {string}, Code {string}")
    public void admin_user_add_subject_categories_by_entering_subject_category_name_code(String subjectCategoryName, String subjectCategoryCode) {
        dialogContentElements= new DialogContentElements();
        dialogContentElements.addSubjectCategories(subjectCategoryName, subjectCategoryCode);
    }

    @When("Admin User Edit Subject Categories by changing Code to {string}")
    public void admin_user_edit_subject_categories_by_changing_code_to(String updatedSubjectCategoryCode) {
        dialogContentElements= new DialogContentElements();
        dialogContentElements.editSubjectCategory(updatedSubjectCategoryCode);
    }

    @When("Admin User Delete Subject Categories")
    public void admin_user_delete_subject_categories() {
        dialogContentElements = new DialogContentElements();
        dialogContentElements.deleteSubjectCategory();
    }

}
