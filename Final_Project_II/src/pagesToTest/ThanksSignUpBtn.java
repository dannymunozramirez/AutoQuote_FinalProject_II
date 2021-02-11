package pagesToTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ThanksSignUpBtn {
	
	WebDriver driver;
	By continueBtn = By.id("signup:continue");
	
	public ThanksSignUpBtn(WebDriver driver) {
		this.driver = driver;
	}
	
	public void clickBtn(WebDriver driver) throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(continueBtn).click();
	}

}
