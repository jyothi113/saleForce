package salesForceTestCases;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AccountReport_TC_14 {


	public static void main(String[] args) throws InterruptedException{
		System.out.println("Account  Report");
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
		WebElement AccountswithLastActivityLink = driver.findElement(By.xpath("//a[contains(text(),'Accounts with last activity > 30 days')]"));
		AccountswithLastActivityLink.click();
		Thread.sleep(2000);
		System.out.println("Unsaved Report page displayed");
		
		//WebElement PopUpNoThanks = driver.findElement(By.xpath("//button[@id='ext-gen189']"));
		//PopUpNoThanks.click();
		
		WebElement DAtefielddropdown = driver.findElement(By.xpath("//img[@id='ext-gen148']"));
		DAtefielddropdown.click();
		
		WebElement createDAtedropdown = driver.findElement(By.xpath("//div[contains(text(),'Created Date')]"));
		createDAtedropdown.click();
		
		WebElement createDAteFrom = driver.findElement(By.xpath("//img[@id='ext-gen152']"));
		createDAteFrom.click();
		
		
		//WebElement createDAteFromToday = driver.findElement(By.xpath("//button[@id='ext-gen312']"));
		//createDAteFromToday.click();
		
		WebElement createDAteTo = driver.findElement(By.xpath("//img[@id='ext-gen154']"));
		createDAteTo.click();
		
		//WebElement createDAteToToday = driver.findElement(By.xpath("//button[@id='ext-gen328']"));
		//createDAteToToday.click();
		
		
		WebElement saveButton = driver.findElement(By.xpath("//button[@id='ext-gen49']"));
		saveButton.click();
		Thread.sleep(3000);
		
		WebElement PopupReportName = driver.findElement(By.xpath("//input[@id='saveReportDlg_reportNameField']"));
		//PopupReportName.clear();
		PopupReportName.sendKeys("Pravin");
		
		WebElement PopupReportUniqueName = driver.findElement(By.xpath("//input[@id='saveReportDlg_DeveloperName']"));
		PopupReportUniqueName.clear();
		PopupReportUniqueName.sendKeys("123");
		Thread.sleep(5000);
		WebElement PopupsaveButton = driver.findElement(By.xpath("//button[@id='ext-gen350']"));
		PopupsaveButton.click();
	
	}
	
}
