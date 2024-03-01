package section2;
import java.io.File;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import com.google.common.io.Files;
public class ScreenShot_Handling {
public static void main(String[] args) throws Exception {
	ChromeOptions option=new ChromeOptions();
	option.addArguments("--remote-allow-origins=*");
	System.setProperty("webdriver.chrome.driver","D:\\Selenium Folder\\chromedriver.exe");
	WebDriver driver=new ChromeDriver(option);
	driver.get("https://demo.actitime.com/login.do");
	/*Step1:-Downcast the Takesscreenshot interface*/
	TakesScreenshot ts=(TakesScreenshot)driver;
	/*Step2:-gestscreenshot method will help to capture the screenshot & O/P type is file
	 * so it stores in file class And OutputType is an Interface in the arguments*/
	File src=ts.getScreenshotAs(OutputType.FILE);
	/*File is a class we have to create an object of File class and constructor arguments
	 *  we have to give the String Screenshot path*/
	File dest=new File(".\\ScreenShot\\"+"img.png");
	/*Files is a class which is present in com.google.common.io 
	 * and we have use a method copy to copy the src to dest(image copy and paste in screenshotfolder)*/
	Files.copy(src, dest);
	driver.findElement(By.xpath("//input[@id='userna']")).sendKeys("admin");
}
}
