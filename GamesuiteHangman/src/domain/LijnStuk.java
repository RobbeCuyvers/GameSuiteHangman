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
		if (start.equals(einde)) {
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
			if ((this.getStartPunt().equals(lijnstuk.getStartPunt()) && this.getEindPunt().equals(lijnstuk.getEindPunt())) ||
				(this.getStartPunt().equals(lijnstuk.getEindPunt()) && this.getEindPunt().equals(lijnstuk.getStartPunt()))){
				
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
	
	public Omhullende getOmhullende(){
		
		int x1 = start.getX();
		int x2 = einde.getX();
		
		int y1 = start.getY();
		int y2 = einde.getY();
		
		Punt linkerBoven = new Punt(Math.min(x1,x2),Math.min(y1,y2));
		
		Omhullende omhullend = new Omhullende(linkerBoven, Math.abs(x1-x2), Math.abs(y1-y2));
		
		return omhullend;
		
	}

}
