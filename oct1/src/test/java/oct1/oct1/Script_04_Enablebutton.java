package oct1.oct1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Script_04_Enablebutton {
	public static void main(String[] args) {


		WebDriver driver = new ChromeDriver();

		driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

		//enable button 

		WebElement enableButton = driver.findElement(By.xpath("//button[@id='enable-button']"));
		WebElement	enableButtonStatus = driver.findElement(By.xpath("//button[@id='disable']"));

		System.out.println(enableButtonStatus.isEnabled());
		enableButton.click();
		System.out.println(enableButtonStatus.isEnabled());
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[@id='disable']")));
		System.out.println(enableButtonStatus.isEnabled());


	}
}