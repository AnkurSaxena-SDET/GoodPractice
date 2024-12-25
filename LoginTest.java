package day42;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

	public static void main(String[] args) {
	 WebDriver driver =new ChromeDriver();
	 /*driver.get("https://www.saucedemo.com/");
	 driver.findElement(By.id("user-name")).sendKeys("standard_user");
	 driver.findElement(By.id("password")).sendKeys("secret_sauce");
	 driver.findElement(By.id("login-button")).click();
	 driver.close();*/
	 driver.manage().window().maximize();
	 driver.get("https://testautomationpractice.blogspot.com/");
	 
	 // select 
	 driver.findElement(By.xpath("//input[@id='sunday']']")).click();
	 
	}

}
