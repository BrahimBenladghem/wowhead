package Autom4.wowhead;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class PagePNJ {
	
	
	public PageItemLoot premierItem(WebDriver driver, String Item) {
		WebElement lien_objet = driver.findElement(By.xpath("//td/div/a[contains(@class,'q3')][contains(.,'" + Item + "')]"));
		lien_objet.click();
		return PageFactory.initElements(driver, PageItemLoot.class);
	}

}
