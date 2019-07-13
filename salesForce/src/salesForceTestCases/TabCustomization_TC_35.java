package salesForceTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TabCustomization_TC_35 {

	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("Tab Customization");
		System.setProperty("webdriver.chrome.driver","C:\\Jyothi\\drivers\\chromedriver.exe");
		WebDriver driver,driver1;
		driver = new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		Thread.sleep(3000);
		WebElement userName = driver.findElement(By.xpath("//input[@id='username']"));
		userName.sendKeys("jyothipraveena194-xzax@force.com");
		
		System.out.println("Username Entered");
		
		WebElement passWord =driver.findElement(By.xpath("//input[@id='password']"));
		passWord.sendKeys("Salesforce123*");
		System.out.println("password Entered");
		
		WebElement loginButton = driver.findElement(By.xpath("//input[@id='Login']"));
		loginButton.click();
		
		Thread.sleep(3000);
		System.out.println("Login Successful");
		
		WebElement PlusTab = driver.findElement(By.xpath("//img[@class='allTabsArrow']"));
		PlusTab.click();
		Thread.sleep(2000);
		WebElement CustomizeMyTabs = driver.findElement(By.xpath("//input[@name='customize']"));
		CustomizeMyTabs.click();
		Thread.sleep(3000);
		WebElement Quotes = driver.findElement(By.xpath("//option[contains(text(),'Quotes')]"));
		Quotes.click();
		Thread.sleep(2000);
		WebElement RemoveButton = driver.findElement(By.xpath("//img[@class='leftArrowIcon']"));
		RemoveButton.click();
		Thread.sleep(5000);
		
		WebElement SaveButton = driver.findElement(By.xpath("//input[@name='save']"));
		SaveButton.click();
		System.out.println("Removed Quotes from tabs");
		
	WebElement UserMenuDropdown = driver.findElement(By.xpath("//span[@id='userNavLabel']"));
		
		Thread.sleep(3000);
		UserMenuDropdown.click();
		
		WebElement LogoutOption = driver.findElement(By.xpath("//a[contains(text(),'Logout')]"));
		
		Thread.sleep(3000);
		LogoutOption.click();
		
		System.out.println("Logout Successful");
		Thread.sleep(6000);
		
		//driver1 = new ChromeDriver();
		//driver1.get("https://login.salesforce.com/");
		//Thread.sleep(3000);
		WebElement userName1 = driver.findElement(By.xpath("//input[@id='username']"));
		userName1.sendKeys("jyothipraveena194-xzax@force.com");
		
		System.out.println("Username Entered");
		
		WebElement passWord1 =driver.findElement(By.xpath("//input[@id='password']"));
		passWord1.sendKeys("Salesforce123*");
		System.out.println("password Entered");
		
		WebElement loginButton1 = driver.findElement(By.xpath("//input[@id='Login']"));
		loginButton1.click();
		
		
		System.out.println("quotes tab is not displayed");
		
		
	}

}
