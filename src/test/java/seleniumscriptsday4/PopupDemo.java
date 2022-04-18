package seleniumscriptsday4;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopupDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
        
        driver.manage().window().maximize();
        driver.get("https://chandanachaitanya.github.io/selenium-practice-site/?languages=Java&enterText=");
        WebElement e1 = driver.findElement(By.id("win2"));
        JavascriptExecutor js = ((JavascriptExecutor)driver);
        js.executeScript("arguments[0].scrollIntoView(true)",e1);
        e1.click();
        Set<String> s1 = driver.getWindowHandles();
        Iterator<String> itr=s1.iterator();

        String parentwindow = itr.next();
        
        System.out.println(parentwindow);
            
        String childwindow = itr.next();
        
        System.out.println(childwindow);
        
        
        driver.switchTo().window(childwindow);
        
        String title = driver.getTitle();
        
        System.out.println("the title of the child window is :" + title);
        
        
        
        driver.switchTo().window(parentwindow);
        
        String title1 = driver.getTitle();
        
        System.out.println("the title of the parent window is :" + title1);
        
        
        driver.quit(); // all the windows that are open in that session will close
	}

}