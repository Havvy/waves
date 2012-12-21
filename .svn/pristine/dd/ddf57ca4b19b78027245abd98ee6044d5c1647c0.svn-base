import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;

import javax.swing.*;

/**
 * 
 * @author havvy, r.dean, l.kartashev
 *
 */
public class Window extends JFrame {
	private static final long serialVersionUID = -8255319694373975038L;
	static final Color BG = new Color(0x00, 0x00, 0x00);

	public Window (Wave topWave, Wave bottomWave) {
		Options topOptions = new Options(topWave);
		Options bottomOptions = new Options(bottomWave);
		Canvas canvas = new Canvas(topWave, bottomWave);
		// SetupAndGo buttons = new SetupAndGo(canvas);
		Container container = getContentPane();
		
		container.setBackground(Window.BG);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(1100, 500);
		setResizable(false);
		setTitle("Waves");
		setLayout(new RiverLayout());
		
		JPanel 	left = new JPanel();
				left.setBackground(BG);
				left.setPreferredSize(new Dimension(220,550));
			//	left.add(buttons);
				left.add(topOptions);
		
		container.add("left", left);
		container.add("left", canvas);
		container.add("left bottom", bottomOptions);
		
		setVisible(true);
	}
	
	public static void main (String[] argv) {
		Wave topWave = new Wave(Color.PINK, true);
		Wave bottomWave = new Wave(Color.ORANGE, false);
		
		Window window = new Window(topWave, bottomWave);
		
		while (true) {
			window.repaint();
		}
	}
}
