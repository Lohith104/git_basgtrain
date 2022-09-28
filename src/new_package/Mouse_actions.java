package new_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_actions {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lohith\\eclipse-workspace\\Seleniem_newproject\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		
		Actions act=new Actions(driver);
		
		WebElement q = driver.findElement(By.xpath("(//a[@class='button button-orange'])[2]"));
		WebElement w = driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
		act.dragAndDrop(q, w).perform();
		
		WebElement b = driver.findElement(By.xpath("(//a[@class='button button-orange'])[5]"));
		WebElement a = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		act.clickAndHold(b).moveToElement(a).click().perform();
		
		WebElement r = driver.findElement(By.xpath("(//a[@class='button button-orange'])[2]"));
		WebElement t = driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
		act.dragAndDrop(r, t).perform();
		
		WebElement s = driver.findElement(By.xpath("(//a[@class='button button-orange'])[6]"));
		WebElement d = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		act.clickAndHold(s).moveToElement(d).click().perform();
		
	
		
		
		
		
		
		driver.close();
	}

}
