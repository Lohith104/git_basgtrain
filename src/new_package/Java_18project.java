package new_package;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Java_18project {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lohith\\eclipse-workspace\\Seleniem_newproject\\Driver\\chromedriver.exe");
		WebDriver l=new ChromeDriver();
		
		l.get("https://www.amazon.in");
		l.manage().window().maximize();
		//String source = l.getPageSource();
	//	System.out.println(source);
		l.findElement(By.name("field-keywords")).sendKeys("mobile phones");
		l.findElement(By.xpath("//input[contains(@id,'nav-search')]")).click();
		l.findElement(By.xpath("//span[text()='Samsung']")).click();
		
		Thread.sleep(5000);
		TakesScreenshot r=(TakesScreenshot)l;
		File src=r.getScreenshotAs(OutputType.FILE);
		File des=new File("C:\\Users\\Lohith\\eclipse-workspace\\Selenium\\ScreenShot//lohith.png");
		FileHandler.copy(src, des);
		l.close();
	
}}