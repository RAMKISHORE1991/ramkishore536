package oct1.oct1;

import java.time.Duration;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicitwait {


	public static void main(String[] args) throws Throwable{


		WebDriver driver = new ChromeDriver();

		driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");


		WebElement click = driver.findElement(By.xpath("//button[@id='alert']"));
		click.click();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		wait.until(ExpectedConditions.alertIsPresent());

		Alert alerts  = driver.switchTo().alert();
		alerts.accept();

		//alert display
		String alertText = driver.findElement(By.xpath("//span[text() =' Alert opens in : ']")).getText();
		System.out.println("alert Text message after 5 seconds :   "+"'"+alertText+"'");
		WebElement changeText	= driver.findElement(By.xpath("//button[@id='populate-text']"));
		String intialTextCapture = driver.findElement(By.xpath("//h2[@id='h2']")).getText();
		System.out.println("before click operation change text status message is :  "  +"'"+intialTextCapture+"'");
		changeText.click();
		System.out.println("after click operation  change text message is :   "   +"'"+intialTextCapture+"'");


		String expectedTxt = "Selenium Webdriver";
		wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//h2[text()='Selenium Webdriver']"), expectedTxt));

		String textCapture = driver.findElement(By.xpath("//h2[@id='h2']")).getText();
		System.out.println("After 10 seconds " +intialTextCapture+ " message  replaced with :  "  +"'"+textCapture+"'");

		// button display working
		WebElement displayButton = driver.findElement(By.xpath("//button[@id='display-other-button']"));
		WebElement	buttonStatus = driver.findElement(By.xpath("//button[@id='hidden']"));
		System.out.println(buttonStatus.isDisplayed());
		displayButton.click();
		System.out.println(buttonStatus.isDisplayed());

		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='hidden']")));
		System.out.println(buttonStatus.isDisplayed());
		//enable button 
		
		WebElement enableButton = driver.findElement(By.xpath("//button[@id='enable-button']"));
		WebElement	enableButtonStatus = driver.findElement(By.xpath("//button[@id='disable']"));

		System.out.println(enableButtonStatus.isEnabled());
		enableButton.click();
		System.out.println(enableButtonStatus.isEnabled());
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[@id='disable']")));
		System.out.println(enableButtonStatus.isEnabled());

		// check box working
		WebElement checkBoxLink = driver.findElement(By.xpath("//button[@id='checkbox']"));
		WebElement	checkBoxStatus = driver.findElement(By.xpath("//input[@id='ch']"));
		checkBoxLink.click();
		System.out.println(checkBoxStatus.isSelected()+"'");
		wait.until(ExpectedConditions.elementToBeSelected(By.xpath("//input[@id='ch']")));
		System.out.println(checkBoxStatus.isSelected());

	}
}

