package org.guerdy.lambert.frontend.utilities.login_pages;

import org.guerdy.lambert.frontend.base.BaseTest;
import org.guerdy.lambert.frontend.utilities.dashboard_pages.DashboardPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.io.IOException;
import java.time.Duration;

import static org.guerdy.lambert.frontend.utilities.login_pages.LoginElementPage.*;

public class LoginPage extends BaseTest {

    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20L));

    //this method attempts to log a user using no/empty email and password
    public void Login_with_No_emailNpassword(String email, String password) throws InterruptedException {
        GetSignInBtn().click();
        GetEmailInputField().sendKeys(email);
        GetPasswordInputField().sendKeys(password);
        GetRememberMeCheckbox().click();

        //LOGIN BUTTON SHOULD BE DISABLED
        Assert.assertTrue(Boolean.parseBoolean(GetLoginButton().getAttribute("disabled")));
    }

    //this method logs a user in using his/her email and password
    public DashboardPage Login_with_right_emailNpassowrd(String email, String password) throws InterruptedException {

        GetSignInBtn().click();
        GetEmailInputField().sendKeys(email);
        GetPasswordInputField().sendKeys(password);
        GetRememberMeCheckbox().click();
        GetLoginButton().click();
        Thread.sleep(2000);

        return new DashboardPage();
    }

    //this method attempts to log a user using the right email and the wrong password
    public void Login_With_Right_Email_Wrong_Password(String email, String password) throws InterruptedException {
        GetSignInBtn().click();
        GetEmailInputField().sendKeys(email);
        GetPasswordInputField().sendKeys(password);
        GetRememberMeCheckbox().click();
        GetLoginButton().click();
        Thread.sleep(2000);

        //String userNotFoundText = GetUserNotFound().getText();
        String badCredentialsMsg = GetBadCredentialMessage();
        //System.out.println(userNotFoundText);
        //WaitUntilElementToBeVisible(GetUserNotFound());
        //String expectedText = "User not found";
        String expectedText = "Login failed: Bad credentials";
        //Assert.assertEquals(userNotFoundText, expectedText);
        Assert.assertEquals(badCredentialsMsg, expectedText);
    }

    //this method attempts to log a user using the wrong email address and the right password
    public void Login_With_Wrong_Email_Right_Password(String email, String password) throws InterruptedException {
        GetSignInBtn().click();
        GetEmailInputField().sendKeys(email);
        GetPasswordInputField().sendKeys(password);
        GetRememberMeCheckbox().click();
        GetLoginButton().click();
        Thread.sleep(2000);

        String userNotFoundText = GetUserNotFound().getText();
        System.out.println(userNotFoundText);

        String expectedText = "User not found";
        Assert.assertEquals(userNotFoundText, expectedText);
    }

    //this method attempts to log a new/non-registered user
    public void Login_With_Non_Existent_User(String email, String password) throws InterruptedException, IOException {
        GetSignInBtn().click();

        GetEmailInputField().sendKeys(email);
        GetPasswordInputField().sendKeys(password);
        GetRememberMeCheckbox().click();
        GetLoginButton().click();
        Thread.sleep(2000);

        String userNotFoundText = GetUserNotFound().getText();
        System.out.println(userNotFoundText);
        String expectedText = "User not found";
        Assert.assertEquals(userNotFoundText, expectedText);
    }

    public void ForgotPassword() {

        GetSignInBtn().click();
        GetForgotPasswordLink().click();
        //enter your email address
        EnterEmail();
        //click the Submit button
        ClickSubmitButton();
    }

    public void WaitUntilElementToBeClickable(WebElement elem) {
        Duration duration = Duration.ofSeconds(10);
        WebDriverWait wait = new WebDriverWait(driver, duration);
        System.out.println("%%%%%%% WaitUntilElementToBeClickable B4 GetRegisterNowLink() %%%%%%% " );
        wait.until(ExpectedConditions.elementToBeClickable(elem));

        System.out.println("%%%%%%% INSIDE LoginPage.RegisterUser() %%%%%%% WaitUntilElementToBeClickable" );

    }

    public void WaitUntilElementToBeVisible(WebElement elem) {
        Duration duration = Duration.ofSeconds(10);
        WebDriverWait wait = new WebDriverWait(driver, duration);
        System.out.println("%%%%%%% WaitUntilElementToBeClickable B4 GetRegisterNowLink() %%%%%%% " );

        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[text()='User not found']")));
        System.out.println(elem.getText());

    }

}
