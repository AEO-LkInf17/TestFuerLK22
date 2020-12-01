package Informatik;
import java.awt.Color;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.LinearGradientPaint;
import java.awt.RenderingHints;
import java.awt.geom.Point2D;
import java.util.HashMap;

import javax.swing.JLabel;

public class JMultiColorLabel

    extends JLabel
    {
    private static final String             STRING_OVERFLOW     = "...";

    
    private static float[] fracs = {0.0f, 0.2f, 0.4f, 0.6f, 0.8f, 1.0f};
    
    
    private HashMap<Integer, Color>     extraColors             = new HashMap<Integer, Color>();

    public JMultiColorLabel(String text)
        {
        super(text);
        }

    public void setColors(int[] indices, Color[] colors)
        {
        for (int i = 0; i < indices.length; i++)
            this.extraColors.put(indices[i], colors[i]);
        }

    protected void paintComponent(Graphics g)
        {
        // Get text-contents of Label
        String text = this.getText();

        // No text in the JLabel? -> No risk: super
        if (text == null || text.length() == 0)
            {
            super.paintComponent(g);
            return;
            }

        // Content Array of characters to paint
        char[] chars = text.toCharArray();

        // Draw nice and smooth
        Graphics2D g2d = (Graphics2D)g;
        g2d.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);

         // Draw background
        if (this.isOpaque())
          {
          g2d.setColor(this.getBackground());
          g2d.fillRect(0, 0, this.getWidth(), this.getHeight());
          }

        // FontMetrics to calculate widths and height
        FontMetrics fm = g2d.getFontMetrics();

        // Available space
        Insets ins = this.getInsets();
        int maxSpace = this.getWidth()-(ins.left+ins.right);
        boolean overflow = (fm.stringWidth(text) > maxSpace);

        // Starting offset
        int offset = ins.left+1;

       
        Point2D start = new Point2D.Float(10, 10);
        Point2D end = new Point2D.Float(50, 50);
        Color[] colors = {Color.magenta, Color.blue, Color.cyan,
            Color.green, Color.yellow, Color.red};
        LinearGradientPaint p = new LinearGradientPaint(start, end, fracs, colors);
        g2d.setPaint(p);
        // The start Color is the default
        g2d.setColor(this.getForeground());

        // Loop over characters
        for (int i = 0; i < chars.length; i++)
            {
                // Switch Color?
            if (this.extraColors.containsKey(i))
                g2d.setColor(this.extraColors.get(i));

                // Check if we still have enough room for this character
            if (overflow && offset >= (maxSpace-fm.stringWidth(STRING_OVERFLOW)))
                { // Draw overflow and stop painting
                g2d.drawString(STRING_OVERFLOW, offset, (fm.getHeight()+ins.top));
                return;
                }
            else // We have the space -> Draw the character
                g2d.drawString(String.valueOf(chars[i]), offset, (fm.getHeight()+ins.top));

                // Move cursor to the next horizontal position
            offset += fm.charWidth(chars[i]);
            }
        }
    }