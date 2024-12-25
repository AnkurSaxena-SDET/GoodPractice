package day29;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAuthAlert {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://the-internet.herokuapp.com/basic_auth");
		
		
		/*handle authenticate popup in alertbox with username and password
		use method send url with username and password 
		syntax:
		http://username:password@the-internet.herokuapp.com/basic_auth
		http://admin:admin@the-internet.herokuapp.com/basic_auth */
		
		//driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");
		
		//Thread.sleep(5000);
		//driver.close();
		//practices:
		driver.get("https://testautomationpractice.blogspot.com/");
		/*driver.findElement(By.xpath("//tbody/tr[1]/td[4]/input[1]")).click();
		driver.findElement(By.xpath("//tbody/tr[2]/td[4]/input[1]")).click();
		driver.findElement(By.xpath("//tbody/tr[3]/td[4]/input[1]")).click();
		driver.findElement(By.xpath("//tbody/tr[4]/td[4]/input[1]")).click();
		driver.findElement(By.xpath("//tbody/tr[5]/td[4]/input[1]")).click();*/
		System.out.println(driver.findElements(By.xpath("//input[@type='checkbox']")).size());
		
}       
	

}