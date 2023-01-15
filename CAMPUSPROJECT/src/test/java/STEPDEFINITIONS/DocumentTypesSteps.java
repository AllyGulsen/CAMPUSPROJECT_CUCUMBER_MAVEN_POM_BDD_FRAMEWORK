package STEPDEFINITIONS;

import POM.DialogContentElements;
import POM.NavigationBarElements;
import io.cucumber.java.en.*;

public class DocumentTypesSteps {
    DialogContentElements dialogContentElements;
    NavigationBarElements navigationBarElements;

    @When("Admin User navigate to Document Types Section")
    public void admin_user_navigate_to_document_types_section() {
       navigationBarElements= new NavigationBarElements();
       navigationBarElements.navigateToDocumentsType();
    }

    @When("Admin User add Document Types by entering Document Name {string}, Description {string}")
    public void admin_user_add_document_types_by_entering_document_name_description(String documentName, String documentDescription) {
        dialogContentElements= new DialogContentElements();
        dialogContentElements.addDocument(documentName,documentDescription);
    }


    @When("Admin User Edit Document Types named {string} by changing Description to {string}")
    public void admin_user_edit_document_types_named_by_changing_description_to(String documentName, String updatedDocumentDescription) {
        dialogContentElements=new DialogContentElements();
        dialogContentElements.editDocument(documentName, updatedDocumentDescription);
    }

    @When("Admin User Delete Document Types named {string}")
    public void admin_user_delete_document_types_named(String documentName) {
        dialogContentElements=new DialogContentElements();
        dialogContentElements.deleteDocument(documentName);
    }


}
