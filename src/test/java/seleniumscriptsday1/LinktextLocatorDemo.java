package seleniumscriptsday1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinktextLocatorDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://en.wikipedia.org/wiki/Main_Page");
        driver.findElement(By.linkText("Contents")).click();
        Thread.sleep(1500);
        String title =driver.getTitle();
        System.out.println("title of first clicked link page is:" + title);
        driver.findElement(By.linkText("About Wikipedia")).click();
        Thread.sleep(1500);
        String title2 =driver.getTitle();
        System.out.println("title of first clicked link page is:" + title2);
        driver.navigate().back();
        Thread.sleep(1500);
        driver.navigate().forward();
	}

}
