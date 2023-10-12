package com.week1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Softwares1\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		driver.manage().window().maximize();		
		List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
		System.out.println(" Size of the checkboxes is: " + checkboxes.size());	
		
		for(int i=0; i<checkboxes.size(); i++) {			
			checkboxes.get(i).click();
			Thread.sleep(5000);
		}
		
		Thread.sleep(10000);
		
		List<WebElement> radiobuttons = driver.findElements(By.xpath("//input[@type='radio']"));
		System.out.println("Total no of radio buttons are" + radiobuttons.size());

		driver.quit();

	}

}
