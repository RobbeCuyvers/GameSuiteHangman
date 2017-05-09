package domain;


public class Driehoek extends Vorm{
	
	private Punt hoekpunt1;
	private Punt hoekpunt2;
	private Punt hoekpunt3;
	
	
	public Driehoek(Punt hoekpunt1, Punt hoekpunt2,Punt hoekpunt3){
		setHoekpunten(hoekpunt1,hoekpunt2,hoekpunt3);
	}
	
	public void setHoekpunten(Punt hoekpunt1, Punt hoekpunt2,Punt hoekpunt3){
		if(hoekpunt1==null || hoekpunt2==null||hoekpunt3==null){
			throw new DomainException("Ongeldig hoekpunt.");
		}
		if(hoekpunt1.equals(hoekpunt2)||hoekpunt2.equals(hoekpunt3)||hoekpunt3.equals(hoekpunt1)){
			throw new DomainException("Samenvallende punten zijn niet toegelaten.");
		}
		
		if(pointsOnLine(hoekpunt1,hoekpunt2,hoekpunt3)){
			throw new DomainException("Punten liggen op 1 lijn.");
		}
		
		this.hoekpunt1 = hoekpunt1;
		this.hoekpunt2 = hoekpunt2;
		this.hoekpunt3 = hoekpunt3;
		
	}
	
	
	private boolean pointsOnLine(Punt p1, Punt p2, Punt p3){
		boolean onLine = false;
		
		int param1 = (p2.getX()-p1.getX())*(p3.getY()-p1.getY());
		int param2 = (p3.getX()-p1.getX())*(p2.getY()-p1.getY());
		if(param1==param2){
			onLine = true;
		}
		
		return onLine;
	}
	
	
	public Punt getHoekPunt1(){
		return this.hoekpunt1;
	}
	
	public Punt getHoekPunt2() {
		return hoekpunt2;
	}

	public Punt getHoekPunt3() {
		return hoekpunt3;
	}
	
	@Override
	public boolean equals(Object object){
		boolean gelijk = false;

		if(object instanceof Driehoek){
			Driehoek drie = (Driehoek) object;
			if(drie.getHoekPunt1().equals(hoekpunt1)||drie.getHoekPunt1().equals(hoekpunt2)||drie.getHoekPunt1().equals(hoekpunt3)){
				if(drie.getHoekPunt2().equals(hoekpunt1)||drie.getHoekPunt2().equals(hoekpunt2)||drie.getHoekPunt2().equals(hoekpunt3)){
					if(drie.getHoekPunt3().equals(hoekpunt1)||drie.getHoekPunt3().equals(hoekpunt2)||drie.getHoekPunt3().equals(hoekpunt3)){
						gelijk=true;
						
					}
				}
			}
			
			
			//Alternative: sort 2 arrays of Punten, check if arrays are equal -> comparable necessary
			
		}
		
		
		return gelijk;
	}
	
	@Override
	public String toString(){
		
		String output = "Driehoek: ";
		output+= "hoekpunt1: "+hoekpunt1.toString()+" - hoekpunt2: "+hoekpunt2.toString()+" - hoekpunt3: "+hoekpunt3.toString();
		
		return output;
	}

	
	

}
