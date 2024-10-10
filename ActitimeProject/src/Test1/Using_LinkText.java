package Test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Using_LinkText {

	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("http://www.google.com/");
driver.findElement(By.linkText("Gmail")).click();
String title=driver.getTitle();
System.out.println(title);
driver.findElement(By.linkText("Sign in")).click();
String title1=driver.getTitle();
System.out.println(title1);
driver.close();
	}

}
