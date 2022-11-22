package STEPDEFINITIONS;

import POM.DialogContentElements;
import POM.NavigationBarElements;
import io.cucumber.java.en.*;

public class FieldsSteps {

    NavigationBarElements navigationBarElements;
    DialogContentElements dialogContentElements;

    @When("Admin User navigate to Fields Section")
    public void admin_user_navigate_to_fields_section() {
    navigationBarElements= new NavigationBarElements();
    navigationBarElements.navigateToFieldsSection();
    }

    @When("Admin User Add Fields by entering Field Name {string}, Code {string}")
    public void admin_user_add_fields_by_entering_field_name_code(String fieldName, String code) {
    dialogContentElements=new DialogContentElements();
    dialogContentElements.addFields(fieldName, code);
    }

    @When("Admin User Edit Fields by changing Code to {string}")
    public void admin_user_edit_fields_by_changing_code_to(String updatedFieldCode) {
    dialogContentElements= new DialogContentElements();
    dialogContentElements.editFields(updatedFieldCode);
    }

    @When("Admin User Delete Fields")
    public void admin_user_delete_fields() {
    dialogContentElements=new DialogContentElements();
    dialogContentElements.deleteFields();
    }



}
