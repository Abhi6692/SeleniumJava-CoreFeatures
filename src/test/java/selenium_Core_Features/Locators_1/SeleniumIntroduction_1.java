//This class contains basic  selenium codes

package selenium_Core_Features.Locators_1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumIntroduction_1 {

	public static void main(String[] args) {

		// Invoke Browser - Chrome
		// WebDriver is an Interface
		// We need to set the path of the chrome browser via the line below
		// From Selenium 4.11, If we donot set this line then Selenium Manager comes
		// into picture and invokes the browser

		//System.setProperty("webdriver.chrome.driver",
				//"C:\\Users\\OM\\OneDrive\\Desktop\\Abhishek's Workspace1\\selenium_introduction\\chromedriver-win64\\chromedriver.exe");
	
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/");
		String titleOfThePage = driver.getTitle();
		System.out.println("The Title of the current Page is : " + titleOfThePage);
		System.out.println(driver.getCurrentUrl());
		driver.close();

	}

}
