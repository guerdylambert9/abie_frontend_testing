package org.guerdy.lambert.frontend.utilities.registration_pages;

import org.guerdy.lambert.frontend.base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


public class RegistrationElementPage extends BaseTest {
    public static WebElement GetFirstName() {
        return driver.findElement(By.cssSelector(registerLocatorsProp.getProperty("firstname_inputfield")));
    }
    public static WebElement GetFirstNameErrorMessage() {
        return driver.findElement(By.xpath(registerLocatorsProp.getProperty("firstname_error_message")));
    }
    public static WebElement GetLastName() {
        return driver.findElement(By.xpath(registerLocatorsProp.getProperty("lastname_inputfield")));
    }
    public static WebElement GetLastNameErrorMessage() {
        return driver.findElement(By.xpath(registerLocatorsProp.getProperty("lastname_error_message")));
    }
    public static WebElement GetEmailInputField() {
        return driver.findElement(By.cssSelector(registerLocatorsProp.getProperty("email_inputfield")));
    }
    public static WebElement GetEmailErrorMessage() {
        return driver.findElement(By.xpath(registerLocatorsProp.getProperty("email_error_message")));
    }
    public static WebElement GetPasswordInputField() {
        return driver.findElement(By.xpath(registerLocatorsProp.getProperty("password_inputfield")));
    }
    public static WebElement GetUnsatisfiedPasswordErrorMessage() {
        return driver.findElement(By.xpath(registerLocatorsProp.getProperty("unsatisfied_password_error_message")));
    }
    public static WebElement GetUnmatchedPasswordErrorMessage() {
        return driver.findElement(By.xpath(registerLocatorsProp.getProperty("unmatched_password_error_message")));
    }
    public static WebElement GetPasswordErrorMessage() {
        return driver.findElement(By.cssSelector(registerLocatorsProp.getProperty("password_error_message")));
    }
    public static WebElement GetConfirmPasswordInputField() {
        return driver.findElement((By.xpath(registerLocatorsProp.getProperty("confirm_password_inputfield"))));
    }
    public static WebElement GetConfirmPasswordErrorMessage() {
        return driver.findElement(By.xpath(registerLocatorsProp.getProperty("confirm_password_error_message")));
    }
    public static WebElement GetRegistrationType() {
        return driver.findElement(By.xpath(registerLocatorsProp.getProperty("registrationtype_dropdown")));
    }
    public static WebElement GetStartNowButton() {
        return driver.findElement(By.xpath(registerLocatorsProp.getProperty("start_now_button")));
    }
    public static WebElement GetRegisterButton() {
        return driver.findElement(By.xpath(registerLocatorsProp.getProperty("register_button")));
    }
    public static WebElement GetNextStep() {
        return driver.findElement(By.xpath(registerLocatorsProp.getProperty("next_step_btn")));
    }

    //********** Step 2 State and Licence Number Field Retrieval methods **********
    public static WebElement GetStateDropdown() {        //WebElement
        return driver.findElement(By.xpath(registerLocatorsProp.getProperty("state_dropdown")));
    }
    public static WebElement GetLicenseNumberField() {
        return driver.findElement(By.xpath(registerLocatorsProp.getProperty("license_number_field")));
    }
    public static WebElement GetCheckEligibilityButton() {
        return driver.findElement(By.xpath(registerLocatorsProp.getProperty("check_eligibility_btn")));
    }
    public static WebElement GetActiveLicenseStatusMessage() {
        return driver.findElement(By.xpath(registerLocatorsProp.getProperty("active_license_message")));
    }
    public static WebElement GetAlreadyUsedActiveLicenseMessage() {
        return driver.findElement(By.xpath(registerLocatorsProp.getProperty("already_used_active_license_message")));
    }
    public static WebElement GetInactiveLicenseErrorMessage() {
        return driver.findElement(By.xpath(registerLocatorsProp.getProperty("inactive_license_error_message")));
    }
    public static WebElement GetWrongStateForInputLicenseNumber() {
        return driver.findElement(By.xpath(registerLocatorsProp.getProperty("wrong_state_for_input_license_number")));
    }
    public static WebElement GetHomeownerInputFieldName() {
        return driver.findElement(By.xpath(registerLocatorsProp.getProperty("homeowner_input_field_name")));
    }

    //********** Step 3 Select your plan methods **********

    //********** Step 4 Select your plan methods **********
    public static WebElement GetFreemiumPlan() {
        return driver.findElement(By.xpath(registerLocatorsProp.getProperty("freemium_plan")));
    }
    public static WebElement GetAbieSPlan() {
        return driver.findElement(By.xpath(registerLocatorsProp.getProperty("abie_s_plan")));
    }
    public static WebElement GetAbieSMonthlyOptionPlan() {
        return driver.findElement(By.xpath(registerLocatorsProp.getProperty("abie_s_monthly_option_plan")));
    }
    public static WebElement GetAbieSYearlyOptionPlan() {
        return driver.findElement((By.xpath(registerLocatorsProp.getProperty("abie_s_yearly_option_plan"))));
    }
    public static WebElement GetHomeownerPlan() {
        return driver.findElement(By.xpath(registerLocatorsProp.getProperty("homeowner_plan")));
    }
    public static WebElement GetSubscribeButton() {
        return driver.findElement(By.xpath(registerLocatorsProp.getProperty("subscribe_button")));
    }
    public static Select GetAppraiserOption() {
        WebElement registrationType = GetRegistrationType();
        Select select = new Select(registrationType);
        select.selectByVisibleText("APPRAISER");
        return select;
    }
    public static Select GetBrokerOption() {
        WebElement registrationType = GetRegistrationType();
        Select select = new Select(registrationType);
        select.selectByVisibleText("BROKER");
        return select;
    }
    public static Select GetHomeownerOption() {
        WebElement registrationType = GetRegistrationType();
        Select select = new Select(registrationType);
        select.selectByVisibleText("HOMEOWNER");
        return select;
    }
    public static Select GetStateOption(String state) {
        Select dropdownState = new Select(GetStateDropdown());
        dropdownState.selectByValue(state);

        return dropdownState;
    }

    public static Select GetLenderOption() {
        WebElement registrationType = GetRegistrationType();
        Select select = new Select(registrationType);
        return select;
    }
}
