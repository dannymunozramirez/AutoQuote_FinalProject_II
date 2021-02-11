package pagesToTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class AutomobileQuote {
	
	WebDriver driver;
	
	By selection = By.id("quick-link:jump-menu");
	By inputZipCode = By.id("autoquote:zipcode");
	By emailField = By.id("autoquote:e-mail");
	By ratioBtn = By.id("autoquote:vehicle:0");
	By nextBtn = By.id("autoquote:next");
	
	By age = By.id("autoquote:age");
	By ratioBtnII = By.id("autoquote:type:0");
	By ratioBtnIII = By.id("autoquote:type:1");
	By nextBtnII = By.id("autoquote:next");
	By year = By.id("autoquote:year");
	By gender = By.id("autoquote:gender:0");
	
	
	By arrowBrands = By.id("ext-gen4");
	By made = By.xpath("//div[text()=\"Toyota\"]");
	
	By arrowModel = By.id("ext-gen6");
	By model = By.xpath("//div[text()=\"Hilux\"]");
	
	By ratioOwn = By.id("autoquote:finInfo:0");
	
	By nextBtnIII = By.id("autoquote:next");
	
	By purchaseBtn = By.id("quote-result:purchase-quote");
	
	String autoQuote = "Auto Quote";
	String zipCode = "123456";
	String emailInfo = "test@test.com";
	String ageInfo = "36";
	String yearInfo = "2010";
	
	
	
	public  AutomobileQuote(WebDriver driver) {
		this.driver = driver;
	}
	
	public void fillingOutForm(WebDriver driver) throws InterruptedException {
		
		
		Select op = new Select(driver.findElement(selection));
		op.selectByVisibleText(autoQuote);
		Thread.sleep(2000);
		driver.findElement(inputZipCode).sendKeys(zipCode);
		Thread.sleep(2000);
		driver.findElement(emailField).sendKeys(emailInfo);
		Thread.sleep(2000);
		driver.findElement(ratioBtn).click();
		Thread.sleep(2000);
		driver.findElement(nextBtn).click();
		
		driver.findElement(age).clear();
		driver.findElement(age).sendKeys(ageInfo);
		Thread.sleep(2000);
		driver.findElement(gender).click();
		Thread.sleep(2000);
		driver.findElement(ratioBtnII).click();
		Thread.sleep(2000);
		driver.findElement(nextBtnII).click();
		
		driver.findElement(year).clear();
		driver.findElement(year).sendKeys(yearInfo);
		Thread.sleep(2000);
		driver.findElement(arrowBrands).click();
		Thread.sleep(2000);
		driver.findElement(made).click();
		Thread.sleep(2000);
		driver.findElement(arrowModel).click();
		Thread.sleep(2000);
		driver.findElement(model).click();
		Thread.sleep(2000);
		driver.findElement(ratioOwn).click();
		Thread.sleep(2000);
		driver.findElement(nextBtnIII).click();
		
		Thread.sleep(2000);
		driver.findElement(purchaseBtn).click();
		
		
		
		
		
		
		//TODO finalize filling out form
	}
	

}
