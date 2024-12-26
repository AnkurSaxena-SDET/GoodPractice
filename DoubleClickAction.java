package day35;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickAction {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");
		driver.manage().window().maximize();
		
		//Switch to i frames
		driver.switchTo().frame("iframeResult");
		
		WebElement box1=driver.findElement(By.xpath(""));
		WebElement box2 =driver.findElement(By.xpath(""));	
		
		WebElement button =driver.findElement(By.xpath("//button[normalize-space()='Copy Text']"));
		
		box1.clear();//clear the box1
		box1.sendKeys("WELCOME");
		//double click on the button
		Actions act =new Actions(driver);
		act.doubleClick(button).perform();
	}

}
