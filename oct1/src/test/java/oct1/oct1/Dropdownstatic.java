package oct1.oct1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdownstatic {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

		//country dropdown
		WebElement dropdownstatic = driver.findElement(By.id("country"));
		Select sel = new Select(dropdownstatic);
		//sel.selectByIndex(5);
		sel.selectByValue("india");
		//sel.selectByVisibleText("France");

		// colors dropdown	  
		WebElement dropdowncolor = driver.findElement(By.id("colors"));
		Select sel1 = new Select(dropdowncolor);
		//sel1.selectByIndex(4);
		//sel1.selectByValue("red");
		sel1.selectByVisibleText("Blue");
	}

}
