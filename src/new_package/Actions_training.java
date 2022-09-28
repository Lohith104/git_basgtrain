package new_package;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_training {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lohith\\eclipse-workspace\\Seleniem_newproject\\Driver\\chromedriver.exe");
		WebDriver l=new ChromeDriver();
		l.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		l.get("https://www.flipkart.com");
		l.findElement(By.xpath("//button[.='✕']")).click();
l.findElement(By.linkText("Appliances")).click();
     
     WebElement e = l.findElement(By.xpath("//span[.='TVs & Appliances']"));
     Actions act=new Actions(l);
     act.moveToElement(e).perform();
     l.findElement(By.xpath("//a[@title='Mi']")).click();
	}
}
