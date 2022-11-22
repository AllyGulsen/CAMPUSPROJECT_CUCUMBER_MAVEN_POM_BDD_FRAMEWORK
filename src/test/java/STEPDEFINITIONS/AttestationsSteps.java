package STEPDEFINITIONS;

import POM.DialogContentElements;
import POM.NavigationBarElements;
import io.cucumber.java.en.*;

public class AttestationsSteps {
    DialogContentElements dialogContentElements;
    NavigationBarElements navigationBarElements;

    @When("Admin User navigate to Attestations Section")
    public void admin_user_navigate_to_attestations_section() {
        navigationBarElements=new NavigationBarElements();
        navigationBarElements.navigateToAttestations();

    }

    @When("Admin User add Attestations by entering Attestations Name {string}")
    public void admin_user_add_attestations_by_entering_attestations_name(String attestationName) {
        dialogContentElements=new DialogContentElements();
        dialogContentElements.addAttestations(attestationName);

    }

    @When("Admin User Edit Attestations named {string} by changing Name to {string}")
    public void admin_user_edit_attestations_named_by_changing_name_to(String attestationName, String updatedAttestationName) {
        dialogContentElements=new DialogContentElements();
        dialogContentElements.editAttestations(attestationName,updatedAttestationName);
    }

    @When("Admin User Delete Attestations named {string}")
    public void admin_user_delete_attestations_named(String updatedAttestationName) {
        dialogContentElements=new DialogContentElements();
        dialogContentElements.deleteAttestations(updatedAttestationName);
    }

}
