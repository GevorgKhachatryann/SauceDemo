package PageObjects;

import BaseClass.BaseClass;
import Selectors.Selectors;
import org.openqa.selenium.By;

import java.util.HashMap;

public class LoginPage {

    private final BaseClass base;
    private final HashMap<String, String> selectors;

    public LoginPage(BaseClass base) {
        this.base = base;
        selectors = new Selectors().selectors;
    }


    By usernameField = By.cssSelector("[data-test=username]");
    By passwordField = By.cssSelector("[data-test=password]");
    By errorMsgContainer = By.cssSelector("[data-test=error]");
    By menuBtn = By.id("react-burger-menu-btn");
    By loginLogo = By.className("login_logo");


    public void fillUsernameField(String username){
        base.driver.findElement(usernameField).sendKeys(username);
    }

    public void fillPasswordField(String password){
        base.driver.findElement(passwordField).sendKeys(password);
    }




//
//    public void openAllNodes() {
//
//    }
//
//    public List<WebElement> getNodes() {
//        return base.driver.findElements(node);
//    }
//
//    public WebElement getTitle() {
//        WebDriverWait wait = new WebDriverWait(base.driver, Duration.ofSeconds(2));
//        wait.until(ExpectedConditions.presenceOfElementLocated(title));
//        return base.driver.findElement(title);
//    }
}
