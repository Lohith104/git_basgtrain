package new_package;

import java.awt.Window;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascript_executor {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lohith\\eclipse-workspace\\Seleniem_newproject\\Driver\\chromedriver.exe");
		WebDriver l=new ChromeDriver();
		
		l.get("https://www.amazon.in");
		
    l.findElement(By.xpath("//input[@type='text' and @dir='auto']")).sendKeys("Mobiles");
    l.findElement(By.xpath("//input[@type='submit']")).click();
		
     JavascriptExecutor js=(JavascriptExecutor)l;
     js.executeScript("window.scrollBy(0,5000)");//random page down

     Thread.sleep(3000);
     js.executeScript("window.scrollBy(0,-1000)");//random page up	
      WebElement z = l.findElement(By.xpath("//span[text()='JioPhone Next 32 GB ROM, 2 GB RAM, Blue Smartphone']"));
      js.executeScript("arguments[0].scrollIntoView();", z)	;	
      z.click();
      
      Thread.sleep(5000);
                                      //to scroll directly to page top
      js.executeScript("window.scrollTo(0,document.body.ScrollHeight)");
      Thread.sleep(7000);
	l.manage().window().maximize();}

}
