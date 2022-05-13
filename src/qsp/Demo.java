package qsp;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Demo {

	public static void main(String[] args) throws InterruptedException {
	 //         System.setProperty("webdriver.gecko.driver","F:\\KCSM\\Automation\\Drivers\\geckodriver.exe");
	   //       new FirefoxDriver();
	System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.Google.com");
	//	System.out.println(driver.getCurrentUrl());
	//	System.out.println(driver.getTitle());
		
	//	String actualTitle= driver.getTitle();
	//	String expectedTitle="Google";
	//	if(actualTitle.equals(expectedTitle))
	//	{
	//		System.out.println("google page is displayed, pass");
	//	}
	//	else
	//	{
	//		System.out.println("google page is not displayed, fail");
	//	}
		driver.manage().window().maximize();
		Thread.sleep(3000);
		Dimension d=new Dimension(700,500);
		driver.manage().window().setSize(d);
		Thread.sleep(3000);
		Point p=new Point(600, 300);
		driver.manage().window().setPosition(p);
		driver.navigate().to("https://www.Facebook.com");
		
	}

}
