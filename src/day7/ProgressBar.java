package day7;

import javax.swing.JPanel;
import javax.swing.JProgressBar;

public class ProgressBar extends JPanel{
	public JProgressBar jbar;
	private int MAX;
	private int MIN;
	
	private int barValue;
	
	public ProgressBar(int start, int stop){ 
		MAX = stop;
		MIN = start;
		barValue = MIN;
		jbar = new JProgressBar();
		jbar.setMaximum(MAX);
		jbar.setMinimum(MIN);
		add(jbar);
	}
	
	public void updateBar(int value){
		barValue = value;
		jbar.setValue(barValue);
	}
	
	public void incrementBar(){
		barValue++;
		jbar.setValue(barValue);
	}
}

