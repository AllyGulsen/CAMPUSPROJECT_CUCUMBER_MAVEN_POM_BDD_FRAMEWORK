package STEPDEFINITIONS;

import POM.DialogContentElements;
import POM.NavigationBarElements;
import io.cucumber.java.en.*;

public class PositionsSteps {

    NavigationBarElements navigationBarElements;
    DialogContentElements dialogContentElements;

    @When("Admin User navigate to Positions Section")
    public void admin_user_navigate_to_positions_section() {
        navigationBarElements= new NavigationBarElements();
        navigationBarElements.navigateToPositionsSection();
    }

    @When("Admin User Add Positions by entering Position Name {string}, Short Name {string}")
    public void admin_user_add_positions_by_entering_position_name_short_name(String positionName, String shortName) {
        dialogContentElements= new DialogContentElements();
        dialogContentElements.addPosition(positionName, shortName);
    }

    @When("Admin User Edit Positions from {string} by changing Position Name to {string}, Short Name to {string}")
    public void admin_user_edit_positions_from_by_changing_position_name_to_short_name_to(String searchName, String updatedPositionName, String updatedShortName) {
        dialogContentElements=new DialogContentElements();
        dialogContentElements.editPosition(searchName, updatedPositionName, updatedShortName);
    }

    @When("Admin User Delete Positions")
    public void admin_user_delete_positions() {
        dialogContentElements= new DialogContentElements();
        dialogContentElements.deletePosition();
    }


}
