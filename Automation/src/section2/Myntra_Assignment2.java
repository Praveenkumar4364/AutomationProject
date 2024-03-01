/*access myntra 
 * search for shoes
 * perform scrolldown operation up to a particular webelement*/
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

public class Myntra_Assignment2 {
public static void main(String[] args) throws Exception {
	ChromeOptions option=new ChromeOptions();
	option.addArguments("--remote-allow-origins=*");
	WebDriver driver=new ChromeDriver(option);
	driver.get("https://www.myntra.com/");
	Thread.sleep(3000);
	WebElement element=driver.findElement(By.xpath("//input[@class='desktop-searchBar']"));
	element.sendKeys("shoes");
	driver.findElement(By.xpath("//a[@class='desktop-submit']")).click();
	/*
	 * with the help of javascript
	JavascriptExecutor jse=(JavascriptExecutor)driver;
	jse.executeScript("window.scrollBy(0,3000);");
	Thread.sleep(3000);
	jse.executeScript("window.scrollBy(0,3000);");
	Thread.sleep(3000);
	jse.executeScript("window.scrollBy(0,-3000);");
	Thread.sleep(3000);
	jse.executeScript("window.scrollBy(0,-3000);");
	*/
	/*with the help of actions class
	WebElement element1=driver.findElement(By.xpath("(//h3[@class=\"product-brand\"])[17]"));
	Actions act=new Actions(driver);
	act.scrollToElement(element1).perform();
	Thread.sleep(3000);
	WebElement element2=driver.findElement(By.xpath("(//h3[@class=\"product-brand\"])[1]"));
	act.scrollToElement(element2).perform();
	*/
	Robot r=new Robot();
	r.keyPress(KeyEvent.VK_PAGE_DOWN);
	r.keyRelease(KeyEvent.VK_PAGE_DOWN);
	Thread.sleep(3000);
	r.keyPress(KeyEvent.VK_PAGE_DOWN);
	r.keyRelease(KeyEvent.VK_PAGE_DOWN);
	Thread.sleep(3000);
	r.keyPress(KeyEvent.VK_PAGE_DOWN);
	r.keyRelease(KeyEvent.VK_PAGE_DOWN);
	
	Thread.sleep(3000);
	r.keyPress(KeyEvent.VK_PAGE_UP);
	r.keyRelease(KeyEvent.VK_PAGE_UP);
	Thread.sleep(3000);
	r.keyPress(KeyEvent.VK_PAGE_UP);
	r.keyRelease(KeyEvent.VK_PAGE_UP);
	Thread.sleep(3000);
	r.keyPress(KeyEvent.VK_PAGE_UP);
	r.keyRelease(KeyEvent.VK_PAGE_UP);
}
}
