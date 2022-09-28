package new_package;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Multi_select {
	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lohith\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver lohith= new ChromeDriver();
		
		lohith.get("https://letcode.in/selectable");
		lohith.manage().window().maximize();
		
		Actions act=new Actions(lohith);
		Robot rob=new Robot();
		WebElement element = lohith.findElement(By.xpath("//h3[text()='Selenium']"));
		
		act.click(element).perform();
		rob.keyPress(KeyEvent.VK_CONTROL);
		rob.keyPress(KeyEvent.VK_A);
		rob.keyRelease(KeyEvent.VK_A);
		rob.keyRelease(KeyEvent.VK_CONTROL);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
