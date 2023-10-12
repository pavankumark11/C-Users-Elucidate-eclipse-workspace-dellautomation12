package com.javascript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

// Without sendkeys entering the data using the Javascriptexecutor
public class JavaScriptExecutorType {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Softwares1\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://login.yahoo.com/");
		driver.manage().window().maximize();
		Thread.sleep(8000);

		WebElement emailtextField = driver.findElement(By.id("login-username"));

		// Typecasting - Converting one data type to other
       //i.e driver data type(WebDriver) change to JavaScriptExecutor
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].value='nandisoftwarestudycircle@gmail.com'", emailtextField);
		Thread.sleep(8000);
		driver.quit();

	}

}
