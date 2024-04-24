package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathSelectors {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.opencart.com/");
        String title = driver.getTitle();
        System.out.println(title);

        boolean logo = driver.findElement(By.xpath("//img[@alt='Your Store']")).isDisplayed();
        System.out.println(logo);
        //single attribute xpath
        driver.findElement(By.xpath("//*[@name='search']")).sendKeys("Infinix");

        //multiple attribute xpath with 'and' operator
        driver.findElement(By.xpath("//*[@name='search' and @placeholder='Search']")).sendKeys("Samsung");

        //multiple attribute xpath with 'or' operator
        driver.findElement(By.xpath("//*[@name='search' or @placeholder='Search']")).sendKeys("iPhone");


        //multiple attribute xpath
        driver.findElement(By.xpath("//*[@name='search'][ @placeholder='Search']")).sendKeys("oppo");

        driver.findElement(By.xpath("//a[text()='MacBook']")).click();
        driver.close();

    }
}
