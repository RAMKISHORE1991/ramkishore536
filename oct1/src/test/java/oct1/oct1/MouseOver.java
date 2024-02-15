package oct1.oct1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOver {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

       WebElement action1 = driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]/span"));
        Actions action = new Actions(driver);
        Thread.sleep(20000);
        action.moveToElement(action1);
        
	}

}
