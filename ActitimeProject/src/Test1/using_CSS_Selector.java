package Test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class using_CSS_Selector {

	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
driver.get("file:///F:/Selenium%20Test%20Drive/DemoLocators1.html");
//driver.findElement(By.cssSelector("a[id='d1']")).click();
//driver.findElement(By.cssSelector("a[name='n1']")).click();
//driver.findElement(By.cssSelector("a[class='c2']")).click();
driver.findElement(By.cssSelector("a[href='https://qspiders.com']")).click();
driver.close();

	}

}
