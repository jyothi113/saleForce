package salesForceTestCases;

import org.openqa.selenium.Alert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyProfile_TC_06 {
	public static void main(String[] args) throws InterruptedException{
		System.out.println("MyProfile");
		System.setProperty("webdriver.chrome.driver","C:\\Jyothi\\drivers\\chromedriver.exe");
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		Thread.sleep(2000);
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
	
		WebElement myProfileOption = driver.findElement(By.xpath("//a[contains(text(),'My Profile')]"));
		myProfileOption.click();
		System.out.println("User profile page is displayed");
		
		//WebElement editProfileButton = driver.findElement(By.xpath("//a[@class='contactInfoLaunch editLink']//img"));
		//editProfileButton.click();
		
		//WebElement editProfileWindow = driver.findElement(By.xpath("/html[1]/body[1]/iframe[1]"));
		////editProfileWindow.click();
		//Thread.sleep(6000);
		
		//driver.switchTo().frame(editProfileWindow);
		//WebElement editProfileAboutTab = driver.findElement(By.xpath("//a[contains(text(),'About')]"));
		//editProfileAboutTab.click();
		
		// AboutTabLastName = driver.findElement(By.xpath("//input[@id='lastName']"));
		//AboutTabLastName.sendKeys("Th");
		
		
		
		////div[@id='contactInfo']//div[contains(@class,'topLeft')]
		//WebElement editProfileAboutTabSaveAll = driver.findElement(By.xpath("//input[@class='zen-btn zen-primaryBtn zen-pas']"));
		//editProfileAboutTabSaveAll.click();
		
		//System.out.println("User profile page is displayed with changed Last name");
		
		WebElement editProfilePostLink = driver.findElement(By.xpath("//span[contains(@class,'publisherattachtext')][contains(text(),'Post')]"));
		editProfilePostLink.click();
		Thread.sleep(3000);
		
		editProfilePostLink.sendKeys("Hello");
		//Alert WindowsAlertlink =driver.switchTo().alert();
		
		
		WebElement editProfilePostShare = driver.findElement(By.xpath("//input[@id='publishersharebutton']"));
		editProfilePostShare.click();
		
		WebElement editProfileFileLink = driver.findElement(By.xpath("//span[contains(@class,'publisherattachtext')][contains(text(),'File')]"));
		editProfileFileLink.click();
		
		
		
	}	
}
