package day29;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlerts {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		/* there is 3 types of alert 
		 * first is normal alert with only OK button.
		 * Second is confirmation alert with two button OK and Cancel button.
		 * Third prompt alert -input text filed with OK and Cancel button.
		 */

		//1)- normal alert with ok button -easy one
		// driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();

		Thread.sleep(5000);// just to show what happen

		// we need to switch our driver to alert box and accept it

		//driver.switchTo().alert().accept();

		/*if i want to capture text of alert box 
		 * then accept/select on OK in alert box
		 * for that we use to store in variable 
		 * type is alert with getText() method and print 
		 */

		/*Alert myalert = driver.switchTo().alert();

      System.out.println(myalert.getText());
      myalert.accept();*/

		//2)-confirmation alert type -accept()-for OK, dismiss -for Cancel button 

		//driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']")).click();

		//driver.switchTo().alert().accept();//close alert using OK button
		//driver.switchTo().alert().dismiss(); // close alert using cancel button

		/*to capture text same method use - 
        store in alert variable and use get text method
         and with print method print text */

		//3)-prompt alert- with input box

		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();
		Alert myalert=driver.switchTo().alert();
		myalert.sendKeys("Ankur Saxena");
		myalert.accept();


	}

}
