package packagefortest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPage {

	public static void userNameMtd() {
		driver.findElement(By.id("username"))

		LoginPage lp =new LoginPage();
	}
	
	public void pwdMtd(){
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
}
	public void loginBtn() {
		
		driver.findElement(By.className("decorativeSubmit")).click();
	}
}