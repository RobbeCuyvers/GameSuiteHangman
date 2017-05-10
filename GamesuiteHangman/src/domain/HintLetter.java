package domain;

public class HintLetter {
	
	private boolean geraden;
	private char letter;
	
	public HintLetter(char letter){
		
		this.letter = letter;
		geraden = false;
	}
	
	public boolean raad(char letter){
		
		if(this.letter == letter){
			geraden = true;
		}
		
		return geraden;
	}
	
	public boolean isGeraden(){
		return geraden;
	}
	
	public char toChar(){
		
		if(geraden){
			return letter;
		}
		return '_';
		
	}
	public char getLetter(){
		return letter;
	}

}