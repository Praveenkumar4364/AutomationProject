package section2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Gmail_Assingment3 {
public static void main(String[] args) throws Exception {
	ChromeOptions option=new ChromeOptions();
	option.addArguments("--remote-allow-origins=*");
	ChromeDriver driver=new ChromeDriver(option);
	driver.get("https://www.google.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("gmail",Keys.ENTER);
	driver.findElement(By.xpath("//h3[text()='Gmail - Google']")).click();
	driver.findElement(By.xpath("//a[text()='Sign in']")).click();
	driver.findElement(By.xpath("(//input[@class='whsOnd zHQkBf'])[1]")).sendKeys("praveensakinala98@gmail.com",Keys.ENTER);
	driver.findElement(By.xpath("//input[@name='Passwd']")).sendKeys("9381112093",Keys.ENTER);
	driver.findElement(By.xpath("//div[@class='T-I T-I-KE L3']")).click();
	Thread.sleep(6000);
	driver.findElement(By.xpath("//input[@class='agP aFw']")).sendKeys("vamshikrishna72001@gmail.com",Keys.TAB);
	driver.findElement(By.xpath("//input[@name='subjectbox']")).sendKeys("Greetings",Keys.TAB,"Hiii");
	driver.findElement(By.xpath("//div[@class='a1 aaA aMZ']")).click();
	//driver.findElement(By.xpath("//div[text()='Send']")).click();
}
}
