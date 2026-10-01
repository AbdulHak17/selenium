package project;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
	
	WebDriver driver;
	WebDriverWait wait;
	
	public LoginPage(WebDriver driver) {
		
		this.driver=driver;
		this.wait= new WebDriverWait(driver, Duration.ofSeconds(10));
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="username")
	WebElement usernameField;
	
	@FindBy(name="password")
	WebElement passwordField;
	
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")
	WebElement loginButton;
	
	public void enterUsername(String username) {
		wait.until(ExpectedConditions.visibilityOf(usernameField)).sendKeys(username);
	}
	
	public void enterPassword(String password) {
		wait.until(ExpectedConditions.visibilityOf(passwordField)).sendKeys(password);
	}
	
	public void clickLoginbutton() {
		loginButton.click();
	}
	
}
