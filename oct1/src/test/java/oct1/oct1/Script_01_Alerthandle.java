package oct1.oct1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Script_01_Alerthandle {
	
	public static void main(String[] args) throws Throwable{


		WebDriver driver = new ChromeDriver();

		driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");


		WebElement click = driver.findElement(By.xpath("//button[@id='alert']"));
		click.click();

		//EXPLICIT WAIT
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		wait.until(ExpectedConditions.alertIsPresent());

		Alert alerts  = driver.switchTo().alert();
		alerts.accept();

		
		String alertText = driver.findElement(By.xpath("//span[text() =' Alert opens in : ']")).getText();
		System.out.println(alertText);

}
}
