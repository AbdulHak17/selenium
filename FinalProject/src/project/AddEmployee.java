package project;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddEmployee {
	
	WebDriver driver;
	WebDriverWait wait;
	
	public AddEmployee(WebDriver driver) {
		
		this.driver=driver;
		this.wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="/html/body/div/div[1]/div[1]/header/div[2]/nav/ul/li[3]/a")
	WebElement employee;
	
	@FindBy(name="firstName")
	WebElement firstnameField;
	
	@FindBy(name="middleName")
	WebElement middlenameField;
	
	@FindBy(name="lastName")
	WebElement lastnameField;
	
	@FindBy(xpath="/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[2]/button[2]")
	WebElement saveButton;
	
	public void clickAddEmployee() {
		wait.until(ExpectedConditions.elementToBeClickable(employee)).click();
	}
	
	public void enterfirstName(String firstname) {
		wait.until(ExpectedConditions.visibilityOf(firstnameField)).sendKeys(firstname);
	}
	
	public void entermiddleName(String middlename) {
		wait.until(ExpectedConditions.visibilityOf(middlenameField)).sendKeys(middlename);
	}
	
	public void enterlastName(String lastname) {
		wait.until(ExpectedConditions.visibilityOf(lastnameField)).sendKeys(lastname);
	}
	
	public void clicksaveButton() {
		wait.until(ExpectedConditions.elementToBeClickable(saveButton)).click();
	}

}
