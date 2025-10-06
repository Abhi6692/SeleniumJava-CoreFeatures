//Dynamic Dropdown and Parent-Child Relationship Locator

package selenium_Core_Features.DropDown_2;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;


public class DynamicDropdown_3 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver =new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/dropdownsPractise/"); //URL in the browser

		//  //a[@value='MAA']  - Xpath for chennai

		//  //a[@value='BLR']

		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();

		driver.findElement(By.xpath("//a[@value='BLR']")).click();

		Thread.sleep(2000);
		
		
		//Using Index
		//driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
		
		
		//Using Parent Child Relationship
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();


	}}
