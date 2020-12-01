
public class Vokabeln {
	private String spracheM;
	private String spracheF;
	
	
	
	public Vokabeln(String spracheM, String spracheF) {
		this.spracheF = spracheF;
		this.spracheM = spracheM;
	}
	
	
	
	public String getSpracheM() {
		return spracheM;
		
	}
	public String getSpracheF() {
		return spracheF;
	}
	public void setSpracheM(String spracheM) {
		this.spracheM = spracheM;
	
	}
	public void setSpracheF(String spracheF) {
		this.spracheF = spracheF;
	}
	public boolean vergleicheVok(String eingabe) {
		if(this.spracheF.equals(eingabe)) {
			
			return true;				
	}
		else {
			return false;
		}
		

		
	}
	
}
