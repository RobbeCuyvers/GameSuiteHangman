package domain;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WoordenLijst {
	private List<String> woorden;
	
	
	public WoordenLijst(){
		woorden = new ArrayList<String>();
		//Inlezen van bestand hangman.txt
		
		File woordenFile = new File("hangman.txt");
		try{
			Scanner scannerFile = new Scanner(woordenFile);
			while(scannerFile.hasNextLine()){
				Scanner scannerLijn = new Scanner(scannerFile.nextLine());
				String woord = scannerLijn.next();
				woorden.add(woord);
			}
		}
		catch(FileNotFoundException ex){
			throw new DomainException("Fout bij het inlezen");
		}
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
