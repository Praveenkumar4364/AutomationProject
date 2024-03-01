/* access flipkart 
 * search iphone11
 * click on 1st product
 * fetch the product name
 * from the next window
 * close all the windows*/
package section2;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class GetWindowHandle_GetWindowHandles {
public static void main(String[] args) {
	ChromeOptions option=new ChromeOptions();
	option.addArguments("--remote-allow-origins=*");
	ChromeDriver driver=new ChromeDriver(option);
	driver.get("https://www.flipkart.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	try {
		driver.findElement(By.xpath("//button[text()='✕']")).click();
	} catch (Exception e) {
		System.out.println("Exception handle");
	}
	
	WebElement element=driver.findElement(By.xpath("//input[@class='_3704LK']"));
	element.sendKeys("iphone11");
	element.submit();
	driver.findElement(By.xpath("(//div[@class='_4rR01T'])[1]")).click();
	String pid=driver.getWindowHandle();
	Set<String> cid=driver.getWindowHandles();
	/*
	for(String s:cid)
	{
		if(!pid.equals(cid))
		{
			driver.switchTo().window(s);
		}
	}
	*/
	
	Iterator<String> itr=cid.iterator();
	while(itr.hasNext())
	{
		String all=itr.next();
		String allp=driver.switchTo().window(all).getTitle();
		if(pid.equals(allp))
		{
			break;
		}
	}
	String text=driver.findElement(By.xpath("//span[@class='B_NuCI']")).getText();
	System.out.println(text);
	driver.close();
}
}
