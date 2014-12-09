package modelo;

import java.text.DecimalFormat;

public class PruebaConversor {

	public static void main(String[] args) {
		Conversor conversor = new Conversor();
		/*
		 * double millas = 3; double km = conversor.millaskm(millas);
		 * System.out.println(millas + " Millas equivalen a: " + km + " Km"); km
		 * = 120.0; millas = conversor.millaskm(km); System.out.println(km +
		 * "Km equivalen a: " + millas + " millas");
		 */

		double resultado;
		for (int i = 10; i <= 120; i += 10) {
			resultado = conversor.millaskm((double) i);
			DecimalFormat formatoKm = new DecimalFormat("##00.00");
			String kmFormateados = formatoKm.format(resultado);
			System.out.println(i + " millas ----> " + kmFormateados + " Km");
		}

	}

}
