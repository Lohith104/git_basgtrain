package new_package;

import java.awt.AWTException;
import java.awt.RenderingHints.Key;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Robot_keyactions {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lohith\\eclipse-workspace\\Seleniem_newproject\\Driver\\chromedriver.exe");
		WebDriver browser=new ChromeDriver();
		browser.manage().window().maximize();
		
		browser.get("http://www.greenstech.in/selenium-course-content.html");
     WebElement q = browser.findElement(By.xpath("(//h2[@class='mb-0'])[2]"));
		JavascriptExecutor j=(JavascriptExecutor)browser;
		j.executeScript("window.scrollBy(0,1200)");
     
     Actions a=new Actions(browser);
		a.click(q).perform();
		
		WebElement z = browser.findElement(By.xpath("//a[text()='Resume Model-4 ']"));
		a.contextClick(z).perform();
		Thread.sleep(4000);
		
		Robot n=new Robot();
		Thread.sleep(4000);
		n.keyPress(KeyEvent.VK_DOWN);
		n.keyRelease(KeyEvent.VK_DOWN);
		n.keyPress(KeyEvent.VK_DOWN);
		n.keyRelease(KeyEvent.VK_DOWN);
		n.keyPress(KeyEvent.VK_DOWN);
		n.keyRelease(KeyEvent.VK_DOWN);
		n.keyPress(KeyEvent.VK_DOWN);
		n.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(4000);
		n.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
		n.keyPress(KeyEvent.VK_DELETE);
		n.keyRelease(KeyEvent.VK_DELETE);
		
		n.keyPress(KeyEvent.VK_L);
		n.keyRelease(KeyEvent.VK_L);
		n.keyPress(KeyEvent.VK_O);
		n.keyRelease(KeyEvent.VK_O);
		n.keyPress(KeyEvent.VK_H);
		n.keyRelease(KeyEvent.VK_H);
		n.keyPress(KeyEvent.VK_I);
		n.keyRelease(KeyEvent.VK_I);
		n.keyPress(KeyEvent.VK_T);
		n.keyRelease(KeyEvent.VK_T);
		n.keyPress(KeyEvent.VK_H);
		n.keyRelease(KeyEvent.VK_H);
		n.keyPress(KeyEvent.VK_TAB);
		n.keyRelease(KeyEvent.VK_TAB);
		n.keyPress(KeyEvent.VK_TAB);
		n.keyRelease(KeyEvent.VK_TAB);
		n.keyPress(KeyEvent.VK_ENTER);
		n.keyRelease(KeyEvent.VK_ENTER);
		//n.keyRelease(KeyEvent.VK_L);
		
		
		
		
	}

}
