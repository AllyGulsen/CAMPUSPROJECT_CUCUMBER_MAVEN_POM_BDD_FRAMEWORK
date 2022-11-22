package STEPDEFINITIONS;

import POM.DialogContentElements;
import POM.NavigationBarElements;
import io.cucumber.java.en.*;

public class SchoolLocationsSteps {

    NavigationBarElements navigationBarElements;
    DialogContentElements dialogContentElements;

    @When("Admin User navigate to School Location Section")
    public void admin_user_navigate_to_school_location_section() {
       navigationBarElements=new NavigationBarElements();
       navigationBarElements.navigateToLocationsSection();
    }

    @When("Admin User Add School Location by entering Location Name {string}, Short Name {string}, Capacity {string}")
    public void admin_user_add_school_location_by_entering_location_name_short_name_capacity(String locationName, String shortName, String capacity) {
        dialogContentElements =new DialogContentElements();
        dialogContentElements.addLocation(locationName, shortName, capacity);
    }

    @When("Admin User Edit School Location by changing Capacity to {string}")
    public void admin_user_edit_school_location_by_changing_capacity_to(String updatedCapacity) {
        dialogContentElements= new DialogContentElements();
        dialogContentElements.editLocation(updatedCapacity);
    }

    @When("Admin User Delete School Location")
    public void admin_user_delete_school_location() {
        dialogContentElements= new DialogContentElements();
        dialogContentElements.deleteLocation();

    }


}
