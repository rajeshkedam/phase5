package seleniumscriptsday1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassNameLocator {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://en.wikipedia.org/w/index.php?title=Special:UserLogin&returnto=Main+Page");
        driver.findElement(By.className("loginText mw-ui-input")).click();
        driver.findElement(By.className("loginPassword mw-ui-input")).click();
        Thread.sleep(1500);
        
        
}
}