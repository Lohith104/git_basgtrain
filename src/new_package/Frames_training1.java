package new_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames_training1 {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lohith\\eclipse-workspace\\Seleniem_newproject\\Driver\\chromedriver.exe");
		WebDriver l=new ChromeDriver();
		
		
		l.get("https://the-internet.herokuapp.com/iframe");
	
		
		WebElement r = l.findElement(By.xpath("//iframe[@id='mce_0_ifr']"));
		
		l.switchTo().frame(r);
		
		WebElement t = l.findElement(By.xpath("//p[text()='Your content goes here.']"));
		t.sendKeys("Hi!,i am Lohith");
		l.switchTo().defaultContent();
		l.findElement(By.xpath("//span[text()='Paragraph']")).click();
		l.findElement(By.xpath("//div[text()='Headings']")).click();
		l.findElement(By.xpath("//h3[text()='Heading 3']")).click();
		l.findElement(By.xpath("(//button[@type='button' and @aria-pressed='false'])[1]")).click();
		
		
		l.get("https://the-internet.herokuapp.com/frames");
		l.findElement(By.xpath("//a[text()='Nested Frames']")).click();
		
		WebElement q = l.findElement(By.xpath("//frame[@name='frame-top']"));
	    l.switchTo().frame(q);
		 
	    WebElement y = l.findElement(By.xpath("//frame[@src='/frame_left']"));
	    l.switchTo().frame(y);
	    //l.manage().window().maximize();
	  WebElement f = l.findElement(By.xpath("//body[normalize-space()='LEFT']"));
	 String d = f.getText();
	 System.out.println(d);
	 
	 l.switchTo().parentFrame();
	
	 WebElement x = l.findElement(By.xpath("//frame[@src='/frame_right']"));
	  l.switchTo().frame(x);
	  l.manage().window().maximize();
	  WebElement c = l.findElement(By.xpath("//body[normalize-space()='RIGHT']"));
	  String z = c.getText();
	  System.out.println(z);
	  l.close();
	    
	
	
	
	
	}

}
