package oct1.oct1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Script_02_ChangeTet {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();

		driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

		// CHANGE TEXT
				WebElement changeText	= driver.findElement(By.xpath("//button[@id='populate-text']"));
				String intialTextCapture = driver.findElement(By.xpath("//h2[@id='h2']")).getText();
				System.out.println(intialTextCapture);
				changeText.click();
				System.out.println(intialTextCapture);


				String expectedTxt = "Selenium Webdriver";
				wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//h2[text()='Selenium Webdriver']"), expectedTxt));

				String textCapture = driver.findElement(By.xpath("//h2[@id='h2']")).getText();
				System.out.println(textCapture);

	}

}
