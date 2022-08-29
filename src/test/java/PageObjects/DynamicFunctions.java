package PageObjects;

import BaseClass.BaseClass;
import Selectors.Selectors;
import com.github.javafaker.Faker;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.HashMap;

public class DynamicFunctions {

    private final BaseClass base;
    private final HashMap<String, String> selectors;
    private final Faker faker;

    public DynamicFunctions(BaseClass base) {
        this.base = base;
        selectors = new Selectors().selectors;
        faker = new Faker();
    }

    public void click(String button){
        base.driver.findElement(By.cssSelector(selectors.get(button))).click();
    }

    public void type(String text, String field){

        switch(text) {
            case "name":
                text = faker.name().firstName();
                break;
            case "surname":
                text = faker.name().lastName();
                break;
            case "valid email":
                text = faker.internet().emailAddress();
                break;
            case "valid tel. number":
                text = faker.numerify("###-###-###");
                break;
            case "phone number":
                text = faker.numerify("##########");
                break;
            case "full name":
                text = faker.name().firstName() + " " + faker.name().lastName();
                break;
            case "valid card No":
                text = faker.numerify("################");
                break;
            case "valid cvv code":
                text = faker.numerify("###");
                break;
        }

        base.driver.findElement(By.cssSelector(selectors.get(field))).clear();
        base.driver.findElement(By.cssSelector(selectors.get(field))).sendKeys(text);
    }


    public boolean isOpened(String page) {
        String baseURL = "https://www.saucedemo.com/";
        return (baseURL+selectors.get(page)).equals(base.driver.getCurrentUrl());
    }
    public boolean isNotOpened(String page) {
        String baseURL = "https://www.saucedemo.com/";
        return (!(baseURL+selectors.get(page)).equals(base.driver.getCurrentUrl()));
    }

}
