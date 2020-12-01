import java.awt.Color;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class JSliderGUI extends JFrame{
	
	JSlider sliderR, sliderG, sliderB;
	JLabel backgroundColorLbl;
	Color c, cR, cG, cB;
	
	public JSliderGUI() {
		
		setTitle("JSlider");
		setSize(600, 300);
		setLayout(null);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		
		sliderR = new JSlider(0, 255, 50);
		sliderR.setBounds(0, 210-getInsets().top, 300, 30);
		sliderR.setPaintTicks(false);
		sliderR.addChangeListener(new SliderHandler());
		add(sliderR);
		
		sliderG = new JSlider(0, 255, 50);
		sliderG.setBounds(0, 240-getInsets().top, 300, 30);
		sliderG.setPaintTicks(false);
		sliderG.addChangeListener(new SliderHandler());
		add(sliderG);
		
		sliderB = new JSlider(0, 255, 50);
		sliderB.setBounds(0, 270-getInsets().top, 300, 30);
		sliderB.setPaintTicks(false);
		sliderB.addChangeListener(new SliderHandler());
		add(sliderB);
		
		
		backgroundColorLbl = new JLabel();
		backgroundColorLbl.setBounds(0, 0, 200, 20);
		backgroundColorLbl.setText("R: "+sliderR.getValue()+", G: "+sliderR.getValue()+", B: "+sliderB.getValue());
		add(backgroundColorLbl);
		
	}

	private class SliderHandler implements ChangeListener{

		@Override
		public void stateChanged(ChangeEvent e) {
			backgroundColorLbl.setText("R: "+sliderR.getValue()+", G: "+sliderG.getValue()+", B: "+sliderB.getValue());
			c = new Color(sliderR.getValue(), sliderG.getValue(), sliderB.getValue(), 255);
			cR = new Color(sliderR.getValue(), 0, 0, 255);
			cG = new Color(0, sliderG.getValue(), 0, 255);
			cB = new Color(0,0, sliderB.getValue(), 255);
			getContentPane().setBackground(c);
			sliderR.setBackground(cR);
			sliderG.setBackground(cG);
			sliderB.setBackground(cB);
		}
		
	}
	

}


