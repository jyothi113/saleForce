package salesForceTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

	public class CreateAccount_TC_10 {
	public static void main(String[] args) throws InterruptedException{
	System.out.println("Create Account");
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
	
	Thread.sleep(2000);
	WebElement Accounts = driver.findElement(By.xpath("//li[@id='Account_Tab']//a[contains(text(),'Accounts')]"));
	Accounts.click();
	
	System.out.println("Accounts tab is selected");
	System.out.println("Accounts page is displayed");
	
	
	WebElement AccountsNewTab = driver.findElement(By.xpath("//input[@name='new']"));
	AccountsNewTab.click();
	System.out.println("New tab in Accounts page is selected");
	Thread.sleep(2000);
	System.out.println("New Account edit page is displayed");
	
	WebElement NewTabAccountName = driver.findElement(By.xpath("//input[@id='acc2']"));
	NewTabAccountName.sendKeys("Jyo");
	System.out.println("New Account name is given");
	
	Thread.sleep(2000);
	WebElement SaveTab = driver.findElement(By.xpath("//div[contains(@class,'pbHeader')]//input[1]"));
	SaveTab.click();
	
	System.out.println("New Account page is displayed with account details");
	}
}
