package new_package;

import java.util.concurrent.TimeUnit;
//IMPLICIT WAIT
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Wiats_types {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lohith\\eclipse-workspace\\Seleniem_newproject\\Driver\\chromedriver.exe");
		WebDriver l=new ChromeDriver();
		
		l.get("https://www.Instagram.com");
		l.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		l.findElement(By.xpath("//input[@name='username']")).sendKeys("kmlohith4@gmail.com");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
