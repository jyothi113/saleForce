package salesForceTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BlockingEvent_TC_36 {

public static void main(String[] args) throws InterruptedException {
		System.out.println("Blocking Event in the calender");
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
		
		WebElement CurrentDateLink = driver.findElement(By.xpath("//a[contains(text(),'Friday July 12, 2019')]"));
		CurrentDateLink.click();
		Thread.sleep(2000);
		
		WebElement EightPMLink = driver.findElement(By.xpath("//a[contains(text(),'8:00 PM')]"));
		EightPMLink.click();
		System.out.println("Cursor is at subject field");
		Thread.sleep(3000);
		
		WebElement SubjectComboIcon = driver.findElement(By.xpath("//img[@class='comboboxIcon']"));
		SubjectComboIcon.click();
		Thread.sleep(4000);
		//WebElement otherInPopUp = driver.findElement(By.xpath(""));
		//otherInPopUp.click();
		
	
		
		WebElement NinePMDropDown = driver.findElement(By.xpath("//input[@id='EndDateTime_time']"));
		NinePMDropDown.click();
		System.out.println("Selected 9:00PM  in drop down");
		WebElement SaveButton = driver.findElement(By.xpath("//td[@id='topButtonRow']//input[@name='save']"));
		SaveButton.click();
		
		System.out.println("saved");
	}

}
