package section2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Gmail_Assignment2 {
public static void main(String[] args) throws Exception {
	ChromeOptions option=new ChromeOptions();
	option.addArguments("--remote-allow-origins=*");
	ChromeDriver driver=new ChromeDriver(option);
	driver.get("https://mail.google.com/mail/u/0/#inbox");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.findElement(By.xpath("(//input[@class='whsOnd zHQkBf'])[1]")).sendKeys("praveensakinala98@gmail.com",Keys.ENTER);
	driver.findElement(By.xpath("//input[@name='Passwd']")).sendKeys("9381112093",Keys.ENTER);
	//driver.findElement(By.xpath("//span[text()='Not now']")).click();
	driver.findElement(By.xpath("//div[@class='T-I T-I-KE L3']")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("//input[@id=':jo']")).sendKeys("vamshikrishna72001@gmail.com");
	//Thread.sleep(4000);
	//driver.findElement(By.xpath("(//div[@class='aH9'])[2]")).sendKeys("vamshikrishna72001@gmail.com");
	//driver.findElement(By.xpath("//div[@class='aoD az6']")).sendKeys("Greetings");
}
}
