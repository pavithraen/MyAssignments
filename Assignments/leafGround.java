package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//import io.cucumber.core.plugin.Format.Color;

public class leafGround {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://leafground.com/button.xhtml");
        
        driver.findElement(By.xpath("//span[text()='Click']")).click();
        System.out.println(driver.getTitle());
        
        //to come to previous page
        driver.navigate().back();
        
        boolean button=driver.findElement(By.xpath("//span[text()='Disabled']")).isEnabled();
        System.out.println(button);
        	
        //print position
        Point position=driver.findElement(By.xpath("//span[text()='Submit'][1]")).getLocation();
        System.out.println(position);
        
        //get color
        String color=driver.findElement(By.xpath("//span[text()='Save']")).getCssValue("background-color");
        System.out.println(color);
        
        //height and width
        
        Dimension dim=driver.findElement(By.xpath("//h5[text()='Find the height and width of this button']/following-sibling::button")).getSize();
        System.out.println(dim);
        
        driver.close();

	}

}
