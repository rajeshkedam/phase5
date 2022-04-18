package seleniumscriptsday1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NameLocatorDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        driver.findElement(By.name("login")).sendKeys("Reddif1");
        Thread.sleep(1500);
        driver.findElement(By.name("passwd")).sendKeys("red@123");
        driver.findElement(By.name("proceed")).click();
        
        		
	}

}
