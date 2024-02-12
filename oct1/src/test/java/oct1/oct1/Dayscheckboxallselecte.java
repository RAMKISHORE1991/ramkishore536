package oct1.oct1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;



public class Dayscheckboxallselecte {

	
	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
	       
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
	    
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//*[@id=\"textarea\"]")).sendKeys("Plot no : 469, flat no : 201, Sri Krishna kaumidi apartment,vivekananda nagar colony ");
	    
	    Thread.sleep(2000);
	    WebElement clickOperation =	driver.findElement(By.xpath("//input[@id='male']"));
		System.out.println(clickOperation.isSelected());
		clickOperation.click();
		
//		WebElement clickOperation1 = driver.findElement(By.xpath("//*[@id=\"female\"]"));
//		System.out.println(clickOperation.isSelected());
//		clickOperation.click();
//		
		Thread.sleep(2000);
		List< WebElement> checkBoxes = driver.findElements(By.xpath("//input[@type='checkbox' and contains@id,'day'] "));
		
		for (WebElement operation : checkBoxes) {
			operation.click();
		}

//		for (int i=0;i<checkBoxes.size();i++) 
//        {
//			Operation.click();
//		}
		
		
	
		
	}
	}
