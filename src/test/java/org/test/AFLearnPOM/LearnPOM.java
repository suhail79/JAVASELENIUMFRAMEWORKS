package org.test.AFLearnPOM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.test.AELearnBaseClass.Baseclass;

public class LearnPOM extends Baseclass {

    public void loginpage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "email")
    private WebElement txtUsername;

    public WebElement getTxtUsername() {
        return txtUsername;
    }


}