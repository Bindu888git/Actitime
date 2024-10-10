package Test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintText_Using_id {

	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
driver.get("http://localhost/login.do");
String text = driver.findElement(By.id("licenseLink")).getText();
String text1 =driver.findElement(By.xpath("//a[@target='_blank']")).getText();
System.out.println(text);
System.out.println(text1);
driver.close();


	}

}
