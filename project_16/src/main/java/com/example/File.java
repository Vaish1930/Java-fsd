package com.example;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class File {

    public static void main(String[] args) throws IOException, InterruptedException {

        WebDriver d = new ChromeDriver();
        d.manage().window().maximize();
        d.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        d.get("http://127.0.0.1:5500/file.html");
        d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        JavascriptExecutor js = (JavascriptExecutor) d;
        js.executeScript("window.scrollBy(0,380)");
        Thread.sleep(3000);

        WebElement browse = d.findElement(By.id("fileToUpload"));
        browse.sendKeys("D:\\Projects\\LMS_Project\\Attisted_projects_mphasis\\_Arithmetic Calculator _Output.pdf");
        System.out.println("File is Uploaded Successfully");

    }

}