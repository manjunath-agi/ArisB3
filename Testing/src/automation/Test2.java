package automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;




public class Test2 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\00005232\\OneDrive - Arisglobal software pvt Ltd\\Softwares for installation\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.google.com");
		String pTitle = driver.getTitle();
		System.out.println(pTitle);
		driver.close();
	}

}
