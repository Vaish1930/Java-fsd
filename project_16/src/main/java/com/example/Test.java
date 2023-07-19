package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.get("http://127.0.0.1:5500/index.html");
        // Locating Elements
        WebElement emailElement = driver.findElement(By.id("email"));
        System.out.println("Email by id " + emailElement);

        // Locating Elements through CSS.
        driver.findElement(By.cssSelector("input#email"));

        // Locating Elements through XPath.
        driver.findElement(By.xpath("html/body/form"));

        // Handling Various Web Elements.

        Select genderInput = new Select(driver.findElement(By.id("gender")));
        genderInput.selectByVisibleText("Female");

        // Handling external elements

        driver.switchTo().alert().accept();
    }

}
