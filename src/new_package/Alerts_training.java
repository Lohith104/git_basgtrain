package new_package;



import java.io.File;
import java.nio.file.Files;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Alerts_training {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lohith\\eclipse-workspace\\Seleniem_newproject\\Driver\\chromedriver.exe");
		WebDriver l=new ChromeDriver();
		l.get("http://demo.automationtesting.in/Alerts.html");
		//simple Alert
		l.findElement(By.xpath("(//a[@class='analystic'])[1]")).click();
	l.findElement(By.xpath("//button[@onclick='alertbox()']")).click();
	    Alert e = l.switchTo().alert();
	    String r = e.getText();
	    System.out.println("simple alert = "+r);
	    e.accept();
	    //confrim alert
	    l.findElement(By.xpath("(//a[@data-toggle='tab'])[2]")).click();
	    l.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
	    Alert t = l.switchTo().alert();
	    System.out.println("confirmation alert = "+t.getText());
	    t.dismiss();
	    //prompt alert
	    l.findElement(By.xpath("//a[normalize-space()='Alert with Textbox']")).click();
	    Thread.sleep(3000);
        l.findElement(By.xpath("//button[@onclick='promptbox()']")).click();
        Alert y = l.switchTo().alert();
        y.sendKeys("Lohith");
        System.out.println(y.getText());
        y.accept();
        
        TakesScreenshot o= (TakesScreenshot)l;
        File src=o.getScreenshotAs(OutputType.FILE);
        File des=new File("C:\\Users\\Lohith\\eclipse-workspace\\Selenium\\ScreenShot//lohith4.png");
        FileHandler.copy(src, des);
        
        l.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
       
        l.findElement(By.xpath("(//a[@data-toggle='dropdown'])[2]")).click();
        
        
        
        
	    
	    
	    
	    
        
        
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
