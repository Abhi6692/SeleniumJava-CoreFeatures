package selenium_Core_Features.Mouse_Keyboard_ACTIONS_6;

import java.awt.Desktop.Action;
import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class KeyboardAction{
	
	
	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		
		driver.get("https://www.amazon.in/");
		
		Actions action = new Actions(driver);
		
		//Sending Text to Searchbox in Capital letter, and selecting the text by double click
		action.moveToElement(driver.findElement(By.cssSelector("#twotabsearchtextbox"))).click()
		.keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();
		
		//Right click - .contextClick()
		
		
	}
	
	
}


	