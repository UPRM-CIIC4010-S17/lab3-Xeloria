import java.awt.Color;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Polygon;

import javax.swing.JPanel;
 
public class MyPanelClass extends JPanel {
            /**
	 * 
	 */
	private static final long serialVersionUID = 7057541440811488699L;

			public void paintComponent(Graphics g) {
                        super.paintComponent(g);
 
                        //Compute interior coordinates
                        Insets myInsets = this.getInsets();
                        int x1 = myInsets.left;
                        int y1 = myInsets.top;
                        int x2 = getWidth() - myInsets.right - 1;
                        int y2 = getHeight() - myInsets.bottom - 1;
                        int width = x2 - x1;
                        int height = y2 - y1;
 
                        //Paint the background
                        g.setColor(Color.WHITE);
                        g.fillRect(x1, y1, width + 1, height + 1);
                        
                        //Draw a border
                        g.setColor(Color.RED);
                        g.fillRect(x1, y1, width, y1 + 20);
                        
                        g.fillRect(x1, y1 + 40, width, y1 + 20);
                        
                        g.fillRect(x1, y1 + 80, width, y1 + 20);
                        
                       
                        
                        
//                        //Draw lines
//                        g.setColor(Color.RED);
//                        g.drawLine(x1, y1, x2, y2);
//                        
//                        g.setColor(Color.GREEN);
//                        g.drawLine(x1, height, width, y1);
//                        
//                        //Draw oval
//                        g.setColor(Color.BLUE);
//                        g.fillOval(width/2 - 27, height/2 - 27, 55, 55);
                        
                        
                        Polygon triangle = new Polygon();
                        triangle.addPoint(x1, y1);
                        triangle.addPoint(x1 + 115, height/2);
                        triangle.addPoint(x1, height);
                        
                        g.setColor(Color.BLUE);
                        g.fillPolygon(triangle);  
                        
                        Polygon star = new Polygon();
                        star.addPoint(x1 + 15, y1 + 43);
                        star.addPoint(x1 + 31, y1 + 43);
                        star.addPoint(x1 + 37, y1 + 28);
                        star.addPoint(x1 + 43, y1 + 43);
                        star.addPoint(x1 + 59, y1 + 43);
                        star.addPoint(x1 + 46, y1 + 53);
                        star.addPoint(x1 + 51, y1 + 68);
                        star.addPoint(x1 + 37, y1 + 58);
                        star.addPoint(x1 + 24, y1 + 68);
                        star.addPoint(x1 + 28, y1 + 53);
                        g.setColor(Color.WHITE);
                        g.fillPolygon(star);
                        
                        
                        
                        
                        
                        
                        
                        
                        
            }
}