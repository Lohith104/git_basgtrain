package new_package;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class Mini_project {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lohith\\eclipse-workspace\\Seleniem_newproject\\Driver\\chromedriver.exe");
	WebDriver lohith =new ChromeDriver();
	lohith.navigate().refresh();
	lohith.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	lohith.get("http://automationpractice.com/index.php");
	lohith.manage().window().maximize();
	JavascriptExecutor js= (JavascriptExecutor)lohith;
	WebElement cart = lohith.findElement(By.xpath("(//span[text()='More'])[2]"));
	js.executeScript("window.scrollBy(0,700)");
	Actions act= new Actions(lohith);
	WebElement move = lohith.findElement(By.linkText("Blouse"));
	act.moveToElement(move).perform();
	cart.click();
	lohith.findElement(By.xpath("//i[@class='icon-plus']")).click();
	WebElement selection = lohith.findElement(By.id("group_1"));
	Select s= new Select(selection);
	s.selectByValue("2");
	WebElement add = lohith.findElement(By.xpath("//span[text()='Add to cart']"));
	js.executeScript("window.scrollBy(0,300)", add);
	add.click();
	lohith.findElement(By.xpath("//a[@class='btn btn-default button button-medium']")).click();
	lohith.findElement(By.xpath("(//a[@title='Proceed to checkout'])[2]")).click();
	lohith.findElement(By.name("email")).sendKeys("kmlohith503@gmail.com");
	lohith.findElement(By.name("passwd")).sendKeys("Lohith@104");
	lohith.findElement(By.xpath("//button[@id='SubmitLogin']")).click();
	WebElement comments = lohith.findElement(By.xpath("//textarea[@class='form-control']"));
	js.executeScript("window.scrollBy(0,300)", comments);
	comments.sendKeys("Mini Project");
	String text = comments.getText();
	System.out.println(text);
	lohith.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
	
	lohith.findElement(By.xpath("//input[@name='cgv']")).click();
	lohith.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
	
	js.executeScript("window.scrollBy(0,700)" );
	lohith.findElement(By.xpath("//a[@class='cheque']")).click();
	js.executeScript("window.scrollBy(0,600)");
	lohith.findElement(By.xpath("(//button[@type='submit'])[2]")).click();	
	js.executeScript("window.scrollBy(0,300)");
	
	TakesScreenshot l=(TakesScreenshot)lohith;
	File src=l.getScreenshotAs(OutputType.FILE);
	File des=new File("C:\\Users\\Lohith\\eclipse-workspace\\Selenium\\ScreenShot/lohith5.png");
	FileHandler.copy(src, des);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
