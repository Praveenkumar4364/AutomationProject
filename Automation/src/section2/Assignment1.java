

/*
 * Assignment

access google 
search for viratkohli  
fetch all the suggestions*/
package section2;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Assignment1 {
public static void main(String[] args) throws Exception {
	ChromeOptions option=new ChromeOptions();
	option.addArguments("--remote-allow-origins=*");
	ChromeDriver driver=new ChromeDriver(option);
	driver.get("https://www.google.com/");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys("viratkohli");
	List<WebElement> element=driver.findElements(By.xpath("//div[@class='UUbT9']"));
	Thread.sleep(3000);
	/*
	int i=1;
	for(WebElement all:element)
	{
		String s=all.getText();
		System.out.println(i+"<>"+s);
		i++;
	}
	*/
	int i=1;
	Iterator<WebElement> itr=element.iterator();
	while(itr.hasNext())
	{
		String s=itr.next().getText();
		System.out.println(i+"<>"+s);
		i++;
	}
}
}
