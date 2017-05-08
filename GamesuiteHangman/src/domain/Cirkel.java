package domain;

public class Cirkel {
	private int radius;
	private Punt middelpunt;
	
	public Cirkel(Punt middelPunt, int radius){
		setMiddelpunt(middelPunt);
		setRadius(radius);
	}

	
	public void setMiddelpunt(Punt middelpunt){
		if(middelpunt== null){
			throw new NullPointerException("Middelpunt mag niet null zijn.");
		}
		
		this.middelpunt = middelpunt;
	}
	
	
	public Punt getMiddelpunt(){
		return this.middelpunt;
		
	}
	
	
	
	private void setRadius(int radius) {
		if(radius <= 0){
			throw new IllegalArgumentException("De straal moet strikt positief zijn.");
		}
		this.radius = radius;
	}
	
	public int getRadius(){
		return this.radius;
	}
	
	public String toString(){
		 String output = "Cirkel: ";
		 output += "middelPunt: "+ middelpunt.toString();
		 output += " - straal: "+ radius; 
		 return output;
		
		
	}
	
	public boolean equals(Object o){
		if(o == null){
			throw new IllegalArgumentException("equals to null.");
		}
		boolean gelijk = false;
		if(o instanceof Cirkel){
			Cirkel c = (Cirkel) o;
			
			if(this.radius == c.getRadius()&&this.middelpunt == c.getMiddelpunt()){
				gelijk = true;
			}
			
		}
		return gelijk;
	}
	
	

}
