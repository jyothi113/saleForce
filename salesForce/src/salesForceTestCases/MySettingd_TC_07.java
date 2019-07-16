package salesForceTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MySettingd_TC_07 {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("My Settings");
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
		Thread.sleep(3000);
		WebElement UserMenuDropdown = driver.findElement(By.xpath("//span[@id='userNavLabel']"));
		UserMenuDropdown.click();
		WebElement MySettings = driver.findElement(By.xpath("//a[contains(text(),'My Settings')]"));
		MySettings.click();	
		Thread.sleep(2000);
		//WebElement criticalupdatespopup = driver.findElement(By.xpath("//a[@id='cruc_notifyX']"));
		//criticalupdatespopup.click();
		
		WebElement Personallink = driver.findElement(By.xpath("//div[@id='PersonalInfo']//a[@class='header setupFolder']"));
		Personallink.click();
		
		WebElement LoginHistory = driver.findElement(By.xpath("//span[@id='LoginHistory_font']"));
		LoginHistory.click();

		WebElement DownloadLoginHistory = driver.findElement(By.xpath("//a[contains(text(),'Download login history for last six months, includ')]"));
		DownloadLoginHistory.click();
		
		WebElement DisplayLayout = driver.findElement(By.xpath("//span[@id='DisplayAndLayout_font']"));
		DisplayLayout.click();
		
		WebElement CustomizeMyTabs = driver.findElement(By.xpath("//span[@id='CustomizeTabs_font']"));
		CustomizeMyTabs.click();
		
	//	WebElement salesforceChatter = driver.findElement(By.xpath("//select[@id='duel_select_0']//option[contains(text(),'Chatter')]"));
		//salesforceChatter.click();
		
		WebElement CustomApp = driver.findElement(By.id("p4"));
		
		Select CustomAppDropdown =new Select(CustomApp);
		CustomAppDropdown.selectByVisibleText("Salesforce Chatter");
		System.out.println("selected CustomApp");
		
		WebElement reports = driver.findElement(By.xpath("//option[contains(text(),'Reports')]"));
		reports.click();
		
		WebElement AddButton = driver.findElement(By.xpath("//img[@class='rightArrowIcon']"));
		
		AddButton.click();
		
		WebElement Email = driver.findElement(By.xpath("//div[@id='EmailSetup']//a[@class='header setupFolder']"));
		Email.click();
		
		WebElement MyEmailSettings = driver.findElement(By.xpath("//a[@id='EmailSettings_font']"));
		MyEmailSettings.click();
		
		WebElement salesForceradiobutton = driver.findElement(By.xpath("//input[@id='use_external_email1']"));
		salesForceradiobutton.click();
		
		WebElement EmailName = driver.findElement(By.xpath("//input[@id='sender_name']"));
		EmailName.clear();
		EmailName.sendKeys("Jyothi");
		
		WebElement EmailAddress = driver.findElement(By.xpath("//input[@id='sender_email']"));
		EmailAddress.clear();
		EmailAddress.sendKeys("jyothipraveena194@gmail.com");
		
		WebElement AutomaticBCCradiobutton = driver.findElement(By.xpath("//input[@id='auto_bcc1']"));
		AutomaticBCCradiobutton.click();
		
		WebElement Savebutton = driver.findElement(By.xpath("//input[@name='save']"));
		Savebutton.click();
		
		WebElement calendersandReminders = driver.findElement(By.xpath("//span[@id='CalendarAndReminders_font']"));
		calendersandReminders.click();
		
		WebElement Reminderslink = driver.findElement(By.xpath("//span[@id='Reminders_font']"));
		Reminderslink.click();
		
		
		WebElement RemindersButton = driver.findElement(By.xpath("//input[@id='testbtn']"));
		RemindersButton.click();
		
		Thread.sleep(5000);
		driver.quit();
		
		
	}

}
