package new_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Single_dd {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lohith\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver  j=new ChromeDriver();
		
		j.get("https://demoqa.com/select-menu");
		j.manage().window().maximize();
		
		WebElement t = j.findElement(By.xpath("//select[@id='oldSelectMenu']"));
		Select k=new Select(t);
		
		k.selectByValue("5");
		Thread.sleep(3000);
		
		k.selectByIndex(3);
		Thread.sleep(2000);
		
		k.selectByVisibleText("Magenta");
		Thread.sleep(3000);
		
		j.close();
	}

}
