package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class test {
    WebDriver driver;
    @Test
    public void test() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\T-HUB\\Downloads\\chromedriver_win32\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        ChromeDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://thecodemind.io/");

        //LOGIN_FUNCTIONALITY
        WebElement loginButton = driver.findElement(By.partialLinkText("Login"));
        loginButton.click();
        WebElement username = driver.findElement(By.name("Email"));
        username.sendKeys("2935");
        WebElement password = driver.findElement(By.name("Password"));
        password.sendKeys("1234");
        WebElement subButton = driver.findElement(By.name("Login"));
        subButton.click();
        WebElement name = driver.findElement(By.id("dropdownMenuButton"));
        String sudhir = name.getText();
        System.out.println(sudhir);
    }
}
