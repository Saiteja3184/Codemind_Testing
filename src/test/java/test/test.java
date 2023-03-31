package test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class test {
    WebDriver driver;
    @Test
    public void test() throws Exception {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\T-HUB\\Downloads\\chromedriver_win32\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        ChromeDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        //driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Thread.sleep(Long.parseLong("1000"));

        driver.get("https://thecodemind.io/");
        //driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        Thread.sleep(Long.parseLong("2000"));


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

        //PORTFOLIO
        WebElement portfolio = driver.findElement(By.partialLinkText("Portfolio"));
        portfolio.click();
        driver.get("https://thecodemind.io/codemind/aptlogic.php");
        WebElement aptPage = driver.findElement(By.className("count-name"));
        String APT = aptPage.getText();
        System.out.println(APT);
        //driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Thread.sleep(Long.parseLong("2000"));

        driver.navigate().back();

        //CODE
        WebElement code = driver.findElement(By.partialLinkText("Code"));
        code.click();
        driver.get("https://thecodemind.io/codemind/course.php?pageCategory=Y3dyUmpiOFlpY0FWdmE1UVBFMzlLdz09");
        WebElement DS = driver.findElement(By.partialLinkText("Data Structures"));
        DS.click();

        WebElement sorting = driver.findElement(By.partialLinkText("Sorting"));
        sorting.click();
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("window.scrollTo(0,500)");

        driver.get("https://thecodemind.io/codemind/articulates/Common_topics/Sorting/#/lessons/bNjICkNji8qD0uNLcyO8oSMldI45v7uC");
        Thread.sleep(Long.parseLong("2000"));

        driver.navigate().back();
        Thread.sleep(Long.parseLong("2000"));
        driver.navigate().back();


    }
}
