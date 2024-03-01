
/*Access flipkart
 * Close the login page
 * move the mouse cursor to grocery
 * right click on it*/
package section2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Actions_Handling {
public static void main(String[] args) throws Exception {
	ChromeOptions option=new ChromeOptions();
	option.addArguments("--remote-allow-origins=*");
	ChromeDriver driver=new ChromeDriver(option);
	driver.get("https://www.flipkart.com/");
	Thread.sleep(3000);
	try {
		driver.findElement(By.xpath("//button[text()='✕']")).click();
	} catch (Exception e) {
		System.out.println("Exception Handle");
	}
	
	Thread.sleep(3000);
	WebElement element=driver.findElement(By.xpath("//div[text()='Grocery']"));
	Actions act=new Actions(driver);
	act.moveToElement(element).contextClick().build().perform();
}
}
