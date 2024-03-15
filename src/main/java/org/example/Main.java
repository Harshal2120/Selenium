package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Main {

    public void run() throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.manage().window().maximize();
        driver.switchTo().frame("courses-iframe");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[contains(text(), 'Courses')]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[contains(text(), 'All Access plan')]")).click();

        Thread.sleep(3000);
        Actions action = new Actions(driver);
        WebElement More = driver.findElement(By.xpath("//a[contains(text(), 'More')]"));
        action.moveToElement(More).build().perform();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[contains(text(), 'Part time jobs')]")).click();
        Thread.sleep(3000);


        WebElement element = driver.findElement(By.id("select-job-type"));
        Select select = new Select(element);
        select.selectByVisibleText("QA Automation Articles (Java/Python/JavaScript)");


        driver.get("https://facebook.com");
        driver.findElement(By.id("email")).sendKeys("harshalsomani23@gmail.com");
        driver.findElement(By.name("pass")).sendKeys("Harshal@2110");
        driver.findElement(By.name("login")).click();
        System.out.println(driver.getTitle());
        Thread.sleep(3000);
        driver.quit();
    }

    // finding element with link text
    public void run2() {
        WebDriverManager.edgedriver().setup();
        WebDriver driver1 = new EdgeDriver();
        driver1.manage().window().maximize();
        driver1.get("https://facebook.com");
        driver1.findElement(By.linkText("Forgotten password?")).click();
        driver1.quit();
    }

    // finding element with partial link text
    public void run3() {
        WebDriver driver2 = new EdgeDriver();
        driver2.manage().window().maximize();
        driver2.get("https://facebook.com");
        driver2.findElement(By.partialLinkText("Forgotten")).click();
        driver2.quit();
    }

    // finding element with absolute xpath
    public void run4() {
        WebDriver driver3 = new EdgeDriver();
        driver3.manage().window().maximize();
        driver3.get("https://facebook.com");
        driver3.findElement(By.xpath("html/body/div/div/div/div/div/div/div/div/div/form/div/div/input")).sendKeys("harshalsomani23@gmail.com");
        driver3.findElement(By.xpath("html/body/div/div/div/div/div/div/div/div/div/form/div/div/div/input")).sendKeys("Harshal@2110");
        driver3.findElement(By.xpath("html/body/div/div/div/div/div/div/div/div/div/form/div/button")).click();
        driver3.quit();
    }

    //finding element relative xpath
    public void run5() {
        WebDriver driver4 = new EdgeDriver();
        driver4.manage().window().maximize();
        driver4.get("https://facebook.com");
        driver4.findElement(By.xpath("//input[@placeholder= 'Email address or phone number']")).sendKeys("harshalsomani23@gmail.com");
        driver4.findElement(By.xpath("//input[@id='pass']")).sendKeys("Harshal@2110");
        driver4.findElement(By.xpath("//button[@name='login']")).click();
    }

    //  relative xpath methods using contains method
    public void run6() {
        WebDriver driver5 = new EdgeDriver();
        driver5.manage().window().maximize();
        driver5.get("https://facebook.com");
        driver5.findElement(By.xpath("//input[contains(@placeholder, 'Email')]")).sendKeys("harshalsomani23@gmail.com");
        driver5.findElement(By.xpath("//input[@id='pass']")).sendKeys("Harshal@2110");
        driver5.findElement(By.xpath("//button[@name='login']")).click();
    }

    // relative xpath method using starts-with method
    public void run7() {
        WebDriver driver8 = new EdgeDriver();
        driver8.manage().window().maximize();
        driver8.get("https://facebook.com");
        driver8.findElement(By.xpath("//input[starts-with(@placeholder, 'Email')]")).sendKeys("harshalsomani23@gmail.com");
        driver8.findElement(By.xpath("//input[@id='pass']")).sendKeys("Harshal@2110");
        driver8.findElement(By.xpath("//button[@name='login']")).click();
    }

    //relative xpath method using child method
    public void run8() {
        WebDriver driver6 = new EdgeDriver();
        driver6.manage().window().maximize();
        driver6.get("https://facebook.com");
        driver6.findElement(By.xpath("//input[starts-with(@placeholder, 'Email')]")).sendKeys("harshalsomani23@gmail.com");
        driver6.findElement(By.xpath("//input[@id='pass']")).sendKeys("Harshal@2110");
        driver6.findElement(By.xpath("//div[@class=\"_6ltg\"]/child::button")).click();
    }

    // relative xpath method using parent method
    public void run9() {
        WebDriver driver7 = new EdgeDriver();
        driver7.manage().window().maximize();
        driver7.get("https://facebook.com");
        driver7.findElement(By.xpath("//input[starts-with(@placeholder, 'Email')]")).sendKeys("harshalsomani23@gmail.com");
        driver7.findElement(By.xpath("//input[@id='pass']")).sendKeys("Harshal@2110");
        driver7.findElement(By.xpath("//button[text()='Log in']/parent::div")).click();
    }

    //finding elements with class name method
    public void run10() {
        WebDriver driver9 = new EdgeDriver();
        driver9.manage().window().maximize();
        driver9.get("https://facebook.com");
        List<WebElement> EN = driver9.findElements(By.className("inputtext"));
        EN.get(0).sendKeys("harshalsomani23@gmail.com");
        EN.get(1).sendKeys("Harshal@2110");
        System.out.println(EN.size());
    }

    public void run11() {
        WebDriver driver10 = new EdgeDriver();
        driver10.manage().window().maximize();
        driver10.get("https://facebook.com");
        List<WebElement> all_tag = driver10.findElements(By.tagName("a"));
        System.out.println(all_tag.size());

        for (WebElement webElement : all_tag) {
            System.out.println(webElement.getText());
        }

        ChromeDriver driver11 = new ChromeDriver();
        driver11.get("https://www.facebook.com");
    }

    //For the calendar selection of a booking site
    public void run13 () throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.makemytrip.com/");
        Thread.sleep(6000);

        //removing ad
        driver.switchTo().frame("webklipper-publisher-widget-container-notification-frame");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//i[@class=\"wewidgeticon we_close\"]")).click();

        //booking the flight
        Thread.sleep(3000);
        driver.switchTo().defaultContent();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//span[text()='Flights']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id='fromCity']")).click();
        driver.findElement(By.xpath("(//p[contains(text(), 'Mumbai')])[1]")).click();
        driver.findElement(By.xpath("//*[@id= 'toCity']")).click();
        driver.findElement(By.xpath("//p[contains(text(), 'Pune, India')]")).click();
        driver.findElement(By.xpath("//div[@aria-label='Sun Mar 17 2024']")).click();
        driver.findElement(By.xpath("//span[contains(text(), 'Departure')]")).click();
        driver.findElement(By.xpath("//div[@aria-label='Mon Apr 08 2024']")).click();
        driver.findElement(By.xpath("//a[contains(text(), 'Search')]")).click();
    }
}

