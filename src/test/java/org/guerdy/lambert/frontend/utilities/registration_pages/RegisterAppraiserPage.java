package org.guerdy.lambert.frontend.utilities.registration_pages;

import org.guerdy.lambert.frontend.base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

import static org.guerdy.lambert.frontend.utilities.registration_pages.RegistrationElementPage.*;

public class RegisterAppraiserPage extends BaseTest {
    // EMAIL FOCUSED TESTS
    public void RegisterUser_With_EmptyEmail() throws InterruptedException {
        //***** Step 1 Select User Type *****
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20L));

        GetStartNowButton().click();
        GetAppraiserOption();
        GetNextStep().click();

        //***** Step 2 Select State and License Number *****
        Thread.sleep(5000);
        GetStateOption(registerLocatorsProp.getProperty("appraiser_carlton_active_license_state"));
        GetLicenseNumberField().sendKeys(registerLocatorsProp.getProperty("appraiser_carlton_license_number"));
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

        //Validating that the REGISTER BUTTON DISABLED
        Assert.assertTrue(Boolean.parseBoolean(GetRegisterButton().getAttribute("disabled")));
    }

}
