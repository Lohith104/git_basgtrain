package new_package;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lohith\\eclipse-workspace\\Seleniem_newproject\\Driver\\chromedriver.exe");
		
		WebDriver j=new ChromeDriver();
		
		j.get("http://www.Flipkart.com");
		
		//j.manage().window().maximize();
		j.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		j.findElement(By.xpath("//input[@type='text']")).sendKeys("Mobile phones");
		j.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(5000);
		j.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("Samsung");
		j.findElement(By.xpath("(//div[@class='_24_Dny'])[1]")).click();
		Thread.sleep(3000);
	    j.findElement(By.xpath("(//input[@type='text'])[2]")).clear();
		Thread.sleep(4000);
		j.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("APPLE");
		Thread.sleep(5000);
		j.findElement(By.xpath("//div[text()='APPLE']//parent::label[@class='_2iDkf8 t0pPfW']")).click();
		Thread.sleep(4000);
		j.findElement(By.xpath("(//div[contains(text(),'SAMSUNG Galaxy F13')])[3]")).click();
	    j.manage().window().maximize();
	    j.findElement(By.xpath("(//span[text()='Become a Seller'])[1]")).click();
		
		
	}

}
