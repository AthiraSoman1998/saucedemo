package pagepkg;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SaucedemoAddProd {
	
EdgeDriver driver;
	
	@FindBy(id="add-to-cart-sauce-labs-backpack")
	WebElement backpack;
	
	@FindBy(id="add-to-cart-sauce-labs-bike-light")
	WebElement bikelight;
	
	@FindBy(id="add-to-cart-sauce-labs-bolt-t-shirt")
	WebElement tshirt;
	
	@FindBy(id="add-to-cart-sauce-labs-fleece-jacket")
	WebElement jacket;
	
	@FindBy(xpath="/html/body/div/div/div/div[2]/div/div/div/div[5]/div[2]/div[2]/button")
	WebElement onesie;
	
	@FindBy(xpath="/html/body/div/div/div/div[2]/div/div/div/div[6]/div[2]/div[2]/button")
	WebElement tshirtred;
	
	public SaucedemoAddProd(EdgeDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
		
	public void addToCart()
	{
		backpack.click();
		bikelight.click();
		tshirt.click();
		jacket.click();
		onesie.click();
		tshirtred.click();
	}
}
