package salesForceTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ContactNewView_TC_26 {

		public static void main(String[] args) throws InterruptedException {
		System.out.println("Create New View");
		System.setProperty("webdriver.chrome.driver","C:\\Jyothi\\drivers\\chromedriver.exe");
		WebDriver driver;
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
		
		
		System.out.println("Login Successful");
		
		Thread.sleep(2000);
		WebElement ContactTab = driver.findElement(By.xpath("//a[contains(text(),'Contacts')]"));
		ContactTab.click();
		
		
		WebElement CreateNewViewLink = driver.findElement(By.xpath("//a[contains(text(),'Create New View')]"));
		CreateNewViewLink.click();
		
		WebElement ViewName = driver.findElement(By.xpath("//input[@id='fname']"));
		ViewName.sendKeys("joe");
		
		WebElement UniqueViewName = driver.findElement(By.xpath("//input[@id='devname']"));
		UniqueViewName.sendKeys("12");
		
		WebElement saveButton = driver.findElement(By.xpath("//div[@class='pbHeader']//input[@name='save']"));
		saveButton.click();
		
		System.out.println("Contacts page opened with new view name");
		
		
		Thread.sleep(2000);

	}

}
