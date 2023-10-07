package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class editLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://leaftaps.com/opentaps/control/main/");
        driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Demosalesmanager");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
        driver.findElement(By.xpath("//input[contains(@ class,'decorative')]")).click();
        driver.findElement(By.xpath("//a[contains(text(),'CRM')]")).click();
        driver.findElement(By.xpath("//a[text()='Leads']")).click();
        driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
        driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("Testleaf");
        driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("pavithra");
        driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("pandurangan");
        driver.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']")).sendKeys("pavi");
        driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Technical");
        driver.findElement(By.id("createLeadForm_description")).sendKeys("selenium technical session");
        driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("pavithraengg.28@gmail.com");
        
        WebElement element=driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
        Select dd=new Select(element);
        dd.selectByVisibleText("New York");
        
        driver.findElement(By.name("submitButton")).click();
       
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[text()='Edit']")).click();
        
        driver.findElement(By.id("updateLeadForm_description")).clear();
        
        driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("selenium is trending");
        driver.findElement(By.name("submitButton")).click();
        
        System.out.println(driver.getTitle());
        
        driver.close();
        
        
        
        
       
        
        
        

	}

}
