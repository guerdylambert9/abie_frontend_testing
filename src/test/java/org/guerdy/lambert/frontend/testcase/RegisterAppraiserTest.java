package org.guerdy.lambert.frontend.testcase;

import org.guerdy.lambert.frontend.base.BaseTest;
import org.guerdy.lambert.frontend.utilities.registration_pages.RegisterAppraiserPage;
import org.testng.annotations.Test;

public class RegisterAppraiserTest extends BaseTest {
    //    static ExtentTest test;
//    static ExtentReports report=new ExtentReports();

    RegisterAppraiserPage registerAppraiserPage = new RegisterAppraiserPage();


    @Test(enabled = false, description = "Register Appraiser with Freemium account with all right credentials")
    public void Register_Appraiser_With_Freemium_Plan_With_RightCredentials() throws InterruptedException {
        registerAppraiserPage.Register_Appraiser_With_Freemium_Plan_With_RightCredentials();
    }
    @Test(enabled = false, description = "Register Appraiser with Abie's monthly plan with all right credentials")
    public void Register_Appraiser_With_AbieS_Monthly_Plan_With_RightCredentials() throws InterruptedException {
        registerAppraiserPage.Register_Appraiser_With_AbieS_Monthly_Plan_With_RightCredentials();
    }
    @Test(enabled = false, description = "Register Appraiser with Abie's yearly plan with all right credentials")
    public void Register_Appraiser_With_AbieS_Yearly_Plan_With_RightCredentials() throws InterruptedException {
        registerAppraiserPage.Register_Appraiser_With_AbieS_Yearly_Plan_With_RightCredentials();
    }
    @Test(enabled = true, description = "Register Appraiser with inactive license number")
    public void Register_Appraiser_With_Inactive_LicenseNumber() throws InterruptedException {
        registerAppraiserPage.Register_Appraiser_With_Inactive_LicenseNumber();
    }
    @Test(enabled = true, description = "Register Appraiser with active license number but wrong state")
    public void Register_Appraiser_with_Active_LicenseNumber_WrongState() throws InterruptedException {
        registerAppraiserPage.Register_Appraiser_with_Active_LicenseNumber_WrongState();
    }

    // EMAIL FOCUSED TESTS
    @Test(enabled = true, description = "Register Appraiser with empty email field")
    public void RegisterUser_With_EmptyEmailField() throws InterruptedException {
        registerAppraiserPage.RegisterUser_With_EmptyEmail();
    }

    //@Test(enabled = true, description = "Register Appraiser with email without commercial at")
    @Test(enabled = true, description = "Register Appraiser with email without commercial at")
    public void RegisterUser_With_Email_WithoutCommercial_At() throws InterruptedException {
        registerAppraiserPage.RegisterUser_With_Email_WithoutCommercial_At();
    }

    @Test(enabled = true, description = "Register Appraiser with email without dotcom")
    public void RegisterUser_With_Email_Without_Dotcom() throws InterruptedException {
        registerAppraiserPage.RegisterUser_With_Email_Without_Dotcom();
    }

    @Test(enabled = true, description = "Register Appraiser with email starting with commercial at ")
    public void RegisterUser_With_Email_Starting_With_Commercial_At() throws InterruptedException {
        registerAppraiserPage.RegisterUser_With_Email_Starting_With_Commercial_At();
    }

    @Test(enabled = true, description = "Register Appraiser with email starting with dotcom")
    public void RegisterUser_With_Email_Starting_With_Dotcom() throws InterruptedException {
        registerAppraiserPage.RegisterUser_With_Email_Starting_With_Dotcom();
    }
    @Test(enabled = true, description = "Register Appraiser with email containing only commercial at gmail dotcom")
    public void RegisterUser_With_Email_Containing_Only_CommercialAt_Gmail_Dotcom() throws InterruptedException {
        registerAppraiserPage.RegisterUser_With_Email_Containing_Only_CommercialAt_Gmail_Dotcom();
    }

    // PASSWORD FOCUSED TESTS
    @Test(enabled = true, description = "Register Appraiser with password less than minimum field")
    public void RegisterUser_With_Password_Less_Than_Min_Length() throws InterruptedException {
        registerAppraiserPage.RegisterUser_With_Password_Less_Than_Min_Length();
    }
    @Test(enabled = true, description = "Register Appraiser with password more than maximum field")
    public void RegisterUser_With_Right_Password_Length_Only() throws InterruptedException {
        registerAppraiserPage.RegisterUser_With_Right_Password_Length_Only();
    }
    @Test(enabled = true, description = "Register Appraiser with password less than minimum field")
    public void RegisterUser_With_One_Capital_Letter_Password() throws InterruptedException {
        registerAppraiserPage.RegisterUser_With_One_Capital_Letter_Password();
    }
    @Test(enabled = true, description = "Register Appraiser with right password length, one capital letter, one number")
    public void RegisterUser_With_RightPasswordLength_OneCapitalLetter_OneNumber() throws InterruptedException {
        registerAppraiserPage.RegisterUser_With_RightPasswordLength_OneCapitalLetter_OneNumber();
    }
    @Test(enabled = true, description = "Register Appraiser with right password, wrong confirm password")
    public void RegisterUser_With_RightPassword_But_WrongConfirmPassword() throws InterruptedException {
        registerAppraiserPage.RegisterUser_With_RightPassword_But_WrongConfirmPassword();
    }

}
