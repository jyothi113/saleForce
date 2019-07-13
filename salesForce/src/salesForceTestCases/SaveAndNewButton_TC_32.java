package salesForceTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SaveAndNewButton_TC_32 {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Check Save And NewButton works in Contact page");
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
		WebElement Homepage = driver.findElement(By.xpath("//a[contains(text(),'Home')]"));
		Homepage.click();
		
		
		WebElement ContactTab = driver.findElement(By.xpath("//a[contains(text(),'Contacts')]"));
		ContactTab.click();
		
		WebElement NewButton = driver.findElement(By.xpath("//input[@name='new']"));
		NewButton.click();
		WebElement LastName = driver.findElement(By.xpath("//input[@id='name_lastcon2']"));
		LastName.sendKeys("Indian");
		
		WebElement AccountName = driver.findElement(By.xpath("//input[@id='con4']"));
		AccountName.sendKeys("Global Media");
		WebElement SaveandNewButton = driver.findElement(By.xpath("//td[@id='topButtonRow']//input[@name='save_new']"));
		SaveandNewButton.click();
		System.out.println("New contact page is displayed in Edit Contact");
	}

}
