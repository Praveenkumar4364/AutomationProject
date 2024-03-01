package section2;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Scroll_Down_Handling {
public static void main(String[] args) throws Exception {
	ChromeOptions option=new ChromeOptions();
	option.addArguments("--remote-allow-origins=*");
	WebDriver driver=new ChromeDriver(option);
	driver.get("https://www.flipkart.com/");
	Thread.sleep(3000);
	try {
		driver.findElement(By.xpath("//button[text()='✕']")).click();
	} catch (Exception e) {
		System.out.println("Exception Handle");
	}
	WebElement element=driver.findElement(By.xpath("//input[@class='_3704LK']"));
	element.sendKeys("I phone 11");
	element.submit();
	Thread.sleep(3000);
	/*
	 * with the help of javascriptexecutor
	JavascriptExecutor jse=(JavascriptExecutor)driver;
	jse.executeScript("window.scrollBy(0,4000);");
	Thread.sleep(2000);
	jse.executeScript("window.scrollBy(0,4000);");
	Thread.sleep(2000);
	jse.executeScript("window.scrollBy(0,-4000);");
	Thread.sleep(2000);
	jse.executeScript("window.scrollBy(0,-4000);");
	*/
	/* with the help of robot class.
	Robot r=new Robot();
	r.keyPress(KeyEvent.VK_PAGE_DOWN);
	r.keyRelease(KeyEvent.VK_PAGE_DOWN);
	
	r.keyPress(KeyEvent.VK_PAGE_DOWN);
	r.keyRelease(KeyEvent.VK_PAGE_DOWN);
	
	r.keyPress(KeyEvent.VK_PAGE_DOWN);
	r.keyRelease(KeyEvent.VK_PAGE_DOWN);
	Thread.sleep(3000);
	r.keyPress(KeyEvent.VK_PAGE_UP);
	r.keyRelease(KeyEvent.VK_PAGE_UP);
	
	r.keyPress(KeyEvent.VK_PAGE_UP);
	r.keyRelease(KeyEvent.VK_PAGE_UP);
	
	r.keyPress(KeyEvent.VK_PAGE_UP);
	r.keyRelease(KeyEvent.VK_PAGE_UP);
	*/
	
	//with the help of actions class.
	Thread.sleep(3000);
	WebElement element1=driver.findElement(By.xpath("(//div[@class='_4rR01T'])[8]"));
	Actions act=new Actions(driver);
	act.scrollToElement(element1).perform();
	Thread.sleep(3000);
	WebElement element2=driver.findElement(By.xpath("(//div[@class='_4rR01T'])[1]"));
	act.scrollToElement(element2).perform();
}
}
