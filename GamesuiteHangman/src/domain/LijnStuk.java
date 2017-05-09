package domain;

public class LijnStuk extends Vorm{

	private Punt start;
	private Punt einde;
	
	public LijnStuk(Punt start, Punt einde) {
		setStartEnEindPunt(start, einde);		
	}
	
	public void setStartEnEindPunt(Punt start, Punt einde) {
		if (start == null) {
			throw new DomainException("Ongeldig startpunt");
		}
		if (einde == null) {
			throw new DomainException("Ongeldig eindpunt");
		}
		if (start == einde) {
			throw new DomainException("Start- en eindpunt mogen niet gelijk zijn");
		}
		this.start = start;
		this.einde = einde;
	}
	
	public Punt getStartPunt() {
		return start;
	}
	
	public Punt getEindPunt() {
		return einde;
	}
	
	@Override
	public boolean equals(Object o) {
		if (o instanceof LijnStuk) {
			LijnStuk lijnstuk = (LijnStuk) o;
			if ((this.getStartPunt() == lijnstuk.getStartPunt() && this.getEindPunt() == lijnstuk.getEindPunt()) ||
				(this.getStartPunt() == lijnstuk.getEindPunt() && this.getEindPunt() == lijnstuk.getStartPunt())){
				
				return true;
			}
		}
		return false;
	}
	
	@Override
	public String toString() {
		String res = "Lijn: startpunt: " + getStartPunt() + " - eindpunt: " + getEindPunt();
		return res;
	}

}