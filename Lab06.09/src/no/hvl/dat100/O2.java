package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class O2 {
	public static void main (String[] args) {
		for (int student = 1; student <=10; student++) {
		String karakter = showInputDialog ("Oppgi poengsum : ");
		int poengsum = parseInt(karakter);
		String ksum = "Ugyldig poengsum";
		
		if (poengsum <= 100 && poengsum >= 90) {
			ksum = "A";
			showMessageDialog(null, "Karakter : " +ksum);
		} else if (poengsum <= 89 && poengsum >= 80) {
			ksum = "B";
			showMessageDialog(null, "Karakter : " +ksum);
		} else if (poengsum <= 79 && poengsum >= 60) {
			ksum = "C";
			showMessageDialog(null, "Karakter : " +ksum);
		} else if (poengsum <= 59 && poengsum >= 50) {
			ksum = "D";
			showMessageDialog(null, "Karakter : " +ksum);
		} else if (poengsum <= 49 && poengsum >= 40) {
			ksum = "E";
			showMessageDialog(null, "Karakter : " +ksum);
		} else if (poengsum <= 39 && poengsum >= 0) {
			ksum = "F";
			showMessageDialog(null, "Karakter : " +ksum);
		}else {
		showMessageDialog(null, ksum);
		student = student-1;
}}}}