package pagepkg;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SaucedemoCart {
	
EdgeDriver driver;
	
	@FindBy(xpath="/html/body/div/div/div/div[1]/div[1]/div[3]/a")
	WebElement cart;
	
	@FindBy(xpath="/html/body/div/div/div/div[2]/div/div[2]/button[2]")
	WebElement checkout;
	
	public SaucedemoCart(EdgeDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void cart()
	{
		cart.click();
		checkout.click();	
	}
}
