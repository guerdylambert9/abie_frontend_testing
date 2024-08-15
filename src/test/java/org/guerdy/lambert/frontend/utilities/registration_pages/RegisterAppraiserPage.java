package org.guerdy.lambert.frontend.utilities.registration_pages;

import org.guerdy.lambert.frontend.base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

import static org.guerdy.lambert.frontend.utilities.registration_pages.RegistrationElementPage.*;
import static org.guerdy.lambert.frontend.utilities.registration_pages.RegistrationElementPage.GetActiveLicenseStatusMessage;

public class RegisterAppraiserPage extends BaseTest {

    public void Register_Appraiser_With_Freemium_Plan_With_RightCredentials() throws InterruptedException {

        //***** Step 1 Select User Type *****
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20L));

        GetStartNowButton().click();
        GetAppraiserOption();
        GetNextStep().click();

        //***** Step 2 Select State and License Number *****
        Thread.sleep(3000);
        GetStateOption(configLocatorsProp.getProperty("active_freemium_license_state"));
        GetLicenseNumberField().sendKeys(configLocatorsProp.getProperty("active_freemium_appraiser_license_number"));
        GetCheckEligibilityButton().click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(registerLocatorsProp.getProperty("license_status"))));

        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//label[text()='Active License.']")));
        Assert.assertEquals(GetActiveLicenseStatusMessage().getText(), "Active License.");
        GetNextStep().click();
        //***** Step 3 *****
        GetEmailInputField().sendKeys(configLocatorsProp.getProperty("email"));
        GetPasswordInputField().sendKeys(configLocatorsProp.getProperty("password"));
        GetConfirmPasswordInputField().sendKeys(configLocatorsProp.getProperty("password"));
        Thread.sleep(3000);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(registerLocatorsProp.getProperty("register_button"))));
        GetRegisterButton().click();
        //***** Step 4 *****
        GetFreemiumPlan().click();
        GetNextStep().click();

    }

    public void Register_Appraiser_With_AbieS_Monthly_Plan_With_RightCredentials() throws InterruptedException {
        //***** Step 1 Select User Type *****
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20L));

        GetStartNowButton().click();
        GetAppraiserOption();
        GetNextStep().click();

        //***** Step 2 Select State and License Number *****
        Thread.sleep(3000);
        GetStateOption(configLocatorsProp.getProperty("active_abies_monthly_license_state"));
        GetLicenseNumberField().sendKeys(configLocatorsProp.getProperty("active_abies_monthly_appraiser_license_number"));
        GetCheckEligibilityButton().click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(registerLocatorsProp.getProperty("license_status"))));

        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//label[text()='Active License.']")));
        //wait.until(ExpectedConditions.textToBe(By.xpath(registerLocatorsProp.getProperty("active_license_message")), "Active License."));
        Assert.assertEquals(GetActiveLicenseStatusMessage().getText(), "Active License.");

        GetNextStep().click();
        //***** Step 3 *****
        GetEmailInputField().sendKeys(configLocatorsProp.getProperty("email"));
        GetPasswordInputField().sendKeys(configLocatorsProp.getProperty("password"));
        GetConfirmPasswordInputField().sendKeys(configLocatorsProp.getProperty("password"));
        Thread.sleep(3000);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(registerLocatorsProp.getProperty("register_button"))));
        GetRegisterButton().click();
        //***** Step 4 *****
        GetAbieSPlan().click();
        GetAbieSMonthlyOptionPlan().click();

        GetNextStep().click();
    }

    public void Register_Appraiser_With_AbieS_Yearly_Plan_With_RightCredentials() throws InterruptedException {
        //***** Step 1 Select User Type *****
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20L));

        GetStartNowButton().click();
        GetAppraiserOption();
        GetNextStep().click();

        //***** Step 2 Select State and License Number *****
        Thread.sleep(3000);
        GetStateOption(configLocatorsProp.getProperty("active_abies_yearly_license_state"));
        GetLicenseNumberField().sendKeys(configLocatorsProp.getProperty("active_abies_yearly_appraiser_license_number"));
        GetCheckEligibilityButton().click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(registerLocatorsProp.getProperty("license_status"))));

        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//label[text()='Active License.']")));
        Assert.assertEquals(GetActiveLicenseStatusMessage().getText(), "Active License.");
        GetNextStep().click();
        //***** Step 3 *****
        GetEmailInputField().sendKeys(configLocatorsProp.getProperty("email"));
        GetPasswordInputField().sendKeys(configLocatorsProp.getProperty("password"));
        GetConfirmPasswordInputField().sendKeys(configLocatorsProp.getProperty("password"));
        Thread.sleep(3000);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(registerLocatorsProp.getProperty("register_button"))));
        GetRegisterButton().click();
        //***** Step 4 *****
        GetAbieSPlan().click();
        GetAbieSYearlyOptionPlan().click();

        GetNextStep().click();
    }

    public void Register_Appraiser_With_Inactive_LicenseNumber() throws InterruptedException {
        //***** Step 1 Select User Type *****
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20L));

        GetStartNowButton().click();
        GetAppraiserOption();
        GetNextStep().click();

        //***** Step 2 *****
        Thread.sleep(3000);
        //VERIFY THAT THE Check Eligibility BUTTON IS GRAYED OUT
        GetStateOption(configLocatorsProp.getProperty("inactive_license_state"));
        //VERIFY THAT THE Check Eligibility BUTTON IS GRAYED OUT
        GetLicenseNumberField().sendKeys(configLocatorsProp.getProperty("inactive_appraiser_license_number"));
        //VERIFY THAT THE Check Eligibility BUTTON IS ACTIVE/NOT GRAYED OUT
        GetCheckEligibilityButton().click();

        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(registerLocatorsProp.getProperty("inactive_license_error_message"))));
        Assert.assertEquals(GetInactiveLicenseErrorMessage().getText(), "The license from the state inserted is inactive");
    }

    public void Register_Appraiser_with_Active_LicenseNumber_WrongState() throws InterruptedException {
        //***** Step 1 Select User Type *****
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20L));

        GetStartNowButton().click();
        GetAppraiserOption();
        GetNextStep().click();

        //***** Step 2 Select State and License Number *****
        Thread.sleep(5000);
        //VERIFY THAT THE Check Eligibility BUTTON IS GRAYED OUT
        GetStateOption(configLocatorsProp.getProperty("wrong_state"));
        //VERIFY THAT THE Check Eligibility BUTTON IS GRAYED OUT
        GetLicenseNumberField().sendKeys(configLocatorsProp.getProperty("active_appraiser_license_number"));
        GetCheckEligibilityButton().click();

        //Check error message
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(registerLocatorsProp.getProperty("wrong_state_for_input_license_number"))));
        Assert.assertEquals(GetWrongStateForInputLicenseNumber().getText(), "No Appraiser found with the license number from specified state");
    }

    // EMAIL FOCUSED TESTS
    public void RegisterUser_With_EmptyEmail() throws InterruptedException {
        //***** Step 1 Select User Type *****
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20L));

        GetStartNowButton().click();
        GetAppraiserOption();
        GetNextStep().click();

        //***** Step 2 Select State and License Number *****
        Thread.sleep(5000);
        GetStateOption(configLocatorsProp.getProperty("active_appraiser_license_state"));
        GetLicenseNumberField().sendKeys(configLocatorsProp.getProperty("active_appraiser_license_number"));
        GetCheckEligibilityButton().click();

        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(registerLocatorsProp.getProperty("active_license_message"))));
        Assert.assertEquals(GetActiveLicenseStatusMessage().getText(), "Active License.");
        GetNextStep().click();

        //***** Step 3 *****
        GetEmailInputField().sendKeys(" ");
        //READ ERROR MESSAGE
        //REGISTER BUTTON SHOULD BE DISABLED
        GetPasswordInputField().sendKeys(configLocatorsProp.getProperty("password"));
        //REGISTER BUTTON SHOULD BE DISABLED
        GetConfirmPasswordInputField().sendKeys(configLocatorsProp.getProperty("password"));

        //Validating that the REGISTER BUTTON is DISABLED
        Assert.assertTrue(Boolean.parseBoolean(GetRegisterButton().getAttribute("disabled")));
    }

    public void RegisterUser_With_Email_WithoutCommercial_At() throws InterruptedException {
        //***** Step 1 Select User Type *****
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20L));

        GetStartNowButton().click();
        GetAppraiserOption();
        GetNextStep().click();

        //***** Step 2 Select State and License Number *****
        Thread.sleep(5000);
        GetStateOption(configLocatorsProp.getProperty("active_appraiser_license_state"));
        GetLicenseNumberField().sendKeys(configLocatorsProp.getProperty("active_appraiser_license_number"));
        GetCheckEligibilityButton().click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(registerLocatorsProp.getProperty("active_license_message"))));

        Assert.assertEquals(GetActiveLicenseStatusMessage().getText(), "Active License.");
        GetNextStep().click();

        //***** Step 3 *****
        //GetEmailInputField().sendKeys("TestEmailgmail.com");
        GetEmailInputField().sendKeys(configLocatorsProp.getProperty("email_without_at"));
        GetPasswordInputField().sendKeys(configLocatorsProp.getProperty("password"));
        GetConfirmPasswordInputField().sendKeys(configLocatorsProp.getProperty("password"));

        String expectedEmailErrorMsg = configLocatorsProp.getProperty("enter_valid_email_error_msg");
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//label[text()='Please enter a valid email address.']")));
        //validate that the wrong password is entered
        Assert.assertEquals(expectedEmailErrorMsg, GetEmailErrorMessage().getText());
        //check that the register button is disabled
        Assert.assertTrue(Boolean.parseBoolean(GetRegisterButton().getAttribute("disabled")));
    }

    public void RegisterUser_With_Email_Without_Dotcom() throws InterruptedException {
        //***** Step 1 Select User Type *****
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20L));

        GetStartNowButton().click();
        GetAppraiserOption();
        GetNextStep().click();

        //***** Step 2 Select State and License Number *****
        Thread.sleep(3000);
        GetStateOption(configLocatorsProp.getProperty("active_appraiser_license_state"));
        GetLicenseNumberField().sendKeys(configLocatorsProp.getProperty("active_appraiser_license_number"));
        GetCheckEligibilityButton().click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(registerLocatorsProp.getProperty("active_license_message"))));

        Assert.assertEquals(GetActiveLicenseStatusMessage().getText(), "Active License.");
        GetNextStep().click();

        //***** Step 3 *****
        GetEmailInputField().sendKeys(configLocatorsProp.getProperty("email_without_dotcom"));
        GetPasswordInputField().sendKeys(configLocatorsProp.getProperty("password"));
        GetConfirmPasswordInputField().sendKeys(configLocatorsProp.getProperty("password"));

        String expectedEmailErrorMsg = configLocatorsProp.getProperty("enter_valid_email_error_msg");
        //validate that the wrong password is entered
        Assert.assertEquals(expectedEmailErrorMsg, GetEmailErrorMessage().getText());
        //check that the register button is disabled
        Assert.assertTrue(Boolean.parseBoolean(GetRegisterButton().getAttribute("disabled")));
    }

    public void RegisterUser_With_Email_Starting_With_Commercial_At() throws InterruptedException {
        //***** Step 1 Select User Type *****
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20L));

        GetStartNowButton().click();
        GetAppraiserOption();
        GetNextStep().click();

        //***** Step 2 Select State and License Number *****
        Thread.sleep(3000);
        GetStateOption(configLocatorsProp.getProperty("active_appraiser_license_state"));
        GetLicenseNumberField().sendKeys(configLocatorsProp.getProperty("active_appraiser_license_number"));
        GetCheckEligibilityButton().click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(registerLocatorsProp.getProperty("active_license_message"))));

        Assert.assertEquals(GetActiveLicenseStatusMessage().getText(), "Active License.");
        GetNextStep().click();

        //***** Step 3 *****
        GetEmailInputField().sendKeys(configLocatorsProp.getProperty("email_started_with_at"));
        GetPasswordInputField().sendKeys(configLocatorsProp.getProperty("password"));
        GetConfirmPasswordInputField().sendKeys(configLocatorsProp.getProperty("password"));

        String expectedEmailErrorMsg = configLocatorsProp.getProperty("enter_valid_email_error_msg");
        //validate that the wrong password is entered
        Assert.assertEquals(expectedEmailErrorMsg, GetEmailErrorMessage().getText());
        //check that the register button is disabled
        Assert.assertTrue(Boolean.parseBoolean(GetRegisterButton().getAttribute("disabled")));
    }

    public void RegisterUser_With_Email_Starting_With_Dotcom() throws InterruptedException {
        //***** Step 1 Select User Type *****
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20L));

        GetStartNowButton().click();
        GetAppraiserOption();
        GetNextStep().click();

        //***** Step 2 Select State and License Number *****
        Thread.sleep(5000);
        GetStateOption(configLocatorsProp.getProperty("active_appraiser_license_state"));
        GetLicenseNumberField().sendKeys(configLocatorsProp.getProperty("active_appraiser_license_number"));
        GetCheckEligibilityButton().click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(registerLocatorsProp.getProperty("active_license_message"))));

        Assert.assertEquals(GetActiveLicenseStatusMessage().getText(), "Active License.");
        GetNextStep().click();

        //***** Registration Step 3 *****
        GetEmailInputField().sendKeys(configLocatorsProp.getProperty("email_started_with_dotcom"));
        GetPasswordInputField().sendKeys(configLocatorsProp.getProperty("password"));
        GetConfirmPasswordInputField().sendKeys(configLocatorsProp.getProperty("password"));

        String expectedEmailErrorMsg = configLocatorsProp.getProperty("enter_valid_email_error_msg");
        //validate that the wrong password is entered
        Assert.assertEquals(expectedEmailErrorMsg, GetEmailErrorMessage().getText());
        //check that the register button is disabled
        Assert.assertTrue(Boolean.parseBoolean(GetRegisterButton().getAttribute("disabled")));
    }

    public void RegisterUser_With_Email_Containing_Only_CommercialAt_Gmail_Dotcom() throws InterruptedException {
        //***** Step 1 Select User Type *****
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20L));

        GetStartNowButton().click();
        GetAppraiserOption();
        GetNextStep().click();

        //***** Step 2 Select State and License Number *****
        Thread.sleep(3000);
        GetStateOption(configLocatorsProp.getProperty("active_appraiser_license_state"));
        GetLicenseNumberField().sendKeys(configLocatorsProp.getProperty("active_appraiser_license_number"));
        GetCheckEligibilityButton().click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(registerLocatorsProp.getProperty("active_license_message"))));

        Assert.assertEquals(GetActiveLicenseStatusMessage().getText(), "Active License.");
        GetNextStep().click();

        //***** Step 3 *****
        GetEmailInputField().sendKeys(configLocatorsProp.getProperty("email_containing_only_atgmaildotcom"));
        GetPasswordInputField().sendKeys(configLocatorsProp.getProperty("password"));
        GetConfirmPasswordInputField().sendKeys(configLocatorsProp.getProperty("password"));

        String expectedEmailErrorMsg = configLocatorsProp.getProperty("enter_valid_email_error_msg");
        //check the wrong password is entered
        Assert.assertEquals(expectedEmailErrorMsg, GetEmailErrorMessage().getText());
        //check that the register button is disabled
        Assert.assertTrue(Boolean.parseBoolean(GetRegisterButton().getAttribute("disabled")));
    }



    // PASSWORD FOCUSED TESTS
    public void RegisterUser_With_Password_Less_Than_Min_Length() throws InterruptedException {
        //***** Step 1 Select User Type *****
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20L));

        GetStartNowButton().click();
        GetAppraiserOption();
        GetNextStep().click();

        //***** Step 2 Select State and License Number *****
        Thread.sleep(3000);
        GetStateOption(configLocatorsProp.getProperty("active_appraiser_license_state"));
        GetLicenseNumberField().sendKeys(configLocatorsProp.getProperty("active_appraiser_license_number"));
        GetCheckEligibilityButton().click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(registerLocatorsProp.getProperty("active_license_message"))));

        Assert.assertEquals(GetActiveLicenseStatusMessage().getText(), "Active License.");
        GetNextStep().click();

        //***** Step 3 *****
        GetEmailInputField().sendKeys(configLocatorsProp.getProperty("email"));
        GetPasswordInputField().sendKeys(configLocatorsProp.getProperty("less_than_min_length_password"));
        GetConfirmPasswordInputField().sendKeys(configLocatorsProp.getProperty("less_than_min_length_password"));

        String expectedUnsatisfiedPasswordErrorMsg = configLocatorsProp.getProperty("unsatisfied_password_error_msg");
        //check the wrong password is entered
        Assert.assertEquals(expectedUnsatisfiedPasswordErrorMsg, GetUnsatisfiedPasswordErrorMessage().getText());

        //check that the register button is disabled
        Assert.assertTrue(Boolean.parseBoolean(GetRegisterButton().getAttribute("disabled")));
    }

    public void RegisterUser_With_Right_Password_Length_Only() throws InterruptedException {
        //***** Step 1 Select User Type *****
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20L));

        GetStartNowButton().click();
        GetAppraiserOption();
        GetNextStep().click();

        //***** Step 2 Select State and License Number *****
        Thread.sleep(3000);
        GetStateOption(configLocatorsProp.getProperty("active_appraiser_license_state"));
        GetLicenseNumberField().sendKeys(configLocatorsProp.getProperty("active_appraiser_license_number"));
        GetCheckEligibilityButton().click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(registerLocatorsProp.getProperty("active_license_message"))));

        Assert.assertEquals(GetActiveLicenseStatusMessage().getText(), "Active License.");
        GetNextStep().click();

        //***** Step 3 *****
        GetEmailInputField().sendKeys(configLocatorsProp.getProperty("email"));
        GetPasswordInputField().sendKeys(configLocatorsProp.getProperty("min_length_password"));
        GetConfirmPasswordInputField().sendKeys(configLocatorsProp.getProperty("min_length_password"));

        String expectedUnsatisfiedPasswordErrorMsg = configLocatorsProp.getProperty("unsatisfied_password_error_msg");
        //check the wrong password is entered
        Assert.assertEquals(expectedUnsatisfiedPasswordErrorMsg, GetUnsatisfiedPasswordErrorMessage().getText());

        //check that the register button is disabled
        Assert.assertTrue(Boolean.parseBoolean(GetRegisterButton().getAttribute("disabled")));

    }

    public void RegisterUser_With_One_Capital_Letter_Password() throws InterruptedException {
        //***** Step 1 Select User Type *****
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20L));

        GetStartNowButton().click();
        GetAppraiserOption();
        GetNextStep().click();

        //***** Step 2 Select State and License Number *****
        Thread.sleep(3000);
        GetStateOption(configLocatorsProp.getProperty("active_appraiser_license_state"));
        GetLicenseNumberField().sendKeys(configLocatorsProp.getProperty("active_appraiser_license_number"));
        GetCheckEligibilityButton().click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(registerLocatorsProp.getProperty("active_license_message"))));

        Assert.assertEquals(GetActiveLicenseStatusMessage().getText(), "Active License.");
        GetNextStep().click();

        //***** Step 3 *****
        GetEmailInputField().sendKeys(configLocatorsProp.getProperty("email"));
        GetPasswordInputField().sendKeys(configLocatorsProp.getProperty("cap_letter_password"));
        GetConfirmPasswordInputField().sendKeys(configLocatorsProp.getProperty("cap_letter_password"));

        String expectedUnsatisfiedPasswordErrorMsg = configLocatorsProp.getProperty("unsatisfied_password_error_msg");
        //check the wrong password is entered
        Assert.assertEquals(expectedUnsatisfiedPasswordErrorMsg, GetUnsatisfiedPasswordErrorMessage().getText());

        //check that the register button is disabled
        Assert.assertTrue(Boolean.parseBoolean(GetRegisterButton().getAttribute("disabled")));

    }

    public void RegisterUser_With_RightPasswordLength_OneCapitalLetter_OneNumber() throws InterruptedException {
        //***** Step 1 Select User Type *****
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20L));

        GetStartNowButton().click();
        GetAppraiserOption();
        GetNextStep().click();

        //***** Step 2 Select State and License Number *****
        Thread.sleep(5000);
        GetStateOption(configLocatorsProp.getProperty("active_appraiser_license_state"));
        GetLicenseNumberField().sendKeys(configLocatorsProp.getProperty("active_appraiser_license_number"));
        GetCheckEligibilityButton().click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(registerLocatorsProp.getProperty("active_license_message"))));

        Assert.assertEquals(GetActiveLicenseStatusMessage().getText(), "Active License.");
        GetNextStep().click();

        //***** Step 3 *****
        GetEmailInputField().sendKeys(configLocatorsProp.getProperty("email"));
        GetPasswordInputField().sendKeys(configLocatorsProp.getProperty("one_cap_letter_One_number_password"));
        GetConfirmPasswordInputField().sendKeys(configLocatorsProp.getProperty("one_cap_letter_One_number_password"));

        String expectedUnsatisfiedPasswordErrorMsg = configLocatorsProp.getProperty("unsatisfied_password_error_msg");
        //check the wrong password is entered
        Assert.assertEquals(expectedUnsatisfiedPasswordErrorMsg, GetUnsatisfiedPasswordErrorMessage().getText());

        Assert.assertTrue(Boolean.parseBoolean(GetRegisterButton().getAttribute("disabled")));

    }

    public void RegisterUser_With_RightPassword_But_WrongConfirmPassword() throws InterruptedException {
        //***** Step 1 Select User Type *****
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20L));

        GetStartNowButton().click();
        GetAppraiserOption();
        GetNextStep().click();

        //***** Step 2 Select State and License Number *****
        Thread.sleep(5000);
        GetStateOption(configLocatorsProp.getProperty("active_appraiser_license_state"));
        GetLicenseNumberField().sendKeys(configLocatorsProp.getProperty("active_appraiser_license_number"));
        GetCheckEligibilityButton().click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(registerLocatorsProp.getProperty("active_license_message"))));

        Assert.assertEquals(GetActiveLicenseStatusMessage().getText(), "Active License.");
        GetNextStep().click();

        //***** Step 3 *****
        GetEmailInputField().sendKeys(configLocatorsProp.getProperty("email"));
        GetPasswordInputField().sendKeys(configLocatorsProp.getProperty("password"));
        GetConfirmPasswordInputField().sendKeys(configLocatorsProp.getProperty("wrong_confirm_password"));

        String expectedUnmatchedPasswordErrorMsg = configLocatorsProp.getProperty("unmatched_password_error_msg");
        //check the wrong password is entered
        Assert.assertEquals(expectedUnmatchedPasswordErrorMsg, GetUnmatchedPasswordErrorMessage().getText());

    }
}
