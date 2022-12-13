package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassRoomAssessment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		WebElement findElement = driver.findElement(By.name("USERNAME"));
		 findElement.sendKeys("Demosalesmanager");
		 WebElement findElement2 = driver.findElement(By.id("password"));
		 findElement2.sendKeys("crmsfa");
		 WebElement findElement3 = driver.findElement(By.className("decorativeSubmit"));
		 findElement3.click();
			}

}
