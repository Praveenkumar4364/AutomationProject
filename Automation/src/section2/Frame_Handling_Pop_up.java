
/* access selenium.dev
 * click on frame
 * click on first package from packages
 * click on alert
 * fetch the alert message*/
package section2;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
public class Frame_Handling_Pop_up {
public static void main(String[] args) {
	ChromeOptions option=new ChromeOptions();
	option.addArguments("--remote-allow-origins=*");
	ChromeDriver driver=new ChromeDriver(option);
	driver.get("https://www.selenium.dev/selenium/docs/api/java/overview-summary.html");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.manage().window().maximize();
	driver.findElement(By.xpath("(//a[text()='Frames'])[1]")).click();
	driver.switchTo().frame(0);
	driver.findElement(By.xpath("(//a[text()='org.openqa.selenium'])[1]")).click();
	driver.switchTo().defaultContent();
	driver.switchTo().frame(1);
	driver.findElement(By.xpath("//span[text()='Alert']")).click();
	driver.switchTo().defaultContent();
	driver.switchTo().frame(2);
	String text=driver.findElement(By.xpath("(//li[@class='blockList'])[1]")).getText();
	System.out.println(text);
	driver.close();
}
}
