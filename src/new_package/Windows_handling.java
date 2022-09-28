package new_package;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.GetTitle;

public class Windows_handling {
	public static <E> void main(String[] args){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lohith\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver lohith= new ChromeDriver();
		
		lohith.get("https://letcode.in/windows");
		lohith.manage().window().maximize();
		WebElement w = lohith.findElement(By.id("home"));
		w.click();
        String title = lohith.getTitle();
        System.out.println(title);
        String string = lohith.getWindowHandle();
        System.out.println(string);
        //lohith.close();
       // lohith.quit();
        lohith.switchTo().window(string);
        lohith.findElement(By.id("multi")).click();
        Set<String> set = lohith.getWindowHandles();
        System.out.println(set);
        Iterator<String>iter=set.iterator();
        List<String> hlist=new ArrayList<>();
        if(switchtirightwindow("Facebook",hlist));
        while (iter.hasNext()) {
	 String ch = iter.next();
	 if (!w.equals(string)) {
		String title2 = lohith.switchTo().window(ch).getTitle();
		System.out.println(title2);
		lohith.close();
		}}
	}

	public  static boolean switchtirightwindow(String windowtitle,List<String>hlist) {
		for (String e : hlist) {
			if (e.contains(windowtitle)) {
				System.out.println("pass");
			}
		}
	
 {
 }
return false;}
}