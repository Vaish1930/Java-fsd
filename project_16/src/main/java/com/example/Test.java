package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("http://127.0.0.1:5500/index.html");
        WebElement emailElement = driver.findElement(By.id("email"));
        System.out.println("Email by id " + emailElement);
    }

}
