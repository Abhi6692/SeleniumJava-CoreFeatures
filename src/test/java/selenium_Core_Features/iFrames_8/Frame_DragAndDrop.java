package selenium_Core_Features.iFrames_8;

import java.awt.Desktop.Action;
import java.time.Duration;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Frame_DragAndDrop{
	
	
	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();

		driver.get("https://jqueryui.com/droppable/");
		
		driver.switchTo().frame(0); 
		//driver.switchTo().frame(Index);
		//driver.switchTo().frame("nameOrID");
		//driver.switchTo().frame(Frame Webelement);
		

		
		driver.switchTo().frame(1);
		
		System.out.println(driver.findElements(By. tagName("iframe")).size());
		
		driver .switchTo().frame(0);
		//driver.switchTo() .frame(driver.findElement(By.cssSelectoriframe[class= demo-frame ])):
		driver.findElement (By.id("dcasgable")).click();
		
		Actions action =new Actions(driver);
		
		WebElement source =driver.findElement(By.id("draggable"));
		
		WebElement target =driver.findElement (By.id("droppable"));
		
		action.dragAndDrop(source, target).build().perform();
		
		driver.switchTo().defaultContent();

		//Using switchTo().defaultContent() --> If you are inside an iframe and need to switch back to the parent window.

		//Using switchTo().parentFrame() -->  If you are inside a nested iframe and need to go one level up.


















	}}
	