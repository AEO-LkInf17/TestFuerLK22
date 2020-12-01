import java.util.ArrayList;
import java.util.ArrayList;
import java.util.Random;

public class Stapel{
  // Anfang Attribute
  public String name;
  private Random zufall = new Random();
  private int index;
  private int abfrageIndex; 
  private int anzahlAbfragen;
  // Ende Attribute
  private ArrayList<Vokabel> vokabeln;
  private ArrayList <Stapel>stapelliste = new ArrayList<>();
  
  public Stapel(){
    vokabeln = new ArrayList<Vokabel>();
    
  }
  public String getName() {
    return name;
  }
  public void setName(String nameNeu) {
    name = nameNeu;
  }
  
  public void fuegeVokabelHinzu(Vokabel neueVokabel){
    this.vokabeln.add(neueVokabel);
  }
  
  public void loescheVokabel(int index)
  {
    this.vokabeln.remove(index);
  }
  public Vokabel gibVokabelZuIndex(int index)
  {
    return this.vokabeln.get(index);
  }
  public int anzahlVokabeln() {
    return this.vokabeln.size();
  }
  public void druckevokabellisteTest(){
    for (int i=0; i<vokabeln.size(); i++) {
      Vokabel drucke = vokabeln.get(i);
      System.out.println(drucke.getDeutscheUebersetzung()+drucke.getEnglischeUebersetzung());
    } 
    
  }
  
  public String naechsteFrage()    {
    this.abfrageIndex = zufall.nextInt(this.anzahlVokabeln());
    return this.gibVokabelZuIndex(this.abfrageIndex).getDeutscheUebersetzung();
  }
  public boolean ueberpruefeAntwort(String eingabe){ 
    return this.gibVokabelZuIndex(this.abfrageIndex).vergleicheMitFremdsprache(eingabe);
  }
  public static void main(String []args){
    
  }
  
}
