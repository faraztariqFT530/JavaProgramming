package SeleniumAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.util.Scanner;

public class MouseActions {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = null;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the browser in which you want to execute your automation script firefox or Chrome?");
        String browser = sc.nextLine();

        if (browser.equalsIgnoreCase("Chrome")) {
            // Setting the path to Chrome WebDriver
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\farazt\\Downloads\\WebDrivers\\chromedriver.exe");
            ChromeOptions options = new ChromeOptions();
            options.setBinary("C:\\Users\\farazt\\Downloads\\chrome-win64\\chrome-win64\\chrome.exe");
            //Initializing WebDriver
            driver = new ChromeDriver(options);
        } else if (browser.equalsIgnoreCase("Firefox")) {
            // Setting the path to Firefox WebDriver
            System.setProperty("webdriver.gecko.driver", "C:\\Users\\farazt\\Downloads\\WebDrivers\\geckodriver.exe");
            FirefoxOptions options = new FirefoxOptions();
            options.setBinary("C:\\Program Files\\Mozilla Firefox\\firefox.exe");
            driver = new FirefoxDriver(options);
        }
        driver.manage().window().maximize();

        driver.get("https://elixir.com/");

        Actions action = new Actions(driver);

        WebElement industries = driver.findElement(By.xpath("(//a[@class='nav__link'])[2]"));

        action.moveToElement(industries).perform();

        action.click().perform();

        Thread.sleep(3000);

        WebElement manyIndustries = driver.findElement(By.xpath("//h1[normalize-space()='Many industries.Major results.']"));

        action.doubleClick(manyIndustries).perform();

        driver.get("https://www.globalsqa.com/demo-site/sliders/#Range");

        driver.findElement(By.xpath("//li[@id='Range']")).click();

        WebElement frame1 = driver.findElement(By.xpath("//iframe[@name='globalSqa']"));

        driver.switchTo().frame(frame1);

        Thread.sleep(3000);


    }
}
