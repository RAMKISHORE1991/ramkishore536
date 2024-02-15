package oct1.oct1;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		
	WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("PUTON");

		WebElement drag =	driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement drop = driver.findElement(By.xpath("//div[@id='droppable']"));
		Actions action = new Actions(driver);
		action.dragAndDrop(drag, drop).build().perform();
		

}
}
