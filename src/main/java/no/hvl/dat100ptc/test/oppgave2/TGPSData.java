package main.java.no.hvl.dat100ptc.test.oppgave2;

import main.java.no.hvl.dat100ptc.oppgave1.GPSPoint;
import main.java.no.hvl.dat100ptc.oppgave2.GPSData;

public class TGPSData extends GPSData {

	public TGPSData(int n) {
		super(n);
	}
	
	public int getAntall() {
		return this.antall;
	}
	
	public boolean insertGPST(GPSPoint g) {
		return (insertGPS(g));
	}
}