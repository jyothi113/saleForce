package salesForceTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BlockingEventWeekly_TC_37 {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Blocking Event Weekly");
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
		
		WebElement FourPMLink = driver.findElement(By.xpath("//a[contains(text(),'4:00 PM')]"));
		FourPMLink.click();
		System.out.println("New Event page is displayed with cursor at subject field");
		WebElement SubjectComboIcon = driver.findElement(By.xpath("//img[@class='comboboxIcon']"));
		SubjectComboIcon.click();
		Thread.sleep(4000);
	
		
		//Stopped Working here
		//WebElement EndTimeField = driver.findElement(By.xpath("//input[@id='EndDateTime_time']"));
	//	Thread.sleep(4000);
		//Select EndTimeDropdown =new Select(EndTimeField);
		//EndTimeDropdown.selectByVisibleText("7:00 PM");
	//	Thread.sleep(2000);
		
		
		WebElement SevenPMDropDown = driver.findElement(By.xpath("//input[@id='EndDateTime_time']"));
		SevenPMDropDown.click();
		System.out.println("Selected 7:00PM  in drop down");
		WebElement RecurranceCheckBox = driver.findElement(By.xpath("//input[@id='IsRecurrence']"));
		RecurranceCheckBox.click();
		Thread.sleep(2000);
		WebElement WeeklyRadioButton = driver.findElement(By.xpath("//input[@id='rectypeftw']"));
		WeeklyRadioButton.click();
		Thread.sleep(2000);
		WebElement EndDate = driver.findElement(By.xpath("//input[@id='RecurrenceEndDateOnly']"));
		EndDate.click();
		
		WebElement TwoWeeksEndDate = driver.findElement(By.xpath("//td[contains(text(),'26')]"));
		TwoWeeksEndDate.click();
		Thread.sleep(2000);
		WebElement SaveButton = driver.findElement(By.xpath("//td[@id='bottomButtonRow']//input[@name='save']"));
		SaveButton.click();
		Thread.sleep(2000);
		WebElement MonthViewIcon = driver.findElement(By.xpath("//img[@class='monthViewIcon']"));
		MonthViewIcon.click();
		
	}

}
