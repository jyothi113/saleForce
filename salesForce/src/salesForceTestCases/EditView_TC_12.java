package salesForceTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditView_TC_12 {
	public static void main(String[] args) throws InterruptedException{
		System.out.println("Edit View ");
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
		
		WebElement View =driver.findElement(By.xpath("//select[@id='fcf']"));
		Select Viewdropdown = new Select(View);
		Viewdropdown.selectByVisibleText("joe");
		
		Thread.sleep(2000);
		WebElement viewEdit =driver.findElement(By.xpath("//a[contains(text(),'Edit')]"));
		viewEdit.click();
		
		WebElement NewViewName =driver.findElement(By.xpath("//input[@id='fname']"));
		NewViewName.sendKeys("Joee");
		
		
		WebElement fieldFilter =driver.findElement(By.xpath("//select[@id='fcol1']"));
		Select Fielddropdown = new Select(fieldFilter);
		Fielddropdown.selectByVisibleText("Account Name");
		
		Thread.sleep(2000);
		
		WebElement OperatorFilter =driver.findElement(By.xpath("//select[@id='fop1']"));
		Select Operatordropdown = new Select(OperatorFilter);
		Operatordropdown.selectByVisibleText("contains");
		
		WebElement ValueFilter =driver.findElement(By.xpath("//input[@id='fval1']"));
		ValueFilter.sendKeys("a");
		
		Thread.sleep(3000);
		
		WebElement LastActivity =driver.findElement(By.xpath("//select[@id='colselector_select_0']//option[contains(text(),'Last Activity')]"));
		LastActivity.click();
		
		Thread.sleep(2000);
		
		WebElement AddButton =driver.findElement(By.xpath("//img[@class='rightArrowIcon']"));
		AddButton.click();
		
		WebElement SaveButton =driver.findElement(By.xpath("//img[@class='rightArrowIcon']"));
		SaveButton.click();
		
	}
}
