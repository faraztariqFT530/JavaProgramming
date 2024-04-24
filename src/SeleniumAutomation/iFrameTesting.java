package SeleniumAutomation;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.util.Scanner;

public class iFrameTesting {
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

        driver.get("https://www.globalsqa.com/demo-site/frames-and-windows/#google_vignette");

        driver.findElement(By.xpath("//li[@id='iFrame']")).click();

        WebElement frame1 = driver.findElement(By.xpath("//iframe[@name='globalSqa']"));

        driver.switchTo().frame(frame1);

        Thread.sleep(3000);

        driver.findElement(By.xpath("//input[@name='s']")).sendKeys("RajaGee");

        Thread.sleep(3000);

        driver.switchTo().defaultContent();

        driver.findElement(By.xpath("//input[@name='s']")).sendKeys("BawaGee");

        Thread.sleep(3000);

        int size = driver.findElements(By.tagName("iframe")).size();

        System.out.println(size);

        driver.close();
    }
}