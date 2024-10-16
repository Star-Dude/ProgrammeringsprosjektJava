package main.java.no.hvl.dat100ptc.oppgave5;

import javax.swing.JOptionPane;

import easygraphics.EasyGraphics;
import main.java.no.hvl.dat100ptc.TODO;
import main.java.no.hvl.dat100ptc.oppgave1.GPSPoint;
import main.java.no.hvl.dat100ptc.oppgave2.GPSData;
import main.java.no.hvl.dat100ptc.oppgave2.GPSDataFileReader;
import main.java.no.hvl.dat100ptc.oppgave3.GPSUtils;
import main.java.no.hvl.dat100ptc.oppgave4.GPSComputer;

public class ShowSpeed extends EasyGraphics {
			
	private static int MARGIN = 50;
	private static int BARHEIGHT = 100; 

	private GPSComputer gpscomputer;
	
	public ShowSpeed() {

		String filename = JOptionPane.showInputDialog("GPS data filnavn: ");
		gpscomputer = new GPSComputer(filename);
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}

	public void run() {

		makeWindow("Speed profile", 
				2 * MARGIN + 
				2 * gpscomputer.speeds().length, 2 * MARGIN + BARHEIGHT);
		
		showSpeedProfile(MARGIN + BARHEIGHT);
	}
	
	public void showSpeedProfile(int ybase) {
		
		int x = MARGIN,y;
	
		// TODO
		throw new UnsupportedOperationException(TODO.method());
		
	}
}
