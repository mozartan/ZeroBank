package com.zerobank.stepdefinitions;

import com.zerobank.pages.AccountActivityPage;
import com.zerobank.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class AccountActivityStepDefs {
    AccountActivityPage aaPage = new AccountActivityPage();
    @When("User navigates to {string}")
    public void user_navigates_to(String tab) {
       aaPage.navigateTo(tab);
    }

    @Then("Account drop down should have {string} selected")
    public void accountDropDownShouldHaveSelected(String expectedOption) {
        String actualOption = aaPage.getOption();
        Assert.assertEquals("Verify Account Activity Option",expectedOption,actualOption);
    }

    @And("user select {string} option")
    public void userSelectOption(String randomOption) {
        aaPage.selectOption(randomOption);
        BrowserUtils.sleep(2);
    }
}
