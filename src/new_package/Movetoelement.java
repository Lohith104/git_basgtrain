package new_package;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Movetoelement {

	public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lohith\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
			WebDriver lohith= new ChromeDriver();
			lohith.get("https://letcode.in/sortable");
			lohith.manage().window().maximize();
			lohith.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
			Actions act=new Actions(lohith);
			WebElement q = lohith.findElement(By.xpath("//div[text()=' Get to work']"));
			
			WebElement element = lohith.findElement(By.xpath("(//div[@id='sample-box1'])[5]"));
			//act.clickAndHold(q).moveToElement(element).perform();
		Point point = element.getLocation();
		int x = point.getX();
		int y = point.getY();
		System.out.println(x);
		System.out.println(y);
		
		//act.clickAndHold(q).moveToElement(element, x, y).perform();
			//lohith.close();
      List<WebElement> list = lohith.findElements(By.tagName("a"));
      int size = list.size();
      System.out.println("no of links "+size);
      for (int i = 0; i < size; i++) {
		String string = list.get(i).getText();
		String att = list.get(i).getAttribute("href");
		//System.out.println(string+"\n"+att);	
	}
      for (WebElement st : list) {
    	  String text = st.getText();
    	  String string = st.getAttribute("href");
    	  System.out.println(text+"\n"+string);
    
	}
			

	}

}
