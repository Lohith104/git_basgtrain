package new_package;

import java.io.File;
import java.nio.file.Files;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Youtube {
	public static void main(String[] args) throws Throwable  {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lohith\\eclipse-workspace\\Seleniem_newproject\\Driver\\chromedriver.exe");
		WebDriver j=new ChromeDriver();
		
		j.get("http://www.youtube.com");
		j.manage().window().maximize();
		j.findElement(By.xpath("(//yt-formatted-string[text()='Music'])[2]")).click();
		j.findElement(By.xpath("(//yt-formatted-string[@id='video-title'])[2]")).click();
		Thread.sleep(7000);
		j.findElement(By.xpath("//div[@class='ytp-ad-text ytp-ad-skip-button-text' and text()='Skip Ads']")).click();
		j.findElement(By.xpath("//video[@tabindex='-1' and @controlslist='nodownload']")).click();
		
		TakesScreenshot l=(TakesScreenshot)j;
		File src=l.getScreenshotAs(OutputType.FILE);
		File des=new File("C:\\Users\\Lohith\\eclipse-workspace\\Selenium\\ScreenShot//lohith2.png");
		
		FileHandler.copy(src, des);
	}

}
