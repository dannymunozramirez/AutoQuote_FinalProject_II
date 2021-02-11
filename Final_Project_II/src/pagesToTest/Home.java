package pagesToTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.support.ui.Select;

public class Home {
	
	WebDriver driver;
	//Form fields
	By firstName = By.id("signup:fname");
	By lastName = By.id("signup:lname");
//	By clickCalendar = By.id("ext-gen4");
	By birthDate = By.id("BirthDate");
	By email = By.id("signup:email");
	By address = By.id("signup:street");
	By city = By.id("signup:city");
	By state = By.id("signup:state");
	By postalCode = By.id("signup:zip");
	By password = By.id("signup:password");
	By signUpBtn = By.id("signup:signup");
	
	String fname = "Danny";
	String lname = "Munoz";
	String bDate = "16/06/1984";
	String emailInfo = "tes8@test.com";
	String addressInfo = "343 Ch Queen Mary";
	String cityInfo = "Boston";
	String stateOp = "Massachusetts";
	String postalCodeInfo = "123456";
	String passwordInfo = "12345678";
	
	String baseUrl = "http://demo.borland.com/InsuranceWebExtJS/signup.jsf";
	
	public Home(WebDriver driver) {
		this.driver = driver;
	}
	
	public void fillOutForm(WebDriver driver) throws InterruptedException {
		
		driver.findElement(firstName).sendKeys(fname);
		Thread.sleep(2000);
		driver.findElement(lastName).sendKeys(lname);
		Thread.sleep(2000);
		driver.findElement(birthDate).sendKeys(bDate);
		Thread.sleep(2000);
		driver.findElement(email).sendKeys(emailInfo);
		Thread.sleep(2000);
		driver.findElement(address).sendKeys(addressInfo);
		Thread.sleep(2000);
		driver.findElement(city).sendKeys(cityInfo);
		Thread.sleep(2000);
		
		Select stat = new Select(driver.findElement(state));
		stat.selectByVisibleText(stateOp);
		
		driver.findElement(postalCode).sendKeys(postalCodeInfo);
		Thread.sleep(2000);
		driver.findElement(password).sendKeys(passwordInfo);
		Thread.sleep(2000);
		driver.findElement(signUpBtn).click();
		
	}

}
