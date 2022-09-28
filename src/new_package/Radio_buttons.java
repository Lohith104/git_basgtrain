package new_package;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radio_buttons {
	public static void main(String[] args){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lohith\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver lohith= new ChromeDriver();
		lohith.get("https://letcode.in/radio");
		
		lohith.findElement(By.name("answer")).click();
		lohith.findElement(By.id("one")).click();
		WebElement element = lohith.findElement(By.id("nobug"));
		String attribute = element.getAttribute("id");
		element.click();
		System.out.println(attribute);
		
		
		WebElement w = lohith.findElement(By.name("foobar"));
		w.click();
		boolean b = w.isEnabled();
		System.out.println(b);
		
		String string = lohith.findElement(By.name("plan")).getAttribute("disabled");	
		System.out.println(string);
		
		boolean selected = lohith.findElement(By.xpath("(//input[@type='checkbox'])[1]")).isSelected();
		
		System.out.println(selected);
		
		JavascriptExecutor js=(JavascriptExecutor)lohith;
		js.executeScript("window.scrollBy(0,300)");
		
		lohith.findElement(By.xpath("(//input[@type='checkbox'])[2]")).click();
		
		
		
		
}
}