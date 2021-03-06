package Sarasija.Chinni;

import org.testng.annotations.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;

public class MouseNKeyboard {
 public WebDriver driver;
 public Actions a;
  @Test
  public void dragNdrop() {
	  WebElement frame = driver.findElement(By.tagName("iframe"));
	  System.out.println("Number of frames:"+frame.getSize());
	  //driver.switchTo().frame(0);
	  driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
	  WebElement drag = driver.findElement(By.id("draggable"));
	  WebElement drop = driver.findElement(By.id("droppable"));
	  a.dragAndDrop(drag, drop).build().perform();
	  
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","D://library//chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.get("https://jqueryui.com/droppable/");
		 driver.manage().window().maximize();
  }

}
