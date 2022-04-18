package seleniumscriptsday1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationMethods {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        
        driver.get("https://www.google.com/");
        
        String title1 = driver.getTitle(); // get the title of the webpage
        
        System.out.println("the title of the page 1 is : " + title1);
        
        // navigate to a new webpage
        
        driver.navigate().to("https://www.selenium.dev/downloads/");
        
        String title = driver.getTitle(); // get the title of the webpage
        
        System.out.println("the title of the page 2 is : " + title);
        driver.navigate().back();
        Thread.sleep(1500);
        String URL= driver.getCurrentUrl();

        System.out.println(" The URL of page navigated back is :" + URL);
        
        driver.navigate().forward();
        
        Thread.sleep(1500);
        String URL2=    driver.getCurrentUrl();
        
        System.out.println(" The URL of page navigated forward is :" + URL2);
        
}
}