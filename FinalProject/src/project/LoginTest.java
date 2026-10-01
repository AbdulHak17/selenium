package project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginTest {
	
	WebDriver driver;
	
	LoginPage login;
	MainmenuItems menu;
	AddEmployee addemployee;
	
	@BeforeClass
	public void launch() {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		login = new LoginPage(driver);
		menu = new MainmenuItems(driver);
		addemployee = new AddEmployee(driver);
	}
	
	@Test(priority=0)
	public void testlogin() {
		
		login.enterUsername("Admin");
		login.enterPassword("admin123");
		login.clickLoginbutton();
	}
	
	@Test(priority=1)
	public void testmenu() {
		
		menu.clickPim();
	}
	
	@Test(priority=2)
	public void testaddemployee() {
		
		addemployee.clickAddEmployee();
		addemployee.enterfirstName("Abdul");
		addemployee.entermiddleName("Hakim");
		addemployee.enterlastName("A");
		addemployee.clicksaveButton();
	}
	
	
	@AfterClass
	public void teardown() throws InterruptedException {
		
		Thread.sleep(10000);
		driver.quit();
	}
	
}
