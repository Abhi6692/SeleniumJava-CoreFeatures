package selenium_Core_Features.realTimeExercises_9;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Scrolling_Window_WebTable {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		JavascriptExecutor js = (JavascriptExecutor)driver;

		//Scroll the browser window
		js.executeScript ("window.scrollBy(0,500)");

		Thread. sleep (3000) ;

		//Scroll the Desired table - Locator used here is CssSelector
		js.executeScript ("document.querySelector('.tableFixHead').scrollTop=5000");

		List<WebElement>values= driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));

		int sum =0;

		for(int i =0; i<values.size(); i++)
		{
		sum = sum + Integer.parseInt(values.get(i).getText());//51
		}

		System.out.println (sum);

		driver. findElement (By.cssSelector(".totalAmount")).getText();

		int total = Integer.parseInt(driver.findElement(By.cssSelector(".totalAmount")).getText().split(":")[1].trim());

		Assert.assertEquals(sum, total);
		
		
	}
	
	
	
}
