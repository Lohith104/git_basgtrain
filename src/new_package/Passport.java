package new_package;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class Passport {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lohith\\eclipse-workspace\\Seleniem_newproject\\Driver\\chromedriver.exe");
		WebDriver l=new ChromeDriver();
		
		l.get("https://portal2.passportindia.gov.in/AppOnlineProject/user/RegistrationBaseAction?request_locale=en");
		l.manage().window().maximize();
		WebElement km = l.findElement(By.xpath("//select[@id='dcdrLocation']"));
	Select s=new Select(km);
	s.selectByIndex(8);

	l.findElement(By.xpath("(//input[@type='text' and @maxlength='45'])[2]")).sendKeys("Lohith");
    l.findElement(By.xpath("//input[@name='surname']")).sendKeys("KM");
    l.findElement(By.xpath("//input[@value='DD/MM/YYYY']")).sendKeys("09/07/1996");
    l.findElement(By.xpath("//a[text()='9']")).click();
    l.findElement(By.xpath("//input[@name='email']")).sendKeys("kmlohith4@gmail.com");
    l.findElement(By.xpath("//input[@type='radio' and @value='yes']")).click();
    l.findElement(By.name("pwd")).sendKeys("tttyyuupp@@");
    l.findElement(By.xpath("//input[@id='confirmPwd']")).sendKeys("tttyyuupp@@");
    WebElement p = l.findElement(By.xpath("//select[@id='hintQues']"))	;
	Select o=new Select(p);
	o.selectByValue("Colour");
	l.findElement(By.xpath("//input[@name='hintAns']")).sendKeys("Black");
	System.out.println("Options for Hint are");
	List<WebElement> u = o.getOptions();
	for (WebElement e : u) {
		System.out.println( e.getText());
	}
	System.out.println("The selected hint is ");
		WebElement i = o.getFirstSelectedOption();
		System.out.println(i.getText());
	
	TakesScreenshot g=(TakesScreenshot)l;
	File src= g.getScreenshotAs(OutputType.FILE);
	File des=new File("C:\\Users\\Lohith\\eclipse-workspace\\Selenium\\ScreenShot/lohith3.png");
	FileHandler.copy(src, des);
	l.findElement(By.xpath("(//img[@alt='Audio captcha'])[1]")).click();
	}
	}


