package com.week2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Softwares1\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/droppable");
		driver.manage().window().maximize();
		Thread.sleep(5000);

		Actions act=new Actions(driver);		
		WebElement source=driver.findElement(By.id("draggable"));	
		WebElement destination=driver.findElement(By.id("droppable"));

		act.dragAndDrop(source, destination).build().perform();
		Thread.sleep(8000);
		driver.quit();

	}

}
