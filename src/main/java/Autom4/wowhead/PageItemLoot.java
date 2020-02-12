package Autom4.wowhead;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.net.URL;

public class PageItemLoot {
	
	

	public List<String> loadFile(String Item) throws FileNotFoundException {
		URL Loot = PageItemLoot.class.getClassLoader().getResource("/wowhead/src/test/java/ressource/" + Item + ".txt");
		File totoResource = new File(Loot.getFile());
		
	    Scanner s = new Scanner(totoResource, "UTF-8");
	    ArrayList<String> list = new ArrayList<String>();
	    while (s.hasNextLine()){
	        list.add(s.nextLine());
	    }
	    s.close();
	   
	    return list;
	}

}
