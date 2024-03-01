
/*access flipkart
 * close the login popup
 * search for iphone11
 * slide the price button from left to right and right to left*/
package section2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Drag_And_Drop_By_Slider_Handling {
 public static void main(String[] args) throws Exception {
	ChromeOptions option=new ChromeOptions();
	option.addArguments("--remote-allow-origins=*");
	ChromeDriver driver=new ChromeDriver(option);
	driver.get("https://www.flipkart.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	try {
		driver.findElement(By.xpath("//button[text()='✕']")).click();
	} catch (Exception e) {
		System.out.println("Exception Handle");
	}
	WebElement element=driver.findElement(By.xpath("//input[@class='_3704LK']"));
	element.sendKeys("I phone 11");
	element.submit();
	WebElement right=driver.findElement(By.xpath("(//div[@class='_3FdLqY'])[2]"));
	WebElement left=driver.findElement(By.xpath("(//div[@class='_3FdLqY'])[1]"));
	Actions act=new Actions(driver);
	act.dragAndDropBy(right, -30, 0).perform();
	Thread.sleep(3000);
	act.dragAndDropBy(left, 30, 0).perform();
}
}
