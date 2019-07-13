package salesForceTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Merge_accounts_TC_13 {
	
	public static void main(String[] args) throws InterruptedException{
		System.out.println("Merge accounts");
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
		
	
		Thread.sleep(2000);
		WebElement MergeAccountsLink = driver.findElement(By.xpath("//a[contains(text(),'Merge Accounts')]"));
		MergeAccountsLink.click();
		
		WebElement MergeAccountsTextbox = driver.findElement(By.xpath("//input[@id='srch']"));
		MergeAccountsTextbox.sendKeys("Jo");
		
		WebElement FindAccountsButton = driver.findElement(By.xpath("//input[@name='srchbutton']"));
		FindAccountsButton.click();
}
}
