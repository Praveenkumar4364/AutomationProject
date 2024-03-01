package section2;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Auto_Suggestion_Handling {
public static void main(String[] args) throws Exception {
	ChromeOptions option=new ChromeOptions();
	option.addArguments("--remote-allow-origins=*");
	ChromeDriver driver=new ChromeDriver(option);
	driver.get("https://www.flipkart.com/");
	//Thread.sleep(4000);

	try {
		driver.findElement(By.xpath("//button[text()='✕']")).click();
	} catch (Exception e) {
		System.out.println("exception handled");
	}
	Thread.sleep(4000);
	driver.findElement(By.xpath("//input[@name='q']")).sendKeys("iphone11");
	Thread.sleep(3000);
	List<WebElement> element=driver.findElements(By.xpath("//li[@class='Y5N33s']"));
	/*int i=1;
	Thread.sleep(4000);
	for(WebElement all:element)
	{
		String ap=all.getText();
		System.out.println(i+">"+ap);
		i++;
	}
	*/
	int i=1;
	Thread.sleep(3000);
	Iterator<WebElement> itr=element.iterator();
	while(itr.hasNext())
	{
		String all=itr.next().getText();
		System.out.println(i+"<>"+all);
		i++;
	}
	
}
}

