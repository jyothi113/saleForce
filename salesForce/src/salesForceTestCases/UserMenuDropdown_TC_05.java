package salesForceTestCases;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UserMenuDropdown_TC_05 {
	public static void main(String[] args) throws InterruptedException{
	System.out.println("UserMenuDropdown");
	System.setProperty("webdriver.chrome.driver","C:\\Jyothi\\drivers\\chromedriver.exe");
	WebDriver driver;
	driver = new ChromeDriver();
	driver.get("https://login.salesforce.com/");
	
	WebElement userName = driver.findElement(By.xpath("//input[@id='username']"));
	userName.sendKeys("jyothipraveena194-xzax@force.com");
	
	System.out.println("Username Entered");
	
	WebElement passWord =driver.findElement(By.xpath("//input[@id='password']"));
	passWord.sendKeys("Salesforce123*");
	System.out.println("password Entered");
	
	WebElement loginButton = driver.findElement(By.xpath("//input[@id='Login']"));
	loginButton.click();
	
	
	System.out.println("Login Successful");
	
	WebElement UserMenuDropdown = driver.findElement(By.xpath("//span[@id='userNavLabel']"));
	
	Thread.sleep(3000);
	UserMenuDropdown.click();
	System.out.println("Dropdown with My profile,My Settings,Developer Console,Logout is Displayed");
	}	

}
