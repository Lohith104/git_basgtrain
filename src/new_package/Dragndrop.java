package new_package;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Dragndrop {
	public static void main(String[] args) {
		
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lohith\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	WebDriver lohith= new ChromeDriver();
	
	lohith.get("https://letcode.in/dropable");
	JavascriptExecutor js=(JavascriptExecutor)lohith;
	js.executeScript("window.scrollBy(0,300)");
	WebElement element = lohith.findElement(By.id("draggable"));
	WebElement element2 = lohith.findElement(By.id("droppable"));
Actions n=new Actions(lohith);
n.dragAndDrop(element, element2).perform();
}
}