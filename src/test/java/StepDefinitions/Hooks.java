package StepDefinitions;

import BaseClass.BaseClass;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.time.temporal.ChronoUnit;

public class Hooks extends BaseClass {

    private final BaseClass base;

    public Hooks(BaseClass base) {
        this.base = base;
    }

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Documents\\driver\\chromedriver104\\chromedriver.exe");
        base.driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(base.baseURL);
        driver.manage().timeouts().implicitlyWait(Duration.of(5L, ChronoUnit.SECONDS));
        //base.driver.get(base.baseURL);
    }

    @After
    public void tearDown() {
        base.driver.quit();
    }
}
