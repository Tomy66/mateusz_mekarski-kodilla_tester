package com.kodilla.selenium.allegro;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;


import java.util.List;
import java.util.concurrent.TimeUnit;

public class AllegroTestingApp {
    public static void main(String[] args) throws Exception {
        System.setProperty("webdriver.chrome.driver","C:\\selenium drivers\\chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://allegro.pl/");

        TimeUnit.MILLISECONDS.sleep(100);
        driver.switchTo().activeElement().sendKeys(Keys.ENTER);

        WebElement category = driver.findElement(By.cssSelector("body > div.main-wrapper > div:nth-child(5) > div > div > div:nth-child(1) > div > div > div > div > div > div:nth-child(2) > div > nav > div > div > div.mg9e_16.mvrt_0.mh36_0.mj7a_0._9plbd._4b3d3_3La74._152v3 > div > div > div:nth-child(1)"));
        category.click();
        TimeUnit.MILLISECONDS.sleep(100);

        WebElement input = driver.findElement(By.cssSelector("input[type='search']"));
        input.sendKeys("Mavic mini");
        input.submit();
        TimeUnit.MILLISECONDS.sleep(100);

        List<WebElement> elements = driver.findElements(By.tagName("article"));
        elements.get(1).getText();

    }
}
