package com.orangehrmlive.demo.steps;

import com.orangehrmlive.demo.pages.AddUserPage;
import com.orangehrmlive.demo.pages.ViewSystemUsersPage;
import com.orangehrmlive.demo.utilities.Utility;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class UsersTestSteps {

    @And("^I click on Admin Tab$")
    public void iClickOnAdminTab() {
        new ViewSystemUsersPage().clickAdminLink();
    }

    @And("^I verify System Users text$")
    public void iVerifySystemUsersText() {
        new ViewSystemUsersPage().getSystemUserText();
    }

    @And("^I click on add button$")
    public void iClickOnAddButton() {
        new ViewSystemUsersPage().clickAddButton();
    }

    @And("^I verify Add User text$")
    public void iVerifyAddUserText() {
        new ViewSystemUsersPage().AddUser();
    }

    @Then("^I select User Role Admin$")
    public void iSelectUserRoleAdmin() throws InterruptedException {
        new ViewSystemUsersPage().selectAdminRole();
    }

    @And("^I enter employee name \"([^\"]*)\"$")
    public void iEnterEmployeeName(String emp) throws InterruptedException {
     new ViewSystemUsersPage().enterEmp(emp);
    }

    @And("^I select status Disable$")
    public void iSelectStatusDisable() throws InterruptedException {
        new ViewSystemUsersPage().selectDisableOption();

    }
    @And("^I enter username \"([^\"]*)\"$")
    public void iEnterUsername(String username)  {
        new ViewSystemUsersPage().enterUser(username);

    }

    @And("^I enter password \"([^\"]*)\"$")
    public void iEnterPassword(String password){
        new ViewSystemUsersPage().enterPass(password);
    }

    @And("^I enter confirm password \"([^\"]*)\"$")
    public void iEnterConfirmPassword(String confirmPassword) {
        new ViewSystemUsersPage().enterConfirmPass(confirmPassword);
    }

    @Then("^I click on save button$")
    public void iClickOnSaveButton() {
        new ViewSystemUsersPage().clickOnSaveButton();
    }

    @And("^I enter System Users Username \"([^\"]*)\"$")
    public void iEnterSystemUsersUsername(String username)  {
        new AddUserPage().enterUsername(username);
    }


    @And("^I select User Role$")
    public void iSelectUserRole() throws InterruptedException {
        new AddUserPage().selectUserRole();
    }

    @And("^I select Enable status$")
    public void iSelectEnableStatus() throws InterruptedException {
        new AddUserPage().selectStatusEnable();
    }

    @And("^I select Disable status$")
    public void iSelectDisableStatus() throws InterruptedException {
        new AddUserPage().selectStatusDisable();
    }

    @And("^I click on Search button$")
    public void iClickOnSearchButton() {
        new AddUserPage().clickSearchButton();
    }

    @Then("^I verify the user is in the result list$")
    public void iVerifyTheUserIsInTheResultList() throws InterruptedException {
        new AddUserPage().verifyResultList();

    }

    @And("^I click on checkbox$")
    public void iClickOnCheckbox() throws InterruptedException {
        new AddUserPage().clickOnCheckbox();
    }

    @Then("^I click on Delete button$")
    public void iClickOnDeleteButton() throws InterruptedException {
        new AddUserPage().clickDeleteButton();
    }


    @And("^I click on popup button$")
    public void iClickOnPopupButton() throws InterruptedException {
        new AddUserPage().popUpClick();

    }

    @Then("^I should be able to verify user Successfully Deleted$")
    public void iShouldBeAbleToVerifyUserSuccessfullyDeleted() {
        new AddUserPage().verifyMsgCheck();
    }

    @Then("^I verify No Records Found Text$")
    public void iVerifyNoRecordsFoundText() {
        new AddUserPage().VerifyNoRecordFound();
    }
}
