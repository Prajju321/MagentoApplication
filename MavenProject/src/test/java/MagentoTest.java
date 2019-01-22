


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class MagentoTest {
	
	@Test
	public void Mag() {
		String url="http://www.magento.com";
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(url);
		Home h=new Home(driver);
		h.clickOnMyAcc();
		

		Login l = new Login(driver);
		l.typeEmail("nitinmanjunath1991@gmail.com");
		l.typePassword("Welcome123");
		l.clickOnLogin();
		
		
		Logout l1 = new Logout(driver);
		l1.clickOnLogout();
	}
	
	

}
