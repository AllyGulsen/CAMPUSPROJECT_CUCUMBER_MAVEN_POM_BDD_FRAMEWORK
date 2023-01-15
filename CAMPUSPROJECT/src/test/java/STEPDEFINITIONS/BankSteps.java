package STEPDEFINITIONS;

import POM.DialogContentElements;
import POM.NavigationBarElements;
import io.cucumber.java.en.*;

public class BankSteps {

    DialogContentElements dialogContentElements;
    NavigationBarElements navigationBarElements;

    @When("Admin User navigate to Bank Account section")
    public void admin_user_navigate_to_bank_account_section() {
    navigationBarElements= new NavigationBarElements();
    navigationBarElements.navigateToBankAccountSection();


    }
    @When("Admin User Add Bank Account by entering User Name {string}, IBAN {string}, Currency and Integration Code {string}")
    public void admin_user_add_bank_account_by_entering_user_name_ıban_currency_and_ıntegration_code(String userName, String iban, String inregrationCode) {
    dialogContentElements=new DialogContentElements();
    dialogContentElements.addBankAccount(userName, iban, inregrationCode);

    }


    @When("Admin User Edit Bank Account of User {string} by changing name to {string}")
    public void admin_user_edit_bank_account_of_user_by_changing_name_to(String userNameForSearch, String updatedUserName) {
    dialogContentElements= new DialogContentElements();
    dialogContentElements.editBankAccount(userNameForSearch,updatedUserName);

    }

    @When("Admin User Delete Bank Account of UpdatedUserNameForBankAccount")
    public void admin_user_delete_bank_account_of_updated_user_name_for_bank_account() {
    dialogContentElements= new DialogContentElements();
    dialogContentElements.deleteBankAccount();

    }


}
