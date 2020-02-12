package Autom4.wowhead;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class PageRecherchePNJ {
	
	public PagePNJ resultatLardeur(WebDriver driver) throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath("//td[@class='icon-boss-padded']/a")).click();
		return PageFactory.initElements(driver, PagePNJ.class);
	}

}
