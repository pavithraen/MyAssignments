package Assignments1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Merge Contacts")).click();
		//*[@id="ext-gen601"]
	
		//from contact
		driver.findElement(By.xpath("(//img[@alt='Lookup'])[1]")).click();
		Set<String> windowHandle=driver.getWindowHandles();
		List<String> WinHandle=new ArrayList<String> (windowHandle);
		driver.switchTo().window(WinHandle.get(1));
        System.out.println(driver.getTitle());
        driver.findElement(By.xpath("//a[text()='10642']")).click();
       
        //back to parent window
        driver.switchTo().window(WinHandle.get(0));
        System.out.println(driver.getTitle());
       
     //to contact
       driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();
		Set<String> winHandle=driver.getWindowHandles();
		List<String> WHandle=new ArrayList<String> (winHandle);
		
      driver.switchTo().window(WHandle.get(1));
      driver.findElement(By.xpath("//a[text()='10643']")).click();
      
      //back to parent window
      driver.switchTo().window(WHandle.get(0));
      
      //alert
      driver.findElement(By.xpath("//a[text()='Merge']")).click();
      Alert a=driver.switchTo().alert();
      a.accept();
      System.out.println(driver.getTitle());
     
		

	}

}
