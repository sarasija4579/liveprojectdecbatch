package Sarasija.Chinni;

import org.testng.annotations.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class FacebookLoginjs {
public WebDriver driver;
  @Test
  public void f() {
	 JavascriptExecutor js=(JavascriptExecutor)driver;
	 js.executeAsyncScript("document.getElementById('email').value='phalguna'");
	 js.executeAsyncScript("document.getElementById('pass').value='phalguna.panja@gmail'");
	 js.executeAsyncScript("document.getElementById('u_0_4_GY').click()");
  }
  @BeforeTest
  public void beforeTest() {
	 System.setProperty("webdriver.chrome.driver","D://library//chromedriver.exe");
	 driver=new ChromeDriver();
	 driver.get("http://facebook.com");
	 driver.manage().window().maximize();
  }

}
