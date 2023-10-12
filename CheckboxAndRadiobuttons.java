package com.week1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxAndRadiobuttons {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Softwares1\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		driver.manage().window().maximize();
		List<WebElement> checkboxes = driver.findElements(By.cssSelector("input[type='checkbox']"));
		System.out.println("Total no of check boxed are: " + checkboxes.size());		
		//De select all the check boxed
		//Selecting the odd check boxes

		for (int i = 0; i < checkboxes.size(); i++) {

			boolean b = checkboxes.get(i).isSelected();	
			
			if (b == true) {
				System.out.println(" Selected check box no is" + i);
				checkboxes.get(i).click();
				Thread.sleep(5000);
			}
		}

		for (int i = 0; i < checkboxes.size(); i++) {
			checkboxes.get(i).click();
			Thread.sleep(5000);
		
		}

		// Radio button status and selecting the 3rd radio button

		List<WebElement> radiobuttons = driver.findElements(By.cssSelector("input[type='radio']"));
		System.out.println("Size of the radio buttons are : " + radiobuttons.size());

		driver.findElement(By.cssSelector("form>input[type='radio'][value='green']")).click();

		Thread.sleep(5000);

		for (WebElement radio : radiobuttons) {
			System.out.println("Radio button name is:  " + radio.getAttribute("value"));
			System.out.println("Radio button name and status " + radio.isSelected());
			String s = "yellow";
			String s1 = radio.getAttribute("value");
			System.out.println("S1 is" + s1);
			if (s.equalsIgnoreCase(s1)) {
				radio.click();
				Thread.sleep(10000);
			}

		}
		driver.close();
	}

}
