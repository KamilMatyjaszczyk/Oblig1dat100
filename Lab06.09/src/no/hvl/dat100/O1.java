package no.hvl.dat100;

import static java.lang.Integer.*;
import static javax.swing.JOptionPane.*;

public class O1 {
	public static void main (String[] args) {
		
		String tall = showInputDialog ("Oppgi lønn:");
		int lonn = parseInt(tall);
		int nr = 0;
		double skatt = 0;
				
		// trinn 0
		if (lonn >= 0 && lonn <= 190349) {
			nr = 0 ;
			skatt = 0;
			
		// trinn 1
		} else if (lonn >= 190350 && lonn <= 267899) {
			nr = 1;
			skatt = 0.017;
			
		// trinn 2
		}	else if (lonn >= 267900 && lonn <= 643799) {
			nr = 2;
			skatt = 0.04;
			
		// trinn 3
		} else if (lonn >= 643800 && lonn <= 969199) {
			nr = 3;
			skatt = 0.134;
			
		// trinn 4
		} else if (lonn >= 969200 && lonn <= 1999999) {
			nr = 4;
			skatt = 0.164;
			
			// trinn 5
		} else if (lonn >= 2000000) {
			nr = 5;
			skatt = 0.174;
		
		} else {
			showMessageDialog(null, "Bruk av negative tall vil gi ugyldig svar!");
		}
		String svar1= "Lønnen din klasseres trinn: " + nr;
		String skattbetal = "Du må betale: " + lonn*skatt + " i skatt";
		showMessageDialog(null, svar1);
		showMessageDialog(null, skattbetal);
			
}
}