package new_package;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Expliicit_wait {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Lohith\\eclipse-workspace\\Seleniem_newproject\\Driver\\chromedriver.exe");
		WebDriver l=new ChromeDriver();
		l.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebDriverWait h=new  WebDriverWait(l, 30);
		
		l.get("https://letcode.in");
		l.manage().window().maximize();
		l.findElement(By.xpath("//a[text()='Log in']")).click();
		
		l.findElement(By.xpath("(//input[@placeholder='Enter registered email'])[1]")).sendKeys("kmlohith4@gmail.com");
		l.findElement(By.xpath("//input[@placeholder='Enter password']")).sendKeys("Lohith@104");
	l.findElement(By.xpath("//button[text()='LOGIN']")).click();	
		
		
		WebElement q = l.findElement(By.xpath("//div[@role='alertdialog']"));
		 System.out.println(q.getText());
		 h.until(ExpectedConditions.invisibilityOf(q));
		l.findElement(By.xpath("//a[text()='Sign out']")).click();
		 WebElement b = l.findElement(By.xpath("//div[text()=' Bye! See you soon :) ']"));
		 System.out.println(b.getText());
		 l.close();
	   
	    
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
