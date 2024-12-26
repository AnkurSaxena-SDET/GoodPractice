package day26;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class ConditionalMethod {
	public static void main(String[] args) throws InterruptedException {
	WebDriver driver =new ChromeDriver();
		driver.get("http://demo.nopcommerce.com/register");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//is Display()
		
		//WebElement logo =driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
		
		//System.out.println("Display Status of logo :"+logo.isDisplayed()); //true
		//boolean displayLogo =driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']")).isDisplayed();
		//System.out.println("logo display status :"+displayLogo);
		
		//is Enable method
		
		//boolean status =driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']")).isEnabled();
		//System.out.println("Enable status:"+status);
		
		//is selected method
		System.out.println("Before Selection");
		WebElement male_rd =driver.findElement(By.xpath("//input[@id='gender-male']"));
		WebElement female_rd =driver.findElement(By.xpath("//input[@id='gender-female']"));
		System.out.println(male_rd.isSelected()); //False
		System.out.println(female_rd.isSelected()); //False
		//after selection of male radio button
		System.out.println("After selection of male radio Button");
		male_rd.click(); //Select male radio button
		System.out.println(male_rd.isSelected()); //True
		System.out.println(female_rd.isSelected()); //False
		//after selection of female radio button
		System.out.println("After selection of Female radio Button ");
		female_rd.click();
		System.out.println(male_rd.isSelected());
		System.out.println(female_rd.isSelected());
		
		//checking check box status
		boolean newslatterstatus=driver.findElement(By.xpath("//input[@id='Newsletter']")).isSelected();
		System.out.println("News letter checkbox status:"+newslatterstatus );//true
		
		
		
	}
}
