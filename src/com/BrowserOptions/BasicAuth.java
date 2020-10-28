
package com.BrowserOptions;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class BasicAuth {

	/*
	 * set specific screen size
	 * ex:Width=1000; Height:500
	 */

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\JAVA\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();

		//Get Size
		int Width=driver.manage().window().getSize().getWidth();
		int Height=driver.manage().window().getSize().getHeight();
		System.out.println("default Width:"+Width);
		System.out.println("default Height:"+Height);
		
		//Set Specific window Size
		driver.manage().window().setSize(new Dimension(1000,500));
		
		//driver.close();
	}

}
