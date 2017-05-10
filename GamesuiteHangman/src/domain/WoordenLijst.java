package domain;


import java.util.ArrayList;
import java.util.List;
import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Paths;
import java.util.*;

public class WoordenLijst {
	private List<String> woorden;
	
	
	public WoordenLijst(){
		woorden = new ArrayList<String>();
		//Inlezen van bestand hangman.txt
		
	}
	public int getAantalWoorden(){
		return woorden.size();
	}
	public void voegToe(String woord){
		if(!woorden.contains(woord)){
			woorden.add(woord);
		}
	}
	public String getRandomWoord(){
		int index = (int)Math.floor(Math.random()*(woorden.size()-1));
		
		return woorden.get(index);
	}
	
	

}
