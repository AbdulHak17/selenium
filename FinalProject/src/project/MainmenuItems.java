package project;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainmenuItems {
	
	WebDriver driver;
	WebDriverWait wait;
	
	public MainmenuItems(WebDriver driver) {
		this.driver=driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="/html/body/div/div[1]/div[1]/aside/nav/div[2]/ul/li[2]/a/span")
	WebElement pim;
	
	public void clickPim() {
		wait.until(ExpectedConditions.elementToBeClickable(pim)).click();
	}

}
