package pagesToTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CreditCardInfo {
	
	WebDriver driver;
	By ccHolder = By.id("purchaseQuote:cardname");
	By ccNumber = By.id("purchaseQuote:cardnumber");
	By exDay =  By.id("purchaseQuote:expiration");
	By purBtn = By.id("purchaseQuote:purchase");
	
	By home = By.cssSelector("li a[href=\"index.jsf\"]");
	
	String name = "Automation testing";
	String ccNumberInfo = "1234 1234 1234 1234";
	String exDayInfo = "12/21";
	
	public CreditCardInfo(WebDriver driver) {
		this.driver = driver;
	}
	
	public void fillingOutCreditCard(WebDriver driver) throws InterruptedException {
		
		driver.findElement(ccHolder).sendKeys(name);
		Thread.sleep(2000);
		driver.findElement(ccNumber).sendKeys(ccNumberInfo);
		Thread.sleep(2000);
		driver.findElement(exDay).sendKeys(exDayInfo);
		Thread.sleep(2000);
		driver.findElement(purBtn).click();
	}

}
