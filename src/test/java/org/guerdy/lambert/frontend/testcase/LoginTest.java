package org.guerdy.lambert.frontend.testcase;

import org.guerdy.lambert.frontend.base.BaseTest;
import org.guerdy.lambert.frontend.utilities.dashboard_pages.DashboardPage;
import org.guerdy.lambert.frontend.utilities.login_pages.LoginPage;
import org.testng.annotations.Test;

import java.io.IOException;

import static org.guerdy.lambert.frontend.utilities.login_pages.LoginElementPage.*;

public class LoginTest extends BaseTest {

    LoginPage loginPage = new LoginPage();
    DashboardPage dashboardPage = new DashboardPage();

    @Test(enabled = true, description = "Login with no email and password")
    public void Login_with_No_emailNpassword() throws InterruptedException {

        loginPage.Login_with_No_emailNpassword("", "");
    }

    @Test(enabled = true, description = "Login with right email and password")
    public void Login_with_right_emailNpassowrd() throws InterruptedException {

        dashboardPage = loginPage.Login_with_right_emailNpassowrd(getRightAppraiserEmail(),getRightAppraiserPassword());
    }

    @Test(enabled = true, description = "Login with right email and wrong password")
    public void Login_with_right_email_wrong_password() throws InterruptedException {
        String email = getRightEmail();
        String password = getWrongPassword();

        loginPage.Login_With_Right_Email_Wrong_Password(email,password);
    }

    @Test(enabled = true, description = "Login with wrong email and right password")
    public void Login_with_wrong_email_right_password() throws InterruptedException {
        String email = getWrongEmail();
        String password = getRightPassword();

        loginPage.Login_With_Wrong_Email_Right_Password(email,password);
    }

    @Test(enabled = true, description = "Login with non-existent user")
    public void Login_with_non_existent_user() throws InterruptedException, IOException {

        loginPage.Login_With_Non_Existent_User("nonExistentEmail@gmail.com", "NonExistentP@ssword1");
    }

    @Test(enabled = true, description = "Forgot Password")
    public void ForgotPassword() {
        loginPage.ForgotPassword();
    }

}
