package new_package;

import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lohith\\eclipse-workspace\\Seleniem_newproject\\Driver\\chromedriver.exe");
		WebDriver l=new ChromeDriver();
		l.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		l.get("https://letcode.in/slider");
		WebElement web = l.findElement(By.id("generate"));
		Actions j=new Actions(l);
		Point point = web.getLocation();
		System.out.println(point.getX());
		System.out.println(point.getY());
		j.dragAndDropBy(web, 10, 150).perform();
		
		WebElement element = l.findElement(By.xpath("//button[text()='Get Countries']"));
		element.click();
		String text = element.getText();
		System.out.println(text);
		
		WebElement element2 = l.findElement(By.xpath("//p[@class='has-text-primary-light']"));
		String text2 = element2.getText();
		int length = text2.length();
		System.out.println(text2);
		System.out.println(length);
		
		WebElement element3 = l.findElement(By.xpath("//h1[@class='subtitle has-text-info']"));
		String text3 = element3.getText();
		System.out.println(text3);
		
		String[] split = text2.split("-");
		for (String s : split) {
			System.out.println(s);
			int count =s.length();
			int a=count++;
			System.out.println(a);
		}
		int count=0;
		for(int i=0;i<text2.length()-1;i++){
		if((text2.charAt(i)==27)||(text2.charAt(i+1)!=27)){
			int a = count++;		}
	System.out.println(count);

		
	}}}
	


	
