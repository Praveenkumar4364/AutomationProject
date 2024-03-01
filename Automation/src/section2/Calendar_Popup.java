
/*
access jqueryui.com
select the calendar and select a date
*/
package section2;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Calendar_Popup {
public static void main(String[] args) {
	Calendar cal=Calendar.getInstance();
	cal.add(Calendar.DAY_OF_MONTH,300);
	//System.out.println(cal);
	Date d=cal.getTime();
	//System.out.println(cal.getTime());
	System.out.println(d);
	SimpleDateFormat sdf=new SimpleDateFormat("MM/dd/YYYY");
	String s=sdf.format(d);
	System.out.println(s);
	ChromeOptions option=new ChromeOptions();
	option.addArguments("--remote-allow-origins=*");
	ChromeDriver driver=new ChromeDriver(option);
	driver.get("https://jqueryui.com/resources/demos/datepicker/default.html");
	driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys(s);
}
}
