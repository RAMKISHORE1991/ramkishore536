package oct1.oct1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
	       
		driver.get("https://testautomationpractice.blogspot.com/");
       
		 //get string url
		String url = driver.getCurrentUrl();
		System.out.println(url);
        
		//get current  url
		driver.getCurrentUrl();
		System.out.println(driver.getCurrentUrl());
        
		//get title
		driver.getTitle();
		System.out.println(driver.getTitle());
		
		// maximize minimize window
	    driver.manage().window().maximize();
	    driver.manage().window().minimize();
	    
	    driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("RAMKISHORE");
	    
	    driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("ramkishore9196@gmail.com");
	    
	    driver.findElement(By.xpath("//*[@id=\"phone\"]")).sendKeys("9618093184");
	    
		
	    WebElement clickOperation =	driver.findElement(By.xpath("//input[@id='male']"));
		System.out.println(clickOperation.isSelected());
		clickOperation.click();
		
		String text = driver.findElement(By.xpath("//h1[@class='title']")).getText();
		System.out.println(text);
		
	}
	}
