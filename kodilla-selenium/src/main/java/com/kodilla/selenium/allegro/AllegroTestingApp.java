package com.kodilla.selenium.allegro;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class AllegroTestingApp {
    public static void main(String[] args) throws Exception {
        System.setProperty("webdriver.chrome.driver","C:\\selenium drivers\\chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://allegro.pl/");

        TimeUnit.MILLISECONDS.sleep(100);
        driver.switchTo().activeElement().sendKeys(Keys.ENTER);

        WebElement category = driver.findElement(By.xpath("/html/body/div[2]/div[5]/div/div/div[1]/div/div/div/div/div/div[2]/div/nav/div/div/div[2]/div/div/div[1]/a"));
        category.click();


        WebElement input = driver.findElement(By.cssSelector("input[type='search']"));
        input.sendKeys("Mavic mini");
        input.submit();

    }
}
