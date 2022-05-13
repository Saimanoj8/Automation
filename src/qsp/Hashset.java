package qsp;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Hashset {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\KCSM\\selenium\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("C:\\Users\\bharath reddy\\Desktop\\Automation\\paradise.html");
		WebElement hash=driver.findElement(By.name("paradise"));
		Select sel=new Select(hash);
		List<WebElement>allops=sel.getOptions();
		   System.out.println(allops.size());
		   for(int i=0;i<=allops.size()-1;i++)
		   {
			   String text=allops.get(i).getText();
			   System.out.println(text);
		   }
		   for(WebElement oneoption:allops)
		   {
			   String text=oneoption.getText();
			   System.out.println(text);
		   }
		   Set<String>s=new HashSet<String>();
		   for(WebElement oneoption:allops)
		   {
			   String text=oneoption.getText();
			   s.add(text);
		   }
		   for(String oneText:s)
		   {
			   System.out.println(oneText);
		   }
		   Set<String> a=new LinkedHashSet<String>();
		   for(WebElement oneoption:allops)
		   {
			   String text=oneoption.getText();
			   a.add(text);
		   }
		   for(String onetext:a)
		   {
			   System.out.println(onetext);
		   }
			  Set<String> m=new TreeSet<String>();
			  for(WebElement oneoption:allops)
			  {
				  String text=oneoption.getText();
				  m.add(text);
			  }
			  for(String onetext:m)
			  {
				  System.out.println(onetext);
			  }
				
			  
		   
		   
		   

	}

}
