package oct1.oct1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webdrivermethods {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
       
		driver.get("https://www.techlistic.com/p/selenium-practice-form.html");

		
		driver.getCurrentUrl();
		System.out.println(driver.getCurrentUrl());

		
		driver.getPageSource();
		System.out.println(driver.getPageSource());
		
		
		driver.getTitle();
		System.out.println(driver.getTitle());
	
		
		
		driver.getWindowHandle();
		System.out.println(driver.getWindowHandle());
		
		
		driver.getWindowHandles();
		
		

	}

}
