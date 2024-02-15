package oct1.oct1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Script_03_buttondisplay {

	public static void main(String[] args) {


		WebDriver driver = new ChromeDriver();

		driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// button display working
				WebElement displayButton = driver.findElement(By.xpath("//button[@id='display-other-button']"));
				WebElement	buttonStatus = driver.findElement(By.xpath("//button[@id='hidden']"));
				System.out.println(buttonStatus.isDisplayed());
				displayButton.click();
				System.out.println(buttonStatus.isDisplayed());

				wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='hidden']")));
				System.out.println(buttonStatus.isDisplayed());

	}
}
