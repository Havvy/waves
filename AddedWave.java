import java.awt.*;

public class AddedWave {
	private Wave wave1;
	private Wave wave2;
	
	AddedWave(Wave w1, Wave w2) {
		wave1 = w1;
		wave2 = w2;
	}
	
	public void paint (Graphics g) {
		Graphics2D gfx = (Graphics2D) g;
		gfx.setStroke(new BasicStroke(3));
		gfx.setColor(new Color(0xCC, 0xCC, 0xFF));
		
		for (int ix = 0; ix < 499; ix++) {
			int y = (int) (wave1.points[ix] + wave2.points[ix]);
			// Why doesn't y2 work?
			int y2 = (int) (wave1.points[ix + 1] + wave2.points[ix + 1]);
			y += 198;
			y2 += 198;
			gfx.drawLine(ix, y, ix+1, y2);
		}
		gfx.drawLine(499, (int) (wave1.points[499] + wave2.points[499] + 198),
				499, (int) (wave1.points[499] + wave2.points[499]) + 198);
	}
}
