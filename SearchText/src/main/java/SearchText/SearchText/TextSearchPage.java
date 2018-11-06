package SearchText.SearchText;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class TextSearchPage {
	
	
	public TextSearchPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(id="lst-ib")
	private WebElement searcTextbox;
	
	
	@FindBy(xpath="//div[@class='sbqs_c']")
	private List<WebElement> allElements;
	
	//input text:test Automation
	public void enterText(String inputText)
	{
		searcTextbox.sendKeys(inputText);
	}
	
	public void findSize()
	{
		//Print count of all the links
		int size = allElements.size();
		System.out.println("Link counts  : "+size);
		
		for(WebElement links : allElements)
		{
			String element = links.getText();
			System.out.println("Print elements::");
			System.out.println(element);
		}
		
	}
	
}