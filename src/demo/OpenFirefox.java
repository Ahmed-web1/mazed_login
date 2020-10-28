package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class OpenFirefox {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","D:\\JAVA\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();

		driver.get("https://google.com");
	}

}

