package Informatik;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.LinearGradientPaint;
import java.awt.Point;
import java.awt.Polygon;
import java.awt.RenderingHints;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.geom.Point2D;
import java.awt.image.BufferedImage;
import java.io.Closeable;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

import javax.imageio.ImageIO;
import javax.swing.AbstractButton;
import javax.swing.BorderFactory;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JColorChooser;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import javax.swing.plaf.basic.BasicScrollBarUI;


public class GUIJFrame extends JPanel{
  
  
  static JTextField eingabe;
  static JLabel schrift;
  static JLabel search;
  static JButton knopf; 
  static JButton knopf2; 
  static JFrame container; 
  
  static JCheckBox box;
  static JLabel bild; 
  static JLabel bereich;
  static ImageIcon a;
  
  static JPanel panel;
  static JButton sammler;
  static JButton sammler2;
  static JButton sammler3; 
  static JButton sammler4; 
  static JButton sammler5; 
  static JButton sammler6; 
  static JButton sammler7; 
  static JButton sammler0; 
  static JButton sammler8; 
  static JButton sammler9; 
  static JButton sammler10; 
  static JButton sammler11; 
  static JButton sammler12; 

  public static JPanel ding;
  static JTextArea text1; 
  private static float[] fracs = {0.0f, 0.2f, 0.4f, 0.6f, 0.8f, 1.0f};
  static Border border; 
  BufferedImage bildchen;
  JLabel face;
  ImageIcon icon1;
private static JButton minimize;
private static Font fontA;
private static AbstractButton close;
  public static Color z;
 

       
  GUIJFrame() {
    
      initUI();
  }
  private void initUI() {
  
      container = new JFrame();
  
      
      
      container.setResizable(false);
      container.setUndecorated(true);
     
      container.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     container.setSize(750, 550);
      container.setLocationRelativeTo(null);
//      container.pack();
//       container.setPreferredSize(new Dimension(700, 500));
      
       ding = new JPanel();
      ding.setBounds(0, 0, 0, 0);
      ding.setSize(container.getSize());
      ding.setLayout(null);
      ding.setBackground(Color.BLACK);
     
      
//
//      URL iconURL2 = getClass().getResource("/Informatik/bana.png");
//      ImageIcon icon2 = new ImageIcon(iconURL2);
//      Image img = icon2.getImage();
//      Image img2 = img.getScaledInstance(32, 32,  java.awt.Image.SCALE_SMOOTH ) ;
//        ImageIcon icon3 = new ImageIcon(img2);
//      container.getRootPane().setCursor(Toolkit.getDefaultToolkit().createCustomCursor(
//          img2,
//          new Point(0,0),"custom cursor"));
      //container.setCursor (c);
      
      
      
      

      
      int x= 55;
      int y= 52;
      
      
      
      JLabel logo = new JLabel();
      logo.setBounds(30,30, 50, 50);
      try {
		URL iconURL= new URL("https://www.nicepng.com/png/full/202-2022890_compose-icon-vocabulary.png");
		 ImageIcon icon = new ImageIcon(iconURL);
		 Image img = icon.getImage();
		
				 Image img2 = img.getScaledInstance(logo.getWidth(), logo.getHeight(),  java.awt.Image.SCALE_SMOOTH );
				 ImageIcon icon2 = new ImageIcon(img2);
				 
			      logo.setIcon(icon2);
		
		      
	} catch (MalformedURLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
      
//      ImageIcon imageIcon = new ImageIcon(new ImageIcon("icon.png").getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT));
//      logo.setIcon(imageIcon);
   ding.add(logo);
   
   
    
 
 
      Font font0 = new Font("Serif", Font.BOLD, 30);
      JMultiColorLabel name = new JMultiColorLabel("VOKABELBABELBUBEL");
      name.setBounds(200,20, 500, 100);
//     
//      Point2D start = new Point2D.Float(name.getX(), getY());
//      Point2D end = new Point2D.Float(name.getWidth(), name.getHeight());
//      Color[] colors = {Color.magenta, Color.blue, Color.cyan,
//              Color.green, Color.yellow, Color.red};
//          LinearGradientPaint p = new LinearGradientPaint(start, end, fracs, colors);
      
      
     
      name.setColors(new int[]{0,1,2,3,4,5,6,7,8,9,10,11,12 }, new Color[]{Color.magenta, Color.blue, Color.cyan,
              Color.green, Color.yellow, Color.red, Color.magenta, Color.blue, Color.cyan,
              Color.green, Color.yellow, Color.red, Color.magenta, Color.blue, Color.cyan,
              Color.green, Color.yellow, Color.red});
   
      name.setForeground(Color.RED);
      name.setBackground(new Color(0.1f, 0.1f, 0.1f, 0.0f));
      
      name.setFont(font0);
      ding.add(name);
      
      
      
      JLabel error = new JLabel("Bisherige Fehler:");
      error.setBounds(200,200, 500, 100);
      error.setForeground(Color.white);
      error.setBackground(new Color(0.1f, 0.1f, 0.1f, 0.0f));
      error.setFont(font0);
      ding.add(error);
      
      JLabel session = new JLabel("Versuche/Session:");
      session.setBounds(200,200, 500, 100);
      session.setForeground(Color.white);
      session.setBackground(new Color(0.1f, 0.1f, 0.1f, 0.0f));
      session.setFont(font0);
      ding.add(session);
      
                
        
      
   
         
      
           close = new JButton();
           fontA = new Font("Courier", Font.PLAIN, 6);
           close.setFont(fontA);
           close.setFocusPainted(false);
           UIManager.put("Button.select", Color.RED);
           close.setBounds(680, 10, x, y);
            close.setBackground(Color.white);
//           close.setPreferredSize(new Dimension (x,y));
           Border r= BorderFactory.createEtchedBorder(EtchedBorder.RAISED, Color.BLACK, Color.red);
     
           Border c2 = BorderFactory.createTitledBorder(
                    r, "Schließen",
                   TitledBorder.CENTER,
                   TitledBorder.TOP, fontA, z);
           close.addActionListener(new ListenerCLOSE());
           close.setBorder(c2);
           ding.add(close);
           
           try {
         		URL iconURL= new URL("https://www.nicepng.com/png/full/398-3985202_power-icon-button-png-svg-clip-art-for.png");
         		 ImageIcon icon = new ImageIcon(iconURL);
         		 Image img = icon.getImage();
         		
         				 Image img2 = img.getScaledInstance(close.getWidth()-(close.getWidth()/3), close.getHeight()-(close.getHeight()/4),  java.awt.Image.SCALE_SMOOTH );
         				 ImageIcon icon2 = new ImageIcon(img2);
         				 close.setIcon(icon2);
         				 
         			    
         		
         		      
         	} catch (MalformedURLException e) {
         		// TODO Auto-generated catch block
         		e.printStackTrace();
         	}
           
           minimize = new JButton();
           
           minimize.setFont(fontA);
           minimize.setFocusPainted(false);
           UIManager.put("Button.select", Color.RED);
           minimize.setBounds(610, 10, x, y);
            minimize.setBackground(Color.white);
//           minimize.setPreferredSize(new Dimension (x,y));
           Border r2= BorderFactory.createEtchedBorder(EtchedBorder.RAISED, Color.BLACK, Color.red);
     
           Border c3 = BorderFactory.createTitledBorder(
                    r2, "Minimieren",
                   TitledBorder.CENTER,
                   TitledBorder.TOP, fontA, z);
           minimize.addActionListener(new ListenerMINIMIZE());
           minimize.setBorder(c3);
           ding.add(minimize);
      
      
           try {
        		URL iconURL= new URL("https://img.icons8.com/ios-filled/2x/shrink.png");
        		 ImageIcon icon = new ImageIcon(iconURL);
        		 Image img = icon.getImage();
        		
        				 Image img2 = img.getScaledInstance(close.getWidth()-(close.getWidth()/3), close.getHeight()-(close.getHeight()/4),  java.awt.Image.SCALE_SMOOTH );
        				 ImageIcon icon2 = new ImageIcon(img2);
        				 minimize.setIcon(icon2);
        				 
        			    
        		
        		      
        	} catch (MalformedURLException e) {
        		// TODO Auto-generated catch block
        		e.printStackTrace();
        	}
           
           JButton menue1 = new JButton("<html><center>Überprüfe</center></html>");
   		menue1.setBounds(30, 300, 225, 80);
   		Font kram3 = new Font("Courier", Font.BOLD, 19);
   		menue1.setFont(kram3);
   		menue1.setBackground(Color.BLACK);
   		menue1.setForeground(new Color(32, 194, 14));
   		menue1.addActionListener(new ListenerAlpha());
   		Border bz0 = new LineBorder(Color.YELLOW);
     		TitledBorder br0 = new TitledBorder(bz0, "test");
     		Font kram6 = new Font("OCR A Extended", Font.ITALIC , 14);
     		TitledBorder title0 = BorderFactory.createTitledBorder(br0, "Enter drücken", TitledBorder.CENTER , TitledBorder.TOP, kram6, Color.WHITE);
     		menue1.setBorder(title0);
     		menue1.setFocusPainted(false);
     		UIManager.put("Button.select", Color.OPAQUE);
   		ding.add(menue1);
   		
           
           sammler2 = new JButton("Farbwechesel");
           sammler2.setBounds(530, 500, 200, 30);
           sammler2.setBackground(Color.WHITE);
           sammler2.setForeground(Color.BLACK);
           sammler2.addActionListener(new Listener0());
           sammler2.setFocusPainted(false);
           ding.add(sammler2);
           
           
           
           
           
           container.setLayout(null);
           container.add(ding);
           ding.setVisible(true);
           
      container.setVisible(true);
    
  }

  
  
  
  public static class Listener0 implements ActionListener{
      public void actionPerformed(ActionEvent e) {
         z = JColorChooser.showDialog(null, "Wählen Sie eine Hintergrundfarbe!", Color.WHITE);
        container.getContentPane().setBackground(z);
        ding.setBackground(z);
        Border r= BorderFactory.createEtchedBorder(EtchedBorder.RAISED, Color.BLACK, Color.red);
        Border c2 = BorderFactory.createTitledBorder(
                r, "Schließen",
               TitledBorder.CENTER,
               TitledBorder.TOP, fontA, z);
   
       close.setBorder(c2);
       
      
       minimize.setBorder(c2);
       minimize.setText("Minimieren");
      
        
        } 
    }
    
    public static class ListenerAlpha implements ActionListener{
      public void actionPerformed(ActionEvent e) {
//        .start();
  }
    }
    
    public static class ListenerBeta implements ActionListener{
      public void actionPerformed(ActionEvent e) {
//        .start();
        
      }
}
    
    
    
    public static class ListenerGamma implements ActionListener{
        public void actionPerformed(ActionEvent e) {
//          .start();
          
        }
  }
    public static class ListenerDelta implements ActionListener{
        public void actionPerformed(ActionEvent e) {
//          .start();
          
        }
  }
    public static class ListenerEpsilon implements ActionListener{
        public void actionPerformed(ActionEvent e) {
//          .start();
          
        }
  }
    public static class ListenerZeta implements ActionListener{
        public void actionPerformed(ActionEvent e) {
//          .start();
          
        }
  }
    public static class ListenerTheta implements ActionListener{
        public void actionPerformed(ActionEvent e) {
//          .start();
          
        }
  }
    public static class ListenerEta implements ActionListener{
        public void actionPerformed(ActionEvent e) {
//          .start();
          
        }
  }
    
    
    
public static void main (String args []) {
        
        
        Runnable r = () -> {
              new GUIJFrame();
          };
          SwingUtilities.invokeLater(r);
      
      
      
        
      }
    
    static AtomicInteger animationState3 = new AtomicInteger(0);
    
    static Timer timer3 = new Timer();
	

    static void runAnimation3() {

    	
        TimerTask task = new TimerTask() {
            public void run() {
         
                if (animationState3.get(
                    ) < 5000) {
                    animationState3.incrementAndGet();
         
              x=x-5;
              y=y-3;
              container.setSize(x, y);  
              container.setLocationRelativeTo(null);

                } 
                else {
                    cancel();
                }
                
            }
            
        };
   	 x= container.getContentPane().getWidth();
      y =container.getContentPane().getHeight();
        timer3.scheduleAtFixedRate(task, 1000, 2);
        try {
        Thread.sleep(2000);
      } catch (InterruptedException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      }
     container.dispose();
       
      
       
        
        
    } 
    
    
    
    
    
static AtomicInteger animationState4 = new AtomicInteger(0);
    
    static Timer timer4 = new Timer();
	private static int x;
	private static int y;
    

    static void runAnimation4() {

    	
        TimerTask task = new TimerTask() {
            public void run() {
         
                if (animationState4.get(
                    ) < 5000) {
                    animationState4.incrementAndGet();
   
              y=y-4;
              container.setSize(x, y);  
              container.setLocationRelativeTo(null);

                } 
                else {
                    cancel();
                }
                
            }
            
        };
   	 x= container.getContentPane().getWidth();
      y =container.getContentPane().getHeight();
        timer4.scheduleAtFixedRate(task, 1000, 2);
        
      
        
        try {
            Thread.sleep(2000);
          } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
          }
        
        container.setState(JFrame.ICONIFIED);
        
    } 
    public  static class ListenerCLOSE implements ActionListener{


      public void actionPerformed(ActionEvent e) {
        
        runAnimation3();
            
      }
      
    }
      public  static class ListenerMINIMIZE implements ActionListener{


          public void actionPerformed(ActionEvent e) {
            
            runAnimation4();
                
          }
        

    } 
      
    }
 
  


  
  