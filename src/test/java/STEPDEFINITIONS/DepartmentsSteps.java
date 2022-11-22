package STEPDEFINITIONS;

import POM.DialogContentElements;
import POM.NavigationBarElements;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;

public class DepartmentsSteps {

    DialogContentElements dialogContentElements;
    NavigationBarElements navigationBarElements;

    @When("Admin User navigate to Departments Section")
    public void admin_user_navigate_to_departments_section() {
        navigationBarElements= new NavigationBarElements();
        navigationBarElements.navigateToDepartmentsSection();

    }
    @When("Admin User Add Department by entering Department Name {string}, Departmant Code {string}")
    public void admin_user_add_department_by_entering_department_name_departmant_code(String departmentName, String departmentCode) throws InterruptedException {
        dialogContentElements=new DialogContentElements();
        dialogContentElements.addDepartments(departmentName, departmentCode);

    }

    @When("Admin User Edit Department by changing Department Code to {string}")
    public void admin_user_edit_department_by_changing_department_code_to(String updatedDepartmentCode) {
        dialogContentElements=new DialogContentElements();
        dialogContentElements.editDepartments(updatedDepartmentCode);

    }

    @When("Admin User Delete Department")
    public void admin_user_delete_department() {
        dialogContentElements=new DialogContentElements();
        dialogContentElements.deleteDepartments();

    }



}
