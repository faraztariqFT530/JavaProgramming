package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectors {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.opencart.com/");
        String title = driver.getTitle();
        System.out.println(title);

        driver.findElement(By.cssSelector("form#form-currency")).click();
        driver.findElement(By.cssSelector("input.form-control")).sendKeys("Infinix");


        driver.close();
    }
}
