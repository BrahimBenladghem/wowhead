package Autom4.wowhead;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;


public class PageAccueil {
	
	public PageRecherchePNJ rechercheLardeur(WebDriver driver, String Mob) {
		driver.get("https://fr.wowhead.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[contains(.,\"Accept and Continue\")]")).click();
		driver.findElement(By.xpath("//input")).sendKeys(Mob);
		driver.findElement(By.xpath("//input")).submit();
		return PageFactory.initElements(driver, PageRecherchePNJ.class);
		
	}

}
