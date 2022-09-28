package new_package;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table_webtable {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lohith\\eclipse-workspace\\Seleniem_newproject\\Driver\\chromedriver.exe");
		WebDriver lohith=new ChromeDriver();
		
		lohith.get("https://letcode.in/table");
		//lohith.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//lohith.manage().window().maximize();
		WebElement tab = lohith.findElement(By.xpath("//table[@name='listtable']"));
		System.out.println(tab.getText());
	
   WebElement element = lohith.findElement(By.xpath("(//table[@id='shopping'])//tr[3]//td[1]"));
   System.out.println(element.getText());
   
   WebElement element2 = lohith.findElement(By.xpath("//input[@id='first']"));
   JavascriptExecutor j=(JavascriptExecutor)lohith;
   j.executeScript("window.scrollBy(0,600)");
  // WebDriverWait l=new WebDriverWait(lohith, 30);
//  l.until(ExpectedConditions.visibilityOf(element2));
   element2.click();
   
   
	
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//lohith.close();

	}

}
