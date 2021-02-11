package UtilFinalProjectII;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import pagesToTest.AutomobileQuote;
import pagesToTest.CreditCardInfo;
import pagesToTest.Home;
import pagesToTest.LogOut;
import pagesToTest.ThanksSignUpBtn;

public class UtilClassProjectII {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new FirefoxDriver();
		System.setProperty("webdriver.chromedriver.driver",
				"/Users/dannymunoz/git/projectII/projectII_MCIT_Munoz_Martinez/geckodriver");
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://demo.borland.com/InsuranceWebExtJS/signup.jsf");

		Home home = new Home(driver);
		ThanksSignUpBtn click = new ThanksSignUpBtn(driver);
		AutomobileQuote quote = new AutomobileQuote(driver);
		CreditCardInfo creditCard = new CreditCardInfo(driver);
		LogOut logOut = new LogOut(driver);
		
		
		home.fillOutForm(driver);
		click.clickBtn(driver);
		quote.fillingOutForm(driver);
		creditCard.fillingOutCreditCard(driver);
		logOut.clickBackHome(driver);
		

	}
}