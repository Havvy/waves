import java.awt.*;
import java.text.DecimalFormat;
import javax.swing.*;
import javax.swing.event.*;

public class Options extends JPanel {
	private static final long serialVersionUID = -3230902972827554859L;
	
	private final Wave wave;

	private final JSlider amplitude = new JSlider(0, 99);
	private final JLabel currentAmplitude = new JLabel("Amplitude: 50");
	private final JSlider frequency = new JSlider(0, 200);
	private final JLabel currentFrequency = new JLabel ("Frequency: 5.0");
	private final JCheckBox direction = new JCheckBox("Reverse Direction");
		
	public Options (Wave wave) {
		// Set the canvas.
		this.wave = wave;
		
		setLayout(new RiverLayout());
		setBackground(Window.BG);
		
		// Add event listeners.
		amplitude.addChangeListener(new sliderListener());
		frequency.addChangeListener(new sliderListener());
		direction.addChangeListener(new directionListener());
		
		// Set the size of the options pane (200 by 500 pixels)
		this.setSize(200, 300);
		
		// Add the amplitude slider.
		currentAmplitude.setForeground(wave.getColor());
		add(currentAmplitude);
		amplitude.setMajorTickSpacing(10);
		amplitude.setPaintTicks(true);
		amplitude.setBackground(Window.BG);
		this.add("br", amplitude);
		
		// Add the frequency slider.
		currentFrequency.setForeground(wave.getColor());
		add("br", currentFrequency);
		frequency.setMajorTickSpacing(20);
		frequency.setPaintTicks(true);
		frequency.setValue(2);
		frequency.setBackground(Window.BG);
		add("br", frequency);
		
		direction.setBackground(Window.BG);
		direction.setForeground(wave.getColor());
		if (wave.isInverted()) {
			direction.setSelected(true);
		}
		add("br", direction);		
	}
		
	private class sliderListener implements ChangeListener {
		final private DecimalFormat df = new DecimalFormat("#.##");
		
		@Override
		public void stateChanged(ChangeEvent ce) {
			JSlider source = (JSlider) ce.getSource();
			
			if (source == amplitude) {
				currentAmplitude.setText("Amplitude: " + amplitude.getValue());
				wave.setAmplitude(amplitude.getValue());
			} else if (source == frequency){
				currentFrequency.setText("Frequency: " + df.format(frequency.getValue()*.01));
				wave.setFrequency(frequency.getValue());
			}
		}
	}
	
	private class directionListener implements ChangeListener {
		@Override
		public void stateChanged(ChangeEvent ce) {
			wave.setDirection(!((JCheckBox) ce.getSource()).isSelected());
		}
	}
}