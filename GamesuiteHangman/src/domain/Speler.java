package domain;

public class Speler {
	private String naam;
	private int score;
	
	public Speler(String naam) {
		setNaam(naam);
		this.score = 0;
	}
	
	public String getNaam() {
		return naam;
	}
	
	public void setNaam(String naam) {
		if (naam == null || naam.trim().isEmpty()) {
			throw new DomainException("naam mag niet null zijn");
		}
		this.naam = naam;
	}

	public int getScore() {
		return score;
	}
	
	public void addToScore(int score){
		this.score += score;
		if (this.score < 0) {
			this.score -= score;
			throw new DomainException("score mag niet 0 zijn");
		}	
	}
	
	@Override
	public boolean equals(Object object){
		if (object instanceof Speler){
			Speler s = (Speler) object;
			if (s.getNaam().equals(this.getNaam()) && s.getScore() == this.getScore())
				return true;
		}
		return false;
	}
	
	@Override
	public String toString(){
		return getNaam() + " heeft als score: " + getScore();
	}
}
