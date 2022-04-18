package seleniumscriptsday4;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 WebDriver driver = new ChromeDriver();
	        
	        driver.manage().window().maximize();
	        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	        driver.findElement(By.name("proceed")).click();
	        Alert a = driver.switchTo().alert();
	        System.out.println(a.getText());
	        a.accept();
	        Thread.sleep(2000);
	        driver.findElement(By.id("login1")).sendKeys("admin");
	}
	

}
