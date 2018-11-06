package SearchText.SearchText;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class TextSearchTest {
	
	@Test
	public void test_textCount() throws InterruptedException {
	
		//Set path for Chrome driver 
		 System.setProperty("webdriver.chrome.driver" ,"\\E:\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 driver.get("https://www.google.com");
		 driver.manage().window().maximize();
		//Create TextSearch Page object
		 TextSearchPage text = new TextSearchPage(driver);
		 //enter input text
		 text.enterText("Test Automation");
		 //find elements size 
		 text.findSize();
		 //Closing the browser
		 driver.quit();
	}

}
