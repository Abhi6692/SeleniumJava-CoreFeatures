package selenium_Core_Features.realTimeExercises_9;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkCount_Scope_ChildWindowsTitle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		

		WebDriver driver = new ChromeDriver();

		driver.get("http://qaclickacademy.com/practice.php");
		
		// Give me the count of links on the page.
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		// Limiting webdriver scope
		WebElement footerdriver = driver.findElement(By.id("gf-BIG"));
		
		// Count of footer section- Links
		System.out.println(footerdriver.findElements(By.tagName("a")).size());

		// Limiting webdriver scope further more to 1st column
		WebElement coloumndriver = footerdriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		
		//// Count of footer section- 1st Column Links
		System.out.println(coloumndriver.findElements(By.tagName("a")).size());
		

		//Click on each link in the 1st coloumn and check if the pages are opening-
		for (int i = 1; i < coloumndriver.findElements(By.tagName("a")).size(); i++) {

			//Open all the links in new tab
			String clickonlinkTab = Keys.chord(Keys.CONTROL, Keys.ENTER);

			coloumndriver.findElements(By.tagName("a")).get(i).sendKeys(clickonlinkTab);
			Thread.sleep(5000L);

		} 
		
		// opens all the tabs and get the Titles of all the parent and child windows
		Set<String> abc = driver.getWindowHandles();// 4
		Iterator<String> it = abc.iterator();

		while (it.hasNext()) {

			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());

		}

	}

}