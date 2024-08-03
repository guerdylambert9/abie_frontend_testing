package org.guerdy.lambert.frontend.testcase;

import org.guerdy.lambert.frontend.base.BaseTest;
import org.guerdy.lambert.frontend.utilities.registration_pages.RegisterAppraiserPage;
import org.testng.annotations.Test;

public class RegisterAppraiserTest extends BaseTest {

    RegisterAppraiserPage registerAppraiserPage = new RegisterAppraiserPage();
    // EMAIL FOCUSED TESTS
    @Test(description = "Register Appraiser with empty email field")
    public void RegisterUser_With_EmptyEmailField() throws InterruptedException {

        registerAppraiserPage.RegisterUser_With_EmptyEmail();
    }
}
