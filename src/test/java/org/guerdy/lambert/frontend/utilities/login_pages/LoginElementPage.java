package org.guerdy.lambert.frontend.utilities.login_pages;

import lombok.Getter;
import org.guerdy.lambert.frontend.base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginElementPage extends BaseTest {

    @Getter
    private static String rightEmail = "glamb80@gmail.com";
//    private static String rightEmail = "testuser@gmail.com";
    @Getter
    private static String rightPassword = "Abie2024!";
//    private static String rightPassword = "P@ssword1";
    @Getter
    private static String rightAppraiserEmail = "subscribed@1.com";
    @Getter
    private static String rightAppraiserPassword = "bias2024!";
    @Getter
    private static String wrongEmail = "wrongTest@gmail.com";
    @Getter
    private static String wrongPassword = "WrongP@ssword1";

    public static WebElement GetSignInBtn() {
        return driver.findElement(By.xpath(loginLocatorsProp.getProperty("signin_btn")));
    }
    public static WebElement GetEmailInputField() {
        return driver.findElement(By.xpath(loginLocatorsProp.getProperty("email_inputfield")));
    }
    public static void EnterEmail() {
        GetEmailInputField().sendKeys(loginLocatorsProp.getProperty("email"));
    }
    public static WebElement GetPasswordInputField() {
        return driver.findElement(By.cssSelector(loginLocatorsProp.getProperty("password_inputfield")));
    }
    public static WebElement GetNotAValidEmailPopup() {
        return driver.findElement(By.xpath(loginLocatorsProp.getProperty("not_a_valid_email_popup")));
    }
    public static WebElement GetUserNotFound() {
        return driver.findElement(By.xpath(loginLocatorsProp.getProperty("user_not_found")));
    }
    public static String GetBadCredentialMessage() {
        return driver.findElement(By.xpath(loginLocatorsProp.getProperty("bad_credentials_msg"))).getText();
    }
    public static WebElement GetRememberMeCheckbox() {
        return driver.findElement(By.cssSelector(loginLocatorsProp.getProperty("rememberme_link")));
    }
    public static WebElement GetForgotPasswordLink() {
        return driver.findElement(By.xpath(loginLocatorsProp.getProperty("forgot_password_link")));
    }
    public static WebElement GetRegisterNowLink() {

        return driver.findElement(By.cssSelector(loginLocatorsProp.getProperty("register_now_link")));
    }
    public static WebElement GetLoginButton() {
        return driver.findElement(By.cssSelector(loginLocatorsProp.getProperty("login_btn")));
    }

    public static void ClickSubmitButton() {
        GetLoginButton().click();
    }
    public static WebElement GetDashboardLink() {
        return driver.findElement(By.xpath(loginLocatorsProp.getProperty("dashboard_link")));
    }

    public static void ClickDashboardLink() {
        driver.findElement(By.xpath(loginLocatorsProp.getProperty("dashboard_link"))).click();
    }

    public static String getExpectedSuccessfulLoginUrl() {
        return "https://app.abiescreen.com/dashboard";
    }
    public static String getExpectedUnsuccessfulLoginUrl() {
        return "https://app.abiescreen.com/login";
    }
}
