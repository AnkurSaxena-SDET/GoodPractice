package day29;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//Handle Alert without switchTo().alert() method
//using Explicit Wait
public class HandleAlertUsingExplicitWait {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();
		Thread.sleep(5000);// just to show what happen

		// we need to switch our driver to alert box and accept it

		//driver.switchTo().alert().accept();
         Alert myalert=driver.switchTo().alert();
         System.out.println(myalert.getText());
         myalert.accept();
	}

}
