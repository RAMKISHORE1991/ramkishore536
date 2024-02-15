package oct1.oct1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dyanamicautosuggestions {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("apple");
		List <WebElement> dyanaicsuggestions1 = driver.findElements(By.xpath("//div[@class='s-suggestion-container']"));
		System.out.println(dyanaicsuggestions1.size());
		List <WebElement> dyanaicsuggestions = driver.findElements(By.xpath("//div[@class='s-suggestion-container']//div[@role='button']//span[text()=' pencil']"));
		System.out.println(dyanaicsuggestions.size());

		for (WebElement options : dyanaicsuggestions) {
			System.out.println(options.getText());
			options.click();
			
		
		}
	}
}
