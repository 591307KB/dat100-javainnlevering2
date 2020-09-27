package no.hvl.dat100.lab5.tabeller;

public class Tabeller {

	public static void main(String[] args) {
		finnTall(); // d)
	}

	// a)----------------------------------------------------------
	public static void skrivUt(int[] tabell) {

		for (int i = 0; i < tabell.length; i++) {
			int tall = tabell[i];
			System.out.println(tall + " ");
		}
	}

	// b)----------------------------------------------------------
	public static String tilStreng(int[] tabell) {

		String streng = "[";
		for (int i = 0; i < tabell.length ; i++) {
			if (i == tabell.length - 1)
				streng += tabell[i] + "]";
			else
				streng += tabell[i] + ",";
		}
		return streng;

	}

	// c)----------------------------------------------------------
	public static int summer(int[] tabell) {

		int sum = 0;
		for (int i = 0; i < tabell.length; i++) {
			sum += tabell[i];
		}
		return sum;
	}

	public static int[] summer1(int[] tabell) {

		int nr = 0;
		int[] sum1 = new int[1];
		while (nr < tabell.length) {
			sum1[0] += tabell[nr];
			nr++;
		}
		return sum1;

	}

	public static int[] summer2(int[] tabell) {

		int[] sum2 = new int[1];
		for (int nr : tabell)
			sum2[0] += nr;
		return sum2;
	}

	

	// d)----------------------------------------------------------
	public static void finnTall() {
		int[] rekke = {5,3,7,3,1};
		int zahl = 7;
		System.out.println(finnesTall(rekke, zahl));
	}
	
	public static boolean finnesTall(int[] tabell, int tall) {

		boolean lik = false;
		int i = 0;
		while (!lik && i < tabell.length) {
			if (tabell[i] == tall)
				return lik = true;
			else
				i++;
		}
		return lik = false;
	}

	// e)----------------------------------------------------------
	public static int posisjonTall(int[] tabell, int tall) {
		
		int ellers = -1;
		for (int i=0; i<tabell.length; i++) {
			if (tabell[i]==tall) {
				return i;
			}
		}
		return ellers;

	}

	// f)----------------------------------------------------------
	public static int[] reverser(int[] tabell) {

		int[] reversert = new int[tabell.length];
		for (int i = 0; i < tabell.length; i++) {
			reversert[tabell.length - (i+1)] = tabell[i];
		}
		return reversert;
	}

	// g)----------------------------------------------------------
	public static boolean erSortert(int[] tabell) {
		boolean sortert = true;
		int i=1;
		while (sortert && i<tabell.length) {
			if (tabell[i-1]<tabell[i]) 
				i++;
			else
				sortert=false;
		}
		
		return sortert;
	}

	// h)----------------------------------------------------------
	public static int[] settSammen(int[] tabell1, int[] tabell2) {

		int[] sammensatt = new int[tabell1.length + tabell2.length];
		for (int i = 0; i < tabell1.length; i++) {
			sammensatt[i]=tabell1[i];
		}
		for (int j = tabell1.length; j < sammensatt.length; j++) {
			sammensatt[j]=tabell2[j-tabell1.length];
		}
		return sammensatt;
	}
}
