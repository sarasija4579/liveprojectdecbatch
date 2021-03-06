package Sarasija.Chinni;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadDataFromPropertyFile {
	
	
public static String path="./config.properties";
private static String getdata(String key)throws Exception {
	       File f=new File(path);
	       Properties p = new Properties();
	       FileInputStream fi=new FileInputStream(f);
	       p.load(fi);
	       return p.getProperty(key);
	}
		public static void main(String[] args)throws Exception {
			System.out.println(getdata("browser"));
		System.setProperty("webdriver.chrome.driver", "D://library//chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get(getdata("prodURL"));
        driver.manage().window().maximize();
        driver.findElement(By.name(getdata("usernameloc"))).sendKeys(getdata("username"));
        driver.findElement(By.name(getdata("passwordloc"))).sendKeys(getdata("password"));
        driver.findElement(By.name(getdata("loginloc"))).click();
	}

}
