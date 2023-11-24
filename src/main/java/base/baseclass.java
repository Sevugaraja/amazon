package base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class baseclass {
	public static WebDriver driver;
	public static Actions a;
	
	public static WebDriver launchbrowser(String browsername) {
		
		if (browsername.equalsIgnoreCase("chrome")) {
			
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\RAJA\\eclipse-workspace\\flipkart\\driver\\chromedriver.exe");
		
	     driver = new ChromeDriver();
		} else if (browsername.equalsIgnoreCase("firebox")) {
			System.setProperty("webdriver.firebox.driver", "C:C:\\Users\\RAJA\\eclipse-workspace\\flipkart\\driver\\chromedriver.exe");
			
			
		}
		return driver;
	}
		public static void geturl(String url) {
		driver.get(url);
		}
	
	    public static void waits(String waiting) {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		  }
	
        public static void title(String webpagename) {
        	driver.getTitle();
        }
        
        public static void currenturl(String webpageurl) {
        	driver.getCurrentUrl(); 
        }      

        public static void SendkeysAction(WebElement getElement, String getemailid) {
        	a =  new Actions(driver);
        	a.sendKeys(getElement,getemailid).build().perform();
        	
        }
         
        public static void alert(String alert) {
        	driver.switchTo().alert().accept();
        }	

        public static void Actions(String mouse) {
         Actions a = new Actions(driver);
        a.contextClick().build().perform();
        }

       public static void ClickAction(WebElement getElement, String register) {
    	   a = new Actions(driver);
    	   if(register.equalsIgnoreCase("click")) {
    		   
    		   
    	 a.click(getElement).build().perform();
        	
        }
       }
        
        
       
}

        
	
	
	
	


