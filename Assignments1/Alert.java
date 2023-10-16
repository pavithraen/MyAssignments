package Assignments1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://buythevalue.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class='product-title']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Enter Zipcode']")).sendKeys("600119");
		driver.findElement(By.xpath("//input[@value='Check']")).click();
		driver.findElement(By.xpath("//span[text()='Add to Cart']")).click();
		
		Thread.sleep(8000);
		
		driver.findElement(By.xpath("//span[text()='View Cart']")).click();
		
		
		driver.findElement(By.xpath("//input[@id='checkout']")).click();
		
		org.openqa.selenium.Alert a=driver.switchTo().alert();
		a.accept();
		
		

	}

}
