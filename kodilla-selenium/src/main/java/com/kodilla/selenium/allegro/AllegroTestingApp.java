package com.kodilla.selenium.allegro;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllegroTestingApp {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\selenium drivers\\chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://allegro.pl/");

        Alert alert = driver.switchTo().alert();
        alert.accept();

        WebElement inputField = driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div/header/div/div/div/div/form/input/"));
        inputField.sendKeys("Mavic mini");
        inputField.submit();

    }
}
