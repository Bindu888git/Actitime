package Test1;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RBI_login_Copy_Paste {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://ekamev.rbi.org.in/login/");
		driver.findElement(By.id("username")).sendKeys("Sureshsu30@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.id("password")).sendKeys("SureshKuamr@123");
		driver.findElement(By.xpath("//input[@type='submit']")).submit();
		Thread.sleep(3000);
		driver.quit();
		
		
			}
	
}
