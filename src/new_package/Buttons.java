package new_package;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Buttons {
	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lohith\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver lohith= new ChromeDriver();
		
		lohith.get("https://letcode.in/buttons");
		lohith.findElement(By.id("home")).click();
		lohith.navigate().back();
		Point a = lohith.findElement(By.id("position")).getLocation();
		System.out.println(a);
		System.out.println("x="+a.getX()+ " "+"y="+a.getY());
		String cssValue = lohith.findElement(By.id("color")).getCssValue("background-color");
		System.out.println(cssValue);
		 Rectangle rect = lohith.findElement(By.id("property")).getRect();
		 Dimension size = rect.getDimension();
		
		System.out.println("height="+size.getHeight()+" "+ "widthsize="+size.getWidth());
		boolean b = lohith.findElement(By.id("isDisabled")).isEnabled();
		System.out.println(b);
		JavascriptExecutor js=(JavascriptExecutor)lohith;
		js.executeScript("window.scrollBy(0,300)");
		WebElement c = lohith.findElement(By.xpath("//h2[text()='Button Hold!']"));
		Actions k=new Actions(lohith);
		k.moveToElement(c).build().perform();
		k.clickAndHold(c).perform();
		
		//Robot v=new Robot();
		//c.mousePress(InputEvent.BUTTON2_DOWN_MASK);
	//	v.keyPress(KeyEvent.VK_ENTER);

		
		
		
		
		
		
		
		
		
}
}