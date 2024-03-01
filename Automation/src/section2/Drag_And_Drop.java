package section2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Drag_And_Drop {
public static void main(String[] args) throws Exception {
	ChromeOptions option=new ChromeOptions();
	option.addArguments("--remote-allow-origins=*");
	WebDriver driver=new ChromeDriver(option);
	driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
	Thread.sleep(3000);
	WebElement b1=driver.findElement(By.xpath("//div[@id='box1']"));
	WebElement b2=driver.findElement(By.xpath("//div[@id='box2']"));
	WebElement b3=driver.findElement(By.xpath("//div[@id='box3']"));
	WebElement b4=driver.findElement(By.xpath("//div[@id='box4']"));
	WebElement b5=driver.findElement(By.xpath("//div[@id='box5']"));
	WebElement b6=driver.findElement(By.xpath("//div[@id='box6']"));
	WebElement b7=driver.findElement(By.xpath("//div[@id='box7']"));
	WebElement B1=driver.findElement(By.xpath("//div[@id='box101']"));
	WebElement B2=driver.findElement(By.xpath("//div[@id='box102']"));
	WebElement B3=driver.findElement(By.xpath("//div[@id='box103']"));
	WebElement B4=driver.findElement(By.xpath("//div[@id='box104']"));
	WebElement B5=driver.findElement(By.xpath("//div[@id='box105']"));
	WebElement B6=driver.findElement(By.xpath("//div[@id='box106']"));
	WebElement B7=driver.findElement(By.xpath("//div[@id='box107']"));
	Actions act=new Actions(driver);
	act.dragAndDrop(b1, B1).perform();
	Thread.sleep(3000);
	act.dragAndDrop(b2, B2).perform();
	Thread.sleep(3000);
	act.dragAndDrop(b3, B3).perform();
	Thread.sleep(3000);
	act.dragAndDrop(b4, B4).perform();
	Thread.sleep(3000);
	act.dragAndDrop(b5, B5).perform();
	Thread.sleep(3000);
	act.dragAndDrop(b6, B6).perform();
	Thread.sleep(3000);
	act.dragAndDrop(b7, B7).perform();
}
}
