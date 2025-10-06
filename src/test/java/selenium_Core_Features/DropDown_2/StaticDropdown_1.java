package selenium_Core_Features.DropDown_2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

//Currency Dropdown - If the tag name is Select - Its a static dropdown
public class StaticDropdown_1 {

	
	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		WebElement staticDropDown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		
		Select DropDown = new Select(staticDropDown);
		
		DropDown.selectByIndex(0);
		DropDown.selectByValue("AED");
		DropDown.selectByVisibleText("USD");
		
		String selectedCurrency = DropDown.getFirstSelectedOption().getText();
		System.out.println("The Currency is : " + selectedCurrency);
		
		
		
		
		
		
		
	}
}
