package SeleniumAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.util.Scanner;

public class LightBoxTesting {
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

        driver.get("https://formstone.it/components/lightbox/demo/");

        driver.findElement(By.xpath("//div[@id='example-0']//img")).click();

        Thread.sleep(2000);

        String text = driver.findElement(By.xpath("//p[@class='caption']")).getText();

        System.out.println(text);

        driver.close();
    }
}