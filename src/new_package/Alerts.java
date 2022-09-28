package new_package;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {
	public static void main(String[] args){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lohith\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver lohith= new ChromeDriver();
		
		lohith.get("https://letcode.in/alert");
		WebElement element = lohith.findElement(By.id("accept"));
		//element.click();
		String value = element.getCssValue("background-color");
		System.out.println(value);
		
		Alert a = lohith.switchTo().alert();
		System.out.println(a.getText());
		a.accept();
		
	
		lohith.findElement(By.id("confirm")).click();
		Alert w = lohith.switchTo().alert();
        System.out.println(w.getText());
        w.dismiss();
       // lohith.findElement(By.)
        
        lohith.findElement(By.id("prompt")).click();
        Alert z = lohith.switchTo().alert();
        z.sendKeys("hi i'm Lohith");
        System.out.println(z.getText());
        z.accept();
        
        
        
        
}
}