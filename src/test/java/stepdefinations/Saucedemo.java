package stepdefinations;

import Utils.StaticInstances;
import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;


public class Saucedemo {
    WebDriver driver;

    @Given("User goes to saucedemo website")
    public void user_goes_to_saucedemo_website() {
        StaticInstances.sbc.getDriver().get("https://www.saucedemo.com/");
    }
    @When("User enters username {string}")
    public void user_enters_username(String username) {
        StaticInstances.sbc.getDriver().findElement(By.id("user-name")).sendKeys(username);
    }

    @When("User enters  password {string}")
    public void user_enters_password(String password) {
        StaticInstances.sbc.getDriver().findElement(By.id("password")).sendKeys(password);
    }

    @Then("User should be able to login")
    public void user_should_be_able_to_login() {
        StaticInstances.sbc.getDriver().findElement(By.cssSelector("input[id='login-button']")).click();

        String product = StaticInstances.sbc.getDriver().findElement(By.xpath("//span[@data-test='title']")).getText();
        if (product.contains("Products")){
            Assert.assertTrue(true);
        }
        else {
            Assert.fail("Products banner is not present");
        }
    }
}
