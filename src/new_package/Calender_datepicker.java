package new_package;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender_datepicker {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lohith\\eclipse-workspace\\Seleniem_newproject\\Driver\\chromedriver.exe");
		WebDriver l=new ChromeDriver();
		l.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		l.get("http://www.phptravels.net/");
		l.manage().window().maximize();
		
		l.findElement(By.id("checkin")).click();
		String month ="August 2023";	
		while (true) {
			String monthyear1 = l.findElement(By.xpath("(//th[@class='switch'])[1]")).getText();
			
			if (month.equalsIgnoreCase(monthyear1)){
				break;
			} else {
l.findElement(By.xpath("(//th[@class='next'])[1]")).click();
			}	
			}
		WebElement options=l.findElement(By.xpath("(//td[text()='9'])[1]"));
				options.click();
		
				String month1 ="August 2023";	
				while (true) {
					String monthy = l.findElement(By.xpath("(//th[@class='switch'])[2]")).getText();
					
					if (month1.equalsIgnoreCase(monthy)){
						Thread.sleep(5000);
						break;
					} else {
		l.findElement(By.xpath("(//th[@class='next'])[4]")).click();
					}	
					}
		
		
		
		
		
		
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}
}
