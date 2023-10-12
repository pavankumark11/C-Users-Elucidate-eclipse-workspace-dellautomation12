package com.week1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownSelect {	
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver",
			"C:\\Softwares1\\chromedriver_win32\\chromedriver.exe");	
	WebDriver driver = new ChromeDriver();
	driver.get("https://parabank.parasoft.com/parabank/index.htm");
	driver.manage().window().maximize();
	Thread.sleep(6000);	
	//Login to the application
	
	driver.findElement(By.name("username")).sendKeys("santhu");
	driver.findElement(By.name("password")).sendKeys("santhu123$");
	driver.findElement(By.cssSelector("input[type='submit'][class='button']")).click();
	Thread.sleep(6000);
	
	driver.findElement(By.xpath("//a[text()='Accounts Overview']")).click();
	Thread.sleep(10000);
	driver.findElement(By.xpath("//tr[@ng-repeat='account in accounts']/td[1]/a")).click();
	Thread.sleep(10000);

	WebElement  nandiDropdown=driver.findElement(By.id("month"));	
	Select sel=new Select(nandiDropdown);	
	sel.selectByValue("April");	
	sel.selectByIndex(5);	
	sel.selectByVisibleText("December");	
	sel.deselectAll();
	
	driver.quit();
	

}

}
