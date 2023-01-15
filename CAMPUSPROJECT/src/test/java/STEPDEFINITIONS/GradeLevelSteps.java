package STEPDEFINITIONS;

import POM.DialogContentElements;
import POM.HomePageElements;
import POM.NavigationBarElements;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;

public class GradeLevelSteps {
    DialogContentElements dialogContentElements;
    NavigationBarElements navigationBarElements;
    HomePageElements homePageElements;


    @When("Admin User navigate to Grade Level section")
    public void admin_user_navigate_to_grade_level_section() {
        dialogContentElements= new DialogContentElements();
        navigationBarElements=new NavigationBarElements();

        navigationBarElements.navigateToGradeLevelSection();



    }
    @When("Admin User Add Grade Level by entering Course Name {string}, Short Name {string}, Order {string}")
    public void admin_user_add_grade_level_by_entering_course_name_short_name_order(String courseName, String shortName,String order) {
        dialogContentElements= new DialogContentElements();
        dialogContentElements.addGradeLevel(courseName, shortName,order);

    }

    @When("Admin User Edit Grade Level named {string} by Entering Order from {string} to {string}")
    public void admin_user_edit_grade_level_named_by_entering_order_from_to(String courseName, String shortName, String order2) {
        dialogContentElements= new DialogContentElements();
        dialogContentElements.editGradeLevel(order2);

    }

    @When("Admin User Delete Grade Level named  LECTURE1")
    public void admin_user_delete_grade_level_named_lecture1() {
        dialogContentElements= new DialogContentElements();
        dialogContentElements.deleteGradeLevel();
    }

}
