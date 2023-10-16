package Assignments1;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(0, 1000);
		
		//driver.get("https://www.leafground.com/alert.xhtml/");
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
		driver.manage().window().maximize();
		
		//get into frame
		driver.switchTo().frame("iframeResult");
		
		//inside frame inspect element
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		
		//use alert
		Alert a=driver.switchTo().alert();
		a.accept();
		
		System.out.println(driver.findElement(By.xpath("//p[@id='demo']")).getText());
	}

}
