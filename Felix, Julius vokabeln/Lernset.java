
import java.util.ArrayList;
import java.util.Random;



public class Lernset {
  private String name;
  ArrayList<Vokabeln> vok ;
  
  
  public Lernset(String name) {
    this.name = name;
    vok = new ArrayList<Vokabeln>();
  
  }

  public void fuegeHinzu(Vokabeln v) {
    this.vok.add(v);
  
  } 
  public String getName(){
    return name;
}
  public ArrayList<Vokabeln> getVok() {
    return vok;
}





  public static void main (String [] args){
    Lernset ls = new Lernset("hans");
    Vokabeln v = new Vokabeln("Hallo", "Hello");
    ls.fuegeHinzu(v);
    
    //System.out.println(ls.getVok() + ls.getName());
    //System.out.println(ls.getName());
    
    
    for (Vokabeln v : getVok()  ) {
       System.out.println(v1.getSpracheM());
      
    } // end of for
}

    
  
  
  

}
