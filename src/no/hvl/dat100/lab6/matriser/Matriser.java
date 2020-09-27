package no.hvl.dat100.lab6.matriser;

public class Matriser {

	// a)
	public static void skrivUt(int[][] matrise) {

		for (int[] vannrett : matrise) {
			for (int loddrett : vannrett) {
				System.out.print(loddrett);
			}
			System.out.println();
		}
	}

	// b)
	public static String tilStreng(int[][] matrise) {
		
		String streng = "";
		for (int[] i : matrise) {
			for (int j : i) {
				streng += j + " ";
			}
			streng += "\n";
		}
		return streng;

	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {

		for (int i = 0; i < matrise.length; i++) {
			for (int j = 0; j < matrise[i].length; j++) {
				matrise[i][j] *= tall;
			}
		}
		return matrise;
	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {
		
		boolean lik = true;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				while(j<a[i].length) {
					if(a[i][j]==b[i][j])
						j++;
					else return false;
				}
			}
		}
		return lik;
	}

	// e)
	public static int[][] speile(int[][] matrise) {

		// TODO
		throw new UnsupportedOperationException("speile ikke implementert");

	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {

		// TODO
		throw new UnsupportedOperationException("multipliser ikke implementert");

	}
}
