package testpkg;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import basepkg.BaseclassSaucedemo;
import pagepkg.SaucedemoAddProd;
import pagepkg.SaucedemoBackHomeLogout;
import pagepkg.SaucedemoCart;
import pagepkg.SaucedemoFillInfo;
import pagepkg.SaucedemoCart;
import pagepkg.SaucedemoLogin;
import utilities.SaucedemoExcelUtils;

public class SaucedemoTest extends BaseclassSaucedemo{
	
	@Test
	public void saucedemoTest() throws Exception 
	{
		SaucedemoLogin s1=new SaucedemoLogin(driver);
		String xl="C:\\Users\\AthiraPC\\Desktop\\Luminar\\Data Driven\\saucedemo.xlsx";
		String Sheet="Sheet1";
		int rowCount=SaucedemoExcelUtils.getRowCount(xl, Sheet);
		
		for(int i=1; i<=rowCount; i++)
		{
			Thread.sleep(3000);
			driver.findElement(By.id("user-name")).clear();
			String un=SaucedemoExcelUtils.getCellValue(xl, Sheet, i, 0);
			System.out.println("Username:" +un);
			
			driver.findElement(By.id("password")).clear();
			String pswd=SaucedemoExcelUtils.getCellValue(xl, Sheet, i, 1);
			System.out.println("Password:" +pswd);
			
			s1.setValues(un, pswd);
			s1.loginClick();
		}
		
		SaucedemoAddProd a1=new SaucedemoAddProd(driver);
		Thread.sleep(3000);
		a1.addToCart();
		
		SaucedemoCart c1=new SaucedemoCart(driver);
		Thread.sleep(3000);
		c1.cart();
		
		SaucedemoFillInfo f1=new SaucedemoFillInfo(driver);
		Thread.sleep(3000);
		f1.passValues("Athira", "Soman", "686585");
		f1.buttonClick();
		
		SaucedemoBackHomeLogout l1=new SaucedemoBackHomeLogout(driver);
		l1.logout();
	}
}
