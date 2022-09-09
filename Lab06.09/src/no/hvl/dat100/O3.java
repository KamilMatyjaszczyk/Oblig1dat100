package no.hvl.dat100;

import static java.lang.Integer.*;
import static javax.swing.JOptionPane.*;

public class O3 {

		public static void main(String[] args) {
			int i = 1;
			int f = 1;
			String tall = showInputDialog ("Oppgi tall : ");
			int n = parseInt(tall);	
			for(i= 1; i <= n; i++) {
				f = f*i;}
			showMessageDialog (null, "Fakultetet til " +n + " = " +f);
}
}