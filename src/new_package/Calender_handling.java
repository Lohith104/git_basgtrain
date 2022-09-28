package new_package;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender_handling {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lohith\\eclipse-workspace\\Seleniem_newproject\\Driver\\chromedriver.exe");
		WebDriver l=new ChromeDriver();
		l.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		l.get("https://letcode.in/calendar");
		String month="July ";
		String year="2020";
		String date="09";
		while (true) {
			String monthdate = l.findElement(By.xpath("(//div[@class='datepicker-nav-month-year'])[1]")).getText();
		String[] md = monthdate.split(" ");
		String mon=md[0];
		String yer=md[2];
		System.out.println(mon);
		System.out.println(yer);
		//System.out.println(yer);
		if (mon.equalsIgnoreCase(month)&& yer.equals(year) )
			break;
		else 
l.findElement(By.xpath("//button[@type='button']")).click();
		
		
		}
		
		
		
		
		
		
		
	}		
}
