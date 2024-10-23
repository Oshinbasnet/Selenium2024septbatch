package Utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.Collections;
import java.util.concurrent.TimeUnit;

public class Browserclass {
    private static Browserclass instanceOfSingletonBrowserClass = null;

    private final WebDriver driver;
    public final static int TIMEOUT = 10;

    private Browserclass(){
        WebDriverManager.chromedriver().clearDriverCache().driverVersion("").setup();
        ChromeOptions ops = new ChromeOptions();

        ops.addArguments("--remote-allow-origins=*");
        ops.addArguments("--start-maximized");
        ops.addArguments("--incognito");
        ops.setExperimentalOption("useAutomationExtension", false);
        ops.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
        driver = new ChromeDriver(ops);
        //implicit wait
        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
    }

    public static Browserclass getInstanceOfSingletonBrowserClass() {
        if (instanceOfSingletonBrowserClass == null){
            instanceOfSingletonBrowserClass = new Browserclass();
        }

        return instanceOfSingletonBrowserClass;
    }

    public WebDriver getDriver(){
        return driver;
    }


    public WebDriver getdriver() {
        return driver;
    }
}
