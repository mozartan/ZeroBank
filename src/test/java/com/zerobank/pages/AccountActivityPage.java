package com.zerobank.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class AccountActivityPage extends BasePage{

    @FindBy(id = "aa_accountId")
    public WebElement dropdownElement;

    public String getOption(){
        Select select = new Select(dropdownElement);
        return select.getFirstSelectedOption().getText();
    }

    public void selectOption(String option){
        Select select = new Select(dropdownElement);
        select.selectByVisibleText(option);
    }
}
