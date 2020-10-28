import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorDemo {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","D:\\JAVA\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.opencart.com/index.php?route=account/login");
		
		WebElement Email=driver.findElement(By.id("input-email"));
		
		WebElement Password=driver.findElement(By.name("password"));
		
		WebElement LoginBtn=driver.findElement(By.cssSelector("#content > div > div:nth-child(2) > div > form > input"));
		
		//Test Case for Valid Email and Password
		String ExpectedPostCondition="My Orders";
		Email.sendKeys("mail22@gmail.com");
		Password.sendKeys("123456");
		LoginBtn.click();
		
		String ActualText= driver.findElement(By.cssSelector("#content > h2:nth-child(3)")).getText();
		
		if(ExpectedPostCondition.equals(ActualText)) {
			System.out.println("Login Success. Test Passed");
		}
		else {
			System.out.println("Login Failed. Bug found");
		}
		//Test Case for invalid Email and Password
//		Email.sendKeys("mail22@mail.com");
//		Password.sendKeys("123456");
//		LoginBtn.click();
		
		
		
		
		
	}

}
