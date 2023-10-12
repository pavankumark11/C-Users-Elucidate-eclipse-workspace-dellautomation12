package com.week1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames2 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Softwares1\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/frames");
		driver.manage().window().maximize();
		Thread.sleep(8000);
		// Count no of frames
	List<WebElement>	frames=driver.findElements(By.tagName("iframe"));	
	System.out.println("No of frames are :" + frames.size());
	
	//Switch to the frame by Index
	driver.switchTo().frame(3);
	
	// switching by web element
//	WebElement frame = driver.findElement(By.xpath("//div[@id='frame1Wrapper']"));
//	driver.switchTo().frame(frame);
	
	String actualFrameText=driver.findElement(By.id("sampleHeading")).getText();
	
	System.out.println("Frame text is : " +actualFrameText );
	
	String expectedFrameText="This is a sample page";
	
	if(expectedFrameText.equalsIgnoreCase(actualFrameText)) {
		System.out.println(" test is pass");
	}
	else {
		System.out.println("test is fail");
	}
	driver.quit();
		
	}

}
