package SeleniumAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.util.List;
import java.util.Scanner;

public class Elixir {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = null;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the browser in which you want to execute your automation script firefox or Chrome?");
        String browser = sc.nextLine();

        if(browser.equalsIgnoreCase("Chrome")){
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

        // Opening Elixir website
        driver.get("https://elixir.com/");

        String title =  driver.getTitle();  //get title of the url

        System.out.println("Title of page: " + title);

        String urlMain = driver.getCurrentUrl();

        System.out.println("URL of the main page: " + urlMain);

        // Other automation steps can be added here
        WebElement element = driver.findElement(By.linkText("Request a Demo"));

        element.click();

        String urlsecond = driver.getCurrentUrl();

        System.out.println("URL of the second page: " + urlsecond);

        Thread.sleep(3000);

        driver.findElement(By.id("firstname-fb17a891-ecdf-4bc7-a976-75505d06dccd_9550")).sendKeys("Kevin");

        driver.findElement(By.name("lastname")).sendKeys("DeBryne");

        String text = driver.findElement(By.xpath("//h5[contains(text(),'Make multi-channel communications and complex docu')]")).getText();

        System.out.println(text);

        driver.findElement(By.linkText("Learn More")).click();

        List<WebElement> elements= driver.findElements(By.tagName("h4"));

        for(int i=0; i<elements.size(); i++){
            System.out.println(elements.get(i).getText());
        }

        driver.navigate().to("https://elixir.com/about");

        driver.navigate().back();

        Thread.sleep(3000);

        driver.navigate().forward();

        Thread.sleep(3000);

        driver.navigate().refresh();

        Thread.sleep(5000);

        // Closing the browser window
        driver.quit();
    }
}
