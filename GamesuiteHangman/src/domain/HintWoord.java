package domain;

import java.util.ArrayList;
import java.util.List;

public class HintWoord {
	
	private List<HintLetter> hintLetters;
	
	
	public HintWoord(String woord){
		if(woord==null){
			throw new DomainException("Ongeldig woord.");
		}
		hintLetters = new ArrayList<>();
		char[] letters = woord.toCharArray();
		
		for(char letter: letters){
			hintLetters.add(new HintLetter(letter));
		}
	}
	
	public boolean raad(char letter){
		boolean geraden = false;
		for(HintLetter let: hintLetters){
			if(let.raad(letter)){
				geraden = true;
			}
		}
		return geraden;
	}
	
	public boolean isGeraden(){
		boolean geraden = true;
		
		for(HintLetter c : hintLetters){
			if(!c.isGeraden()){
				geraden = false;
			}
		}
		
		
		return geraden;
		
		
	}
	public String getWoord(){
		
		String woord ="";
		for(HintLetter c : hintLetters){
			woord += c.getLetter();
		}
		return woord;
		
		
	}
	
	@Override
	public String toString(){
		String woord ="";
		for(HintLetter c : hintLetters){
			woord += c.toChar()+" ";
		}
		return woord;
		
		
	}

}
