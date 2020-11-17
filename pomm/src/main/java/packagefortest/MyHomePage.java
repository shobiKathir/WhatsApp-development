package packagefortest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MyHomePage {

	public void clickLinkMtd() {
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		
	}
}
