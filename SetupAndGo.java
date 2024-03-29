import java.awt.event.*;
import javax.swing.*;

public class SetupAndGo extends JPanel {
	private static final long serialVersionUID = 1516407881118770916L;

	private final Canvas canvas;
	
	private final JButton setup = new JButton("Flatten Waves");
	private final JButton start = new JButton("Start Wigglin'");
	
	public SetupAndGo (Canvas canvas) {
		this.canvas = canvas;
		setLayout( new RiverLayout() );
		setSize(200, 50);
		
		// Add event listeners.
		setup.addActionListener(new buttonListener());
		start.addActionListener(new buttonListener());
		
		// Add the buttons to the component.
		add("left",setup);
		add("br left", start);
	}
	
	private class buttonListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent ae) {
			JButton source = (JButton) ae.getSource();
			
			if (source == setup) {
				canvas.restart();
			} else if (source == start) {
				canvas.start();
			}
		}
	}
}
