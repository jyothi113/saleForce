package salesForceTestCases;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ForgotPassword_4B_TC_04 {
	
	public static void main(String[] args){
		
		System.out.println("TC_04B Forgot Password");
		System.setProperty("webdriver.chrome.driver", "C:\\Jyothi\\drivers\\chromedriver.exe");
		
		WebDriver driver;
		driver=new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		
		WebElement userName = driver.findElement(By.xpath("//input[@id='username']"));
		userName.sendKeys("123");
		
		System.out.println("Wrong Username Entered");
		
		WebElement passWord =driver.findElement(By.xpath("//input[@id='password']"));
		passWord.sendKeys("22131");
		System.out.println("Wrong password Entered");
		
		WebElement loginButton = driver.findElement(By.xpath("//input[@id='Login']"));
		loginButton.click();
		
		
		System.out.println("Cliked Login");
		
		System.out.println("Error Message is displayed");
		
	}
}
