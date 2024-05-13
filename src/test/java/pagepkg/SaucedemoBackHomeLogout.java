package pagepkg;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SaucedemoBackHomeLogout {
	
EdgeDriver driver;
	
	@FindBy(xpath="/html/body/div/div/div/div[2]/div/div[2]/div[9]/button[1]")
	WebElement cancel;
	
	@FindBy(xpath="/html/body/div/div/div/div[1]/div[1]/div[1]/div/div[1]/div/button")
	WebElement hamburgur;
	
	@FindBy(xpath="/html/body/div/div/div/div[1]/div[1]/div[1]/div/div[2]/div[1]/nav/a[3]")
	WebElement logout;
	
	public SaucedemoBackHomeLogout(EdgeDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void logout() throws Exception
	{
		cancel.click();
		hamburgur.click();
		Thread.sleep(3000);
		logout.click();
	}
}
