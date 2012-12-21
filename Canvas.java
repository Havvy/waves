import java.awt.*;
import javax.swing.*;

public class Canvas extends JPanel {
	private static final long serialVersionUID = -3579073821580694058L;
	
	private float time = 0;
	private final Wave topWave;
	private final Wave bottomWave;
	private final AddedWave addedWave;
	
	public Canvas (Wave topWave, Wave bottomWave) {
		this.setPreferredSize(new Dimension(550, 500));
		setSize(500, 500);
		setBorder(BorderFactory.createRaisedBevelBorder());
		this.topWave = topWave;
		this.bottomWave = bottomWave;
		addedWave = new AddedWave(topWave, bottomWave);
	}
	
	public void paint (Graphics gfx) {
		topWave.paint(gfx);
		bottomWave.paint(gfx);
		addedWave.paint(gfx);
		time += 0.001;
		bottomWave.update(time);
		topWave.update(time);
	}
	
	public Wave getWave () {
		return topWave;
	}

	public void restart() {
		// TODO
	}
	
	public void start() {
		// TODO
	}
	
}