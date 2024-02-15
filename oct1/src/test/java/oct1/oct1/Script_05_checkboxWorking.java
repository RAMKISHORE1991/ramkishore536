package oct1.oct1;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Script_05_checkboxWorking {

	public static void main(String[] args) throws Throwable{


		WebDriver driver = new ChromeDriver();

		driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		wait.until(ExpectedConditions.alertIsPresent());
		// check box working
		WebElement checkBoxLink = driver.findElement(By.xpath("//button[@id='checkbox']"));
		WebElement	checkBoxStatus = driver.findElement(By.xpath("//input[@id='ch']"));
		checkBoxLink.click();
		System.out.println(checkBoxStatus.isSelected()+"'");
		wait.until(ExpectedConditions.elementToBeSelected(By.xpath("//input[@id='ch']")));
		System.out.println(checkBoxStatus.isSelected());

	}
}
