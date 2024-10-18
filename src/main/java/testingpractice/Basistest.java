package testingpractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basistest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\oceen\\IdeaProjects\\untitled8\\src\\main\\resources\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");





    }
}
