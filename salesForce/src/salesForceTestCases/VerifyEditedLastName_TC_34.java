package salesForceTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyEditedLastName_TC_34 {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Verify edited last name is updated");
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
		
		WebElement HomeTab = driver.findElement(By.xpath("//a[contains(text(),'Home')]"));
		HomeTab.click();
		
		WebElement Namelink = driver.findElement(By.xpath("//h1[@class='currentStatusUserName']//a[contains(text(),'Jyothi T')]"));
		Namelink.click();
		
		WebElement EditProfile = driver.findElement(By.xpath("//a[@class='contactInfoLaunch editLink']//img"));
		EditProfile.click();
		
		WebElement AboutTab = driver.findElement(By.xpath("//a[contains(text(),'About')]"));
		AboutTab.click();
		
		WebElement FirstName = driver.findElement(By.xpath("//input[@id='firstName']"));
		FirstName.click();
		
		WebElement LastName = driver.findElement(By.xpath("//input[@id='lastName']"));
		LastName.sendKeys("ABCD");
		
		WebElement SAveAll = driver.findElement(By.xpath("//input[@class='zen-btn zen-primaryBtn zen-pas']"));
		SAveAll.click();
	}

}
