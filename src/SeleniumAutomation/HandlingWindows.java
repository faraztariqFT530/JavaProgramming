package SeleniumAutomation;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class HandlingWindows {
    public static void main(String[] args) throws InterruptedException{
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

        driver.get("https://omayo.blogspot.com/");

        //handling Alerts in selenium
        driver.findElement(By.id("alert1")).click();

        Alert alert = driver.switchTo().alert();

        String alertText = alert.getText();

        System.out.println("Alert text is " + alertText);

        alert.accept();

        Thread.sleep(3000);

        //Handling Dropdowns in selenium

        WebElement dropdownElement = driver.findElement(By.id("drop1"));

        Select select = new Select(dropdownElement);

        select.selectByVisibleText("doc 2");

        WebElement multiDropdownElement = driver.findElement(By.id("multiselect1"));

        Select multiSelect = new Select(multiDropdownElement);

        multiSelect.selectByVisibleText("Volvo");

        multiSelect.selectByIndex(1);

        multiSelect.selectByVisibleText("Audi");

        Thread.sleep(3000);

        multiSelect.deselectByVisibleText("Audi");



        //It is a global wait, applied for all elements in the script
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.findElement(By.className("dropbtn")).click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

        WebElement facebookElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Facebook")));

        facebookElement.click();

        driver.navigate().back();

        driver.findElement(By.linkText("Open a popup window")).click();

        Set<String> windowsId= driver.getWindowHandles();

        Iterator<String> itr = windowsId.iterator();

        String mainWindow = itr.next();

        String childWindow = itr.next();

        driver.switchTo().window(childWindow);

        String childWindowText = driver.findElement(By.tagName("h3")).getText();

        System.out.println(childWindowText);

        driver.close();

        driver.switchTo().window(mainWindow);

        driver.close();



    }
}
