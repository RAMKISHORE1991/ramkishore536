package oct1.oct1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chromebrowseropening {

	public static void main(String[] args) {
		
		  WebDriver driver = new ChromeDriver();
		  driver.get("https://www.google.com/");
         
		  //get title
		  driver.getTitle();
          System.out.println(driver.getTitle());
	}

}
