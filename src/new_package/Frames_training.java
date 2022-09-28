package new_package;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames_training {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lohith\\eclipse-workspace\\Seleniem_newproject\\Driver\\chromedriver.exe");
		WebDriver l=new ChromeDriver();
		
		l.get("http://www.leafground.com/pages/frame.html");
		
		WebElement q = l.findElement(By.xpath("//iframe[@src='default.html']"));
		Dimension h= q.getSize();
		System.out.println(h);
		l.switchTo().frame(q);
		l.findElement(By.xpath("//button[@id='Click']")).click();
		
		l.switchTo().defaultContent();
		WebElement outer = l.findElement(By.xpath("//iframe[@src='page.html']"));
	    l.switchTo().frame(outer);
	    //Thread.sleep(3000);
	  //  WebElement inner = l.findElement(By.xpath("//iframe[@src='nested.html' and @id='frame2']"));
	    l.switchTo().frame(0);
	    l.findElement(By.xpath("//button[@id='Click1']")).click();
	    l.switchTo().defaultContent();
	    int i = l.findElements(By.tagName("iframe")).size();
	    System.out.println(i);
	
	
	
	
	
	
	
	
	}

}
