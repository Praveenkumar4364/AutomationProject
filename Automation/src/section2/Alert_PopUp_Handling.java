
package section2;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Alert_PopUp_Handling {
public static void main(String[] args) {
	ChromeOptions option=new ChromeOptions();
	option.addArguments("--remote-allow-origins=*");
	System.setProperty("webdriver.chrome.driver","D:\\Selenium Folder\\chromedriver.exe");
	ChromeDriver driver=new ChromeDriver(option);
	driver.get("https://demo.actitime.com/login.do");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin",Keys.TAB,"manager",Keys.ENTER);
	driver.findElement(By.xpath("(//div[@class='menu_icon'])[2]")).click();
	driver.findElement(By.xpath("//a[text()='Types of Work']")).click();
	driver.findElement(By.xpath("//span[text()='Create Type of Work']")).click();
	driver.findElement(By.xpath("//input[@name='name']")).sendKeys("Praveen");
	driver.findElement(By.xpath("//input[@value='      Cancel      ']")).click();
	Alert alt=driver.switchTo().alert();
	String msg=alt.getText();
	System.out.println(msg);
	//alt.accept();
	alt.dismiss();
}
}
