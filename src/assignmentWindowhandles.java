import java.util.Iterator;
import java.util.Set;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignmentWindowhandles {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\reach\\Documents\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://the-internet.herokuapp.com/");
		driver.findElement(By.xpath("//a[contains(text(),'Multiple Windows')]")).click();
			
		driver.findElement(By.cssSelector("a[href*='windows']")).click();
		Set<String> windows=driver.getWindowHandles();
        Iterator<String> xy=windows.iterator();
        String parentId=xy.next();
        driver.switchTo().window(xy.next());
        System.out.println(driver.findElement(By.xpath("//div/h3")).getText());
        driver.switchTo().window(parentId);
        System.out.println(driver.findElement(By.xpath("//div[@id='content']/div/h3")).getText());
		
		/*driver.findElement(By.cssSelector("a[href*='windows']")).click();



		Set<String> abc=driver.getWindowHandles();



		Iterator<String> it=abc.iterator();



		String parentWindow=it.next();



		driver.switchTo().window(it.next());



		System.out.println(driver.findElement(By.xpath("//div/h3")).getText());

		driver.switchTo().window(parentWindow);



		System.out.println(driver.findElement(By.xpath("//div[@id='content']/div/h3")).getText());*/


	}

}
