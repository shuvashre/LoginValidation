import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkedIn {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver\\chromedriver.exe");
		  WebDriver dr = new ChromeDriver();
		  dr.manage().window().maximize();
		  dr.get("https://www.linkedin.com/login");
		  
		  WebElement el = dr.findElement(By.xpath("//input[@id='username']"));
		  el.sendKeys("Shuva@gmail.com");
		  WebElement pa = dr.findElement(By.id("password"));
		   pa.sendKeys("ilikeapples22");
		   Thread.sleep(4000);
		   
		  WebElement s = dr.findElement(By.xpath("//span[@id='password-visibility-toggle']"));
		  s.click();
		  System.out.println(" pass");
		
		  WebElement l = dr.findElement(By.xpath("//button[@type='submit']"));
		  l.click();

		  System.out.println(" Click to login");
	}
}
