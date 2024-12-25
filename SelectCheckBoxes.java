package day29;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectCheckBoxes {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();

		//1)- select specific check box

		//driver.findElement(By.xpath("//input[@id='sunday']']")).click();

		//2)- Select all check boxes

		List<WebElement> checkboxes= driver.findElements(By.xpath("//input[@class='form-check-input' and@type='checkbox']"));
		/*for(int i=0; i<checkboxes.size(); i++)
            {
            	checkboxes.get(i).click();

            }*/
		/*for (WebElement checkbox:checkboxes) {
			   checkbox.click();
		}*/

		//3)-select last 3 check boxes
		//Notes:(formula):- Total number of check boxes - how many check boxes you want to select =Starting index
		//7-3=4  so 4 is our index number 

		/*for(int i=4; i<checkboxes.size();i++)
		{
			checkboxes.get(i).click();
		}*/
		
		//4)-Select first 3 check boxes
		
		
		/*for(int i=0; i<3; i++)
		{
			checkboxes.get(i).click();
		}*/
		
		//5)- we have uncheck the checked check boxes
		//for that we have to select some checkbox -like starting 3 check boxes
		
		for(int i=0;i<3;i++)
		{
			checkboxes.get(i).click();
		}
		 Thread.sleep(5000);
		// now unselect above 3 check boxes
		
		for(int i=0; i<checkboxes.size();i++)
		{
			if(checkboxes.get(i).isSelected())
			{
				checkboxes.get(i).click();
			}
		}
		
	}
}

