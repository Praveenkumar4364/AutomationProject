package section2;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Gmail_Assignment {
public static void main(String[] args) throws Exception {
	ChromeOptions option=new ChromeOptions();
	option.addArguments("--remote-allow-origins=*");
	ChromeDriver driver=new ChromeDriver(option);
	driver.get("https://accounts.google.com/v3/signin/identifier?dsh=S-1559301819%3A1689489019139191&hl=en-GB&ifkv=AeDOFXj77pu41-iOjjTL4Ob3xdQ4oe_sfynpvdu72yS0H0y_cLJ8ZGf_dQshG2eVw26PsjZ9ZIUz&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.findElement(By.xpath("(//input[@class='whsOnd zHQkBf'])[1]")).sendKeys("praveensakinala98@gmail.com");
	driver.findElement(By.xpath("//span[text()='Next']")).click();
	driver.findElement(By.xpath("//input[@name='Passwd']")).sendKeys("9381112093",Keys.ENTER);
	//driver.findElement(By.xpath("//div[@class='gb_g']")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("//div[@class='o83JEf']/div[1]/ul/li[7]")).click();
	//driver.findElement(By.xpath("(//span[@class='VfPpkd-vQzf8d'])[2]")).click();
	/*
	driver.findElement(By.xpath("//a[@class='action-button']")).click();
	String pid=driver.getWindowHandle();
	Set<String> cid=driver.getWindowHandles();
	Thread.sleep(4000);
	for(String all:cid)
	{
		if(!pid.equals(cid))
		{
			driver.switchTo().window(all);
		}
	}
	driver.findElement(By.xpath("(//div[@class='i9lrp mIZh1c'])[1]")).sendKeys("praveensakinala98@gmail.com");
	*/
}
}
