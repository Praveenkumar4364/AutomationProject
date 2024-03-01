package section1;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Launching_FireFox {
public static void main(String[] args) {
	FirefoxDriver driver=new FirefoxDriver();
	driver.get("https://demo.actitime.com/login.do");
	String title=driver.getTitle();
	String url=driver.getCurrentUrl();
	String source=driver.getPageSource();
	System.out.println(url);
	System.out.println(title);
	System.out.println(source);
}
}
