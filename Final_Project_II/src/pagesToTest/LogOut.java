package pagesToTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogOut {
	
	WebDriver driver;
	By homeBack = By.xpath("//div[@id=\"nav\"]//a[@href=\"index.jsf\"]");
	By logOut = By.id("logout-form:logout");
	
	
	public LogOut(WebDriver driver) {
		this.driver = driver;
	}
	
	public void clickBackHome(WebDriver driver) throws InterruptedException {
		driver.findElement(homeBack).click();
		Thread.sleep(2000);
		driver.findElement(logOut).click();
		Thread.sleep(3000);
		driver.close();
	}

}
