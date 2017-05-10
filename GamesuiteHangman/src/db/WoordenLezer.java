package db;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import domain.DomainException;
import domain.WoordenLijst;

public class WoordenLezer {
	private String filename;
	
	public WoordenLezer(String filename){
		if(filename==null){
			throw new DBException("Ongeldige filenaam.");
		}
	}
	
	public WoordenLijst lees(){
		WoordenLijst woordenlijst = new WoordenLijst();
		ArrayList<String> woordlijst = readFile();
		
		for(String woord: woordlijst){
			woordenlijst.voegToe(woord);
		}
		
		return woordenlijst;
	}
	
	public ArrayList<String> readFile(){
		ArrayList<String> words = new ArrayList<String>();
		
		//File woordenFile = new File(Paths.get("/Users/thomascorthouts/Documents/GitHub/GameSuiteHangman/GamesuiteHangman/bestanden/hangman.txt").toString());
		File woordenFile = new File(this.filename);
		try{
			Scanner scannerFile = new Scanner(woordenFile);
			while(scannerFile.hasNextLine()){
				Scanner scannerLijn = new Scanner(scannerFile.nextLine());
				String woord = scannerLijn.next();
				words.add(woord);
			}
		}
		catch(FileNotFoundException ex){
			throw new DomainException("Fout bij het inlezen");
		}
		return words;
	}

}