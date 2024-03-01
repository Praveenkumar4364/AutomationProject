package section2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Practice_Mouseactions {
public static void main(String[] args) {
	ChromeOptions option=new ChromeOptions();
	option.addArguments("--remote-allow-origins=*");
	ChromeDriver driver=new ChromeDriver(option);
	driver.get("https://www.flipkart.com/");
	try {
		driver.findElement(By.xpath("//button[text()='✕']")).click();
	} catch (Exception e) {
		System.out.println("Exception Handle");
	}
	WebElement element=driver.findElement(By.xpath("//input[@class='_3704LK']"));
	element.sendKeys("i phone11");
	element.submit();
	WebElement element1=driver.findElement(By.xpath("(//div[@class='CXW8mj'])[3]"));
	Actions act=new Actions(driver);
	act.contextClick(element1).perform();
}
}
