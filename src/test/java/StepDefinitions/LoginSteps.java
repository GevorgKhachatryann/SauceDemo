package StepDefinitions;

import BaseClass.BaseClass;
import PageObjects.LoginPage;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.assertj.core.api.Assertions.assertThat;

public class LoginSteps extends LoginPage {

    public LoginSteps(BaseClass base) {
        super(base);
    }
    @And("The user provides the username as {string} and password as {string}")
    public void UserProvidesTheUsernameAsAndPasswordAs(String username, String password) {
        fillUsernameField(username);
        fillPasswordField(password);
        throw new PendingException();
    }


}
