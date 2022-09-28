package new_package;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Project_miniproject {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lohith\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver lohith=new ChromeDriver();
		 JavascriptExecutor js=(JavascriptExecutor)lohith;
		lohith.get("http://automationpractice.com/index.php");
		lohith.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		Thread.sleep(5000);
        lohith.findElement(By.xpath("//a[@class='login']")).click();
      WebElement element = lohith.findElement(By.xpath("(//input[@type='text'])[2]"));
       js.executeScript("arguments[0].scrollIntoView();", element);
       element.sendKeys("kmlohith503@gmail.com");
       lohith.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
       lohith.findElement(By.xpath("(//input[@type='radio'])[1]")).click();
	lohith.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("Lohith");
	lohith.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("KM");
	lohith.findElement(By.xpath("//input[@type='password']")).sendKeys("Lohith@104");
	WebElement a = lohith.findElement(By.xpath("//select[@name='days']"));
	Select s=new Select(a);
	s.selectByValue("9");
	WebElement k = s.getFirstSelectedOption();
	WebElement w = lohith.findElement(By.xpath("//select[@id='months']"));
		Select q=new Select(w);
		q.selectByIndex(7);
		List<WebElement> option =  q.getOptions();
		for (WebElement string : option) {
			System.out.println(string.getText());}
		WebElement z = lohith.findElement(By.xpath("//select[@id='years']"));
		Select d=new Select(z);	
		d.selectByValue("1996");
		WebElement x = lohith.findElement(By.xpath("(//input[@type='text'])[7]"));
		js.executeScript("arguments[0].scrollIntoView();", x);
		x.sendKeys("Azad Engineering");
		lohith.findElement(By.xpath("(//input[@type='text'])[8]")).sendKeys("jeedimetla,Kentuchy");
		lohith.findElement(By.xpath("(//input[@type='text'])[9]")).sendKeys("no 35,IDA colony");
		lohith.findElement(By.xpath("(//input[@type='text'])[10]")).sendKeys("Kentuchy");
	lohith.findElement(By.xpath("(//input[@type='text'])[11]")).sendKeys("40475");
	WebElement b = lohith.findElement(By.xpath("//select[@name='id_country']"));
	Select j=new Select(b);
	j.selectByIndex(1);
	WebElement h = j.getFirstSelectedOption();
	System.out.println(h.getText());
	WebElement c = lohith.findElement(By.xpath("//select[@name='id_state']"));
			Select v=new Select(c);
			v.selectByValue("17");
			lohith.findElement(By.xpath("//input[@id='phone_mobile']")).sendKeys("+917358530068");
			lohith.findElement(By.xpath("//input[@value='My address']")).clear();
			lohith.findElement(By.xpath("//input[@value='My address']")).sendKeys("Lohith@104");
			lohith.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
		    lohith.findElement(By.xpath("//a[@class='logout']")).click();
		    lohith.findElement(By.xpath("//input[@id='email']")).sendKeys("kmlohith4@gmail.com");
		    lohith.findElement(By.xpath("//input[@name='passwd']")).sendKeys("Lohith@104");
		    lohith.findElement(By.xpath("(//button[@type='submit'])[3]")).click();
			lohith.manage().window().maximize();
			
			
	}

}
