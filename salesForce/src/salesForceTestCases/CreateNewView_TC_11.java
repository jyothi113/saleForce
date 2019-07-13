package salesForceTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateNewView_TC_11 {
	
	public static void main(String[] args) throws InterruptedException{
		
		System.out.println("Create New View ");
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
		
		
		WebElement CreateNewViewLink = driver.findElement(By.xpath("//a[contains(text(),'Create New View')]"));
		CreateNewViewLink.click();
		
		System.out.println("Create New View is clicked");
		
		
		Thread.sleep(3000);
		WebElement ViewName = driver.findElement(By.xpath("//input[@id='fname']"));
		ViewName.sendKeys("abc");
		
		System.out.println("View Name is provided");
		Thread.sleep(2000);
		
		WebElement ViewUniqueName = driver.findElement(By.xpath("//input[@id='devname']"));
		ViewUniqueName.sendKeys("abc_1234");
		System.out.println("View Unique Name is provided");
		Thread.sleep(2000);
		
		WebElement SaveTab = driver.findElement(By.xpath("//div[@class='pbHeader']//input[@name='save']"));
		SaveTab.click();
		
		System.out.println("Saved");
		
	}
}
