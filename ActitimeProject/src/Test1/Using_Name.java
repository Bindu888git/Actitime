package Test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Using_Name {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("file:///F:/Selenium%20Test%20Drive/DemoLocators1.html");
	driver.findElement(By.name("n2")).click();
	String title= driver.getTitle();
	System.out.println(title);
	driver.close();
}
}
