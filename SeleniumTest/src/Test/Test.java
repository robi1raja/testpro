package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class Test {

	public static void main(String[] args) {
		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "\\Users\\robir\\Downloads\\chromedriver_win32 (Working)\\chromedriver.exe");
	
		driver=new ChromeDriver();
		driver.get("https://demo.oscommerce.com/create_account.php?osCsid=0cdcfkn264mk02ra5dr4mhpd33");
		
		driver.findElement(By.xpath("//input[@id='dob']")).sendKeys("10/25/1990");
		}
		
		
	
	}


