package pagepkg;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SaucedemoFillInfo {
	
EdgeDriver driver;
	
	@FindBy(xpath="//*[@id=\"first-name\"]")
	WebElement firstname;
	
	@FindBy(xpath="//*[@id=\"last-name\"]")
	WebElement lastname;
	
	@FindBy(xpath="//*[@id=\"postal-code\"]")
	WebElement zipcode;
	
	@FindBy(xpath="//*[@id=\"continue\"]")
	WebElement continuebutton;
	
	public SaucedemoFillInfo(EdgeDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void passValues(String fname, String lname, String zcode)
	{
		firstname.sendKeys(fname);
		lastname.sendKeys(lname);
		zipcode.sendKeys(zcode);
	}
	
	public void buttonClick()
	{
		continuebutton.click();
	}
}
