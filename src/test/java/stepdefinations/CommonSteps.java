package stepdefinations;

import Utils.StaticInstances;
import io.cucumber.java.*;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.TakesScreenshot;

public class CommonSteps {
    @BeforeAll
    public static void setup() {
    }

    @Before
    public static void beforetest() {
    }

    @BeforeStep
    public static void beforestep(){
    }

    @AfterStep
    public void teardown(Scenario scenario) {
        if (scenario.isFailed()){
            System.out.println("Scenario "+scenario.getName()+" is failed");
//          final byte[] screenshot = ((TakesScreenshot) StaticInstances.sbc).getScreenshotAs(OutputType.BYTES);
//           scenario.attach(screenshot, "image/png", scenario.getName());
        }
    }

    @After
    public static void aftertest(){
    }

    @AfterAll
    public static void teardown(){
        StaticInstances.sbc.getDriver().quit();
    }


}
