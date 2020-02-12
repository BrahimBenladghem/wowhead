package Autom4.wowhead;

import java.io.FileNotFoundException;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

public class LardeurTest {

	private WebDriver driver;
	String Mob = "Lardeur";
	String Item1 = "Chahuteur";
	String Item2 = "Chausses";
	String Item3 = "Pioche";
	String Item4 = "Grève";
	String Item5 = "Espauliers";

	String File1 = "Item1";
	
	private String BROWSER = "";
	
	public void chooseBrowser() {
		if(BROWSER.equals("chrome")) {
			BROWSER=System.getProperty("ChromeDriver");
		}
		else if(BROWSER.equals("firefox")) {
			BROWSER=System.getProperty("FirefoxDriver");
		}
		else {
			BROWSER=System.getProperty("InternetExplorerDriver");
		}
	}

	@Test
	public void lardeurStuff() throws InterruptedException, FileNotFoundException {
		PageAccueil pageAccueil = PageFactory.initElements(driver, PageAccueil.class);
		PageRecherchePNJ pageRecherchePNJ = pageAccueil.rechercheLardeur(driver, Mob);
		PagePNJ pagePNJ = pageRecherchePNJ.resultatLardeur(driver);
		PageItemLoot pageItemLoot = pagePNJ.premierItem(driver, Item1);
		//pageItemLoot.loadFile(File1);
		driver.navigate().back();
	}

}
