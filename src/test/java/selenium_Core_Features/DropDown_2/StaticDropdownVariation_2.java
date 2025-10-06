package selenium_Core_Features.DropDown_2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


//Passengers Dropdown - No Select Tag
public class StaticDropdownVariation_2 {

	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		driver.findElement(By.id("divpaxinfo")).click();
		 Thread.sleep(2000);
		 
		 //Click on the adult plus button 4 times using While
		 int i=1;

		 while(i<5)

		 {

		 driver.findElement(By.id("hrefIncAdt")).click();

		 i++;
		
		
		
	}
		 
		
	
		 
		//Using For loop 
		 
		 /*for(int i=1;i<5;i++)

		 {

		 driver.findElement(By.id("hrefIncAdt")).click();

		 }*/

		 driver.findElement(By.id("btnclosepaxoption")).click();

		 Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");

		 System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
	
	}}
