package new_package;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import javax.print.DocFlavor.STRING;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Window_handling {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lohith\\eclipse-workspace\\Seleniem_newproject\\Driver\\chromedriver.exe");
		WebDriver lohith = new ChromeDriver();
		lohith.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Robot l=new Robot();
		Actions k=new Actions(lohith);
		lohith.get("http://www.flipkart.com/");
		lohith.manage().window().maximize();
		lohith.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		String windowHandle = lohith.getWindowHandle();
		System.out.println(windowHandle);
		WebElement element = lohith.findElement(By.xpath("//div[text()='Electronics']"));
		k.contextClick(element).perform();
		l.keyPress(KeyEvent.VK_DOWN);
		l.keyRelease(KeyEvent.VK_DOWN);
		l.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(5000);
		lohith.switchTo().window(windowHandle);
		WebElement find = lohith.findElement(By.xpath("//div[text()='Furniture']"));
		k.contextClick(find).perform();
		l.keyPress(KeyEvent.VK_DOWN);
		l.keyRelease(KeyEvent.VK_DOWN);
		l.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(5000);
		lohith.switchTo().window(windowHandle);
		WebElement el = lohith.findElement(By.xpath("//div[text()='Mobiles']"));
		k.contextClick(el).perform();
		l.keyPress(KeyEvent.VK_DOWN);
		l.keyRelease(KeyEvent.VK_DOWN);
		l.keyPress(KeyEvent.VK_ENTER);
		Set<String> set = lohith.getWindowHandles();
		System.out.println(set);
		Iterator<String> kl=set .iterator();
		while (kl.hasNext()) {
			String next = kl.next();
			if (!windowHandle.equals(next)) {
				String title = lohith.switchTo().window(next).getTitle();
				System.out.println(title);
				Thread.sleep(4000);
				lohith.close();
			}
			
		}
		
		
			
		
		
		
		
	
	
	
	
	
	}

}
