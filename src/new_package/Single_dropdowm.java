package new_package;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Single_dropdowm {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lohith\\eclipse-workspace\\Seleniem_newproject\\Driver\\chromedriver.exe");
		WebDriver lohith=new ChromeDriver();
		//SINGLE DROP DOWN
		lohith.get("https://letcode.in/dropdowns");
		WebElement kalki = lohith.findElement(By.xpath("//select[@id='fruits']"));
		Select km= new Select(kalki);
		boolean k = km.isMultiple();
		System.out.println("Is it a multiple drop down="+k);
		km.selectByIndex(3);
		Thread.sleep(3000);
		km.selectByValue("3");
		Thread.sleep(3000);
		km.selectByVisibleText("Pine Apple");
		Thread.sleep(3000);
		List<WebElement> ka = km.getOptions();
		System.out.println("Options in single Drop down are");
		for (WebElement ke : ka) {
			System.out.println(ke.getText());}
		WebElement kr = km.getFirstSelectedOption();
		System.out.println("the first selected option is="+kr.getText());
		// MULTIPLE DROP DOWN
		WebElement superhero = lohith.findElement(By.xpath("//select[@id='superheros']"));
		Select kl=new Select(superhero);
		boolean b = kl.isMultiple();
		System.out.println("Is it a multiple drop down="+b);
		
			kl.selectByIndex(2);
			Thread.sleep(2000);
			kl.selectByValue("bt");
			Thread.sleep(2000);
			kl.selectByVisibleText("Incredible Hulk");
			Thread.sleep(5000);
			List<WebElement> kj = kl.getOptions();
			System.out.println("options in Multiple Drop down are");
			for (WebElement ko : kj) {
				System.out.println(ko.getText());}
			List<WebElement> kn = kl.getAllSelectedOptions();
			for (WebElement kf : kn) {
	System.out.println("the seleted option is ="+ kf.getText());}
			lohith.close();
			
			
		}
		
		
		
		
	}


