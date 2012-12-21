import static java.lang.Math.*;
import java.awt.*;
import java.util.Arrays;

public class Wave {
	private float amplitude = 50;
	private float frequency = 0;
	private boolean direction;
	float points[];
	private Color color;
	
	public float[] getPoints() {
		return points;
	}

	public Wave (Color c, boolean dir) {
		points = new float[500];
		points[0] = amplitude;
		color = c;
		direction = dir;
	}
	
	public double height (int x, float time) {
		double k = .05;
		if (direction) {
			return amplitude * cos(frequency * time - k * x);
		} else {
			return amplitude * cos(frequency * time + k * x);
		}
	}
	
	public void setAmplitude (float newAmplitude) {
		amplitude = newAmplitude;
	}

	public void setFrequency (float newFrequency) {
		frequency = newFrequency;
	}
	
	public boolean isInverted () {
		return !direction;
	}
	
	public void setDirection (boolean dir) {
		direction = dir;
	}
	
	public Color getColor(){
		return color;
	}
	
	public void paint (Graphics g) {
		Graphics2D gfx = (Graphics2D) g;
		gfx.setStroke(new BasicStroke(3));
		gfx.setColor(color);
		for(int ix = 0; ix < points.length-1; ix++) {
			gfx.drawLine(ix, (int)points[ix]+99, ix, (int)points[ix+1]+99);
		}
		gfx.drawLine(499, (int)points[499]+99, 499, (int)points[499]+99);
	}
	
	public void update (float time) {
		for(int ix=0; ix < points.length; ix++){
			points[ix] = (float)height(ix, time);
		}
	}
	
}
