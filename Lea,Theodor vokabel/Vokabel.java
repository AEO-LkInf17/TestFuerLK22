public class Vokabel {
  // Anfang Attribute
  private String DeutscheUebersetzung;
  private String EnglischeUebersetzung;
  
  // Ende Attribute
  private Stapel neuerStapel;
  
  
  public Vokabel(String DeutscheUebersetzung, String EnglischeUebersetzung) {
    this.DeutscheUebersetzung = DeutscheUebersetzung;
    this.EnglischeUebersetzung = EnglischeUebersetzung;
  }
  
  // Anfang Methoden
  public String getDeutscheUebersetzung() {
    return DeutscheUebersetzung;
  }
  
  public void setDeutscheUebersetzung(String DeutscheUebersetzungNeu) {
    DeutscheUebersetzung = DeutscheUebersetzungNeu;
  }
  
  public String getEnglischeUebersetzung() {
    return EnglischeUebersetzung;
  }
  
  public void setEnglischeUebersetzung(String EnglischeUebersetzungNeu) {
    EnglischeUebersetzung = EnglischeUebersetzungNeu;
  }
  
  public boolean vergleicheMitFremdsprache(String eingabe) {
    if(this.EnglischeUebersetzung.equals(eingabe))
    {
      return true;
    }
    else{
      return false;
    }
  }      
  
}
