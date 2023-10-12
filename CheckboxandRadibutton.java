import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxandRadibutton {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Softwares1\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		driver.manage().window().maximize();
		Thread.sleep(10000);		
		driver.findElement(By.xpath("//input[@value='option-1']")).click();		
		Thread.sleep(5000);				
		boolean checkbox1 = driver.findElement(By.xpath("//input[@value='option-2']")).isSelected();
		
		if(checkbox1==true) {
			System.out.println("Check box 1 is selected: Pass");
		}
		
		else {
			
			System.out.println("Check box 1 is not selected: Fail");
		}
		
		driver.quit();
		
	}

}
