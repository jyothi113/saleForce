package salesForceTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ForgotPassword_4A_TC_04 {
public static void main(String[] args){
	
	System.out.println("TC_04A Forgot Password");
	System.setProperty("webdriver.chrome.driver", "C:\\Jyothi\\drivers\\chromedriver.exe");
	
	WebDriver driver;
	driver=new ChromeDriver();
	driver.get("https://login.salesforce.com/");
	
	WebElement forgotPassWord = driver.findElement(By.xpath("//a[@id='forgot_password_link']"));
	forgotPassWord.click();
	
	System.out.println("Salesforce Forgot Password page is displayed");
		
	WebElement UserNameinForgotPassword = driver.findElement(By.id("un"));
		UserNameinForgotPassword.sendKeys("jyothipraveena194-xzax@force.com");
		
		WebElement ContinueButton = driver.findElement(By.xpath("//input[@id='continue']"));
		ContinueButton.click();
		
		System.out.println("Password Reset message is dispalyed and email is sent");
		
		
		
		

}
}
