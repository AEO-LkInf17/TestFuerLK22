import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

/**
 *
 * Beschreibung
 *
 * @version 1.0 vom 13.11.2020
 * @author 
 */

public class Benuteroberfläche extends JFrame {
  // Anfang Attribute
  private JLabel lMuttersprache = new JLabel();
  private JTextField jEingabeMS = new JTextField();
  // Ende Attribute
  
  public Benuteroberfläche() { 
    // Frame-Initialisierung
    super();
    setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    int frameWidth = 588; 
    int frameHeight = 437;
    setSize(frameWidth, frameHeight);
    Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
    int x = (d.width - getSize().width) / 2;
    int y = (d.height - getSize().height) / 2;
    setLocation(x, y);
    setTitle("Benuteroberfläche");
    setResizable(false);
    Container cp = getContentPane();
    cp.setLayout(null);
    // Anfang Komponenten
    
    lMuttersprache.setBounds(64, 24, 158, 44);
    lMuttersprache.setText("Muttersprache");
    lMuttersprache.setFont(new Font("Dialog", Font.BOLD, 20));
    cp.add(lMuttersprache);
    jEingabeMS.setBounds(64, 96, 158, 36);
    cp.add(jEingabeMS);
    // Ende Komponenten
    
    setVisible(true);
  } // end of public Benuteroberfläche
  
  // Anfang Methoden
  
  public static void main(String[] args) {
    new Benuteroberfläche();
  } // end of main
  
  // Ende Methoden
} // end of class Benuteroberfläche

