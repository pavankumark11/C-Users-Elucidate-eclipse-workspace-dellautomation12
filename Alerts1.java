package com.week1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Softwares1\\chromedriver_win32\\chromedriver.exe");

		WebDriver	driver=new ChromeDriver();
	driver.get("https://demoqa.com/alerts");	
	driver.manage().window().maximize();
	Thread.sleep(5000);	
	driver.findElement(By.id("alertButton")).click();	
	Thread.sleep(5000);	
	Alert alert = driver.switchTo().alert();	
	alert.accept();	
	Thread.sleep(5000);	
	
	// 2nd assignment	
	driver.findElement(By.id("confirmButton")).click();
	Thread.sleep(5000);
	alert.dismiss();
	Thread.sleep(5000);	
	
	//3rd assignment
	driver.findElement(By.id("confirmButton")).click();
	Thread.sleep(5000);
	String v1=alert.getText();	
	Thread.sleep(5000);
	System.out.println("Popup value is : " + v1);	
	
	//4rd assigment
	
	driver.findElement(By.id("promtButton")).click();
	Thread.sleep(5000);
	alert.sendKeys("nandi software study circle");
	Thread.sleep(5000);	
	
	driver.quit();

	}
}
