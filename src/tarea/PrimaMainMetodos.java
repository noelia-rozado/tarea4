package tarea;

import java.util.Scanner;

/**
 * <h1>APLICACI�N PARA CALCULAR PRIMAS</h1>
 * <p>Calcula las primas de los empleados de una empresa seg�n una serie de par�metros, 
 * los cuales se solicitan por teclado.</p>
 * <p><strong>Fecha:</strong></p>
 * <p>marzo de 2022</p>
 * @author Noelia Rozado
 * @version 1.0
 */
public class PrimaMainMetodos {
	
	static Scanner  teclado=new Scanner(System.in);
	
	/**
	 * M�todo que calcula las primas de los empleados.
	 */
	public static void main(String[] args) {

		int numEmple;
		String nomEmple;
		int meses;
		char esDirectivo;
		char respuesta;

		do {
			System.out.println("\nDATOS  EMPLEADO/A");
			numEmple=leerNumEmple();
			nomEmple=leerNomEmple();
			meses=leerMeses();
			esDirectivo=leerEsDirectivo();
			System.out.println("\n\tLe corresponde la prima "+hallarPrima(esDirectivo, meses));
					
			System.out.println("\n�CALCULAR MAS PRIMAS? (S/N): ");
			respuesta=teclado.nextLine().toUpperCase().charAt(0);
		}while(respuesta=='S');		
	}

	/**
	 * M�todo que halla el tipo de prima.
	 * @param esDirectivo Indica si el empleado es un directivo o no.
	 * @param meses Almacena el n�mero de meses de antig�edad del empleado.
	 * @return P1 si es directivo y tiene una antig�edad mayor o igual de 12 meses; P2 si es directivo y tiene 
	 * una antig�edad menor de 12 meses; P3 si no es directivo y tiene una antig�edad mayor o igual de 12 meses; y P4
	 * si no es directivo y tiene una antig�edad menor de 12 meses.
	 */
	public static String hallarPrima(char esDirectivo, int meses) {
		if(esDirectivo=='+') // ES DIRECTIVO
			if(meses>=12)
				return "P1";
			else
				return "P3";
		else 	// NO ES DIRECTIVO
			if(meses>=12)
				return "P2";
			else
				return "P4";
	}

	/**
	 * M�todo que lee por teclado el n�mero del empleado.
	 * @return Un entero con el n�mero del empleado.
	 */
	public static int leerNumEmple() {		
		int numEmple;
		do{
			System.out.println("N�MERO [100-999]: ");
			numEmple = teclado.nextInt();
		}while(numEmple<100 || numEmple>999);		
		teclado.nextLine();
		return numEmple;
	}
	
	/**
	 * M�todo que lee por teclado el nombre del empleado.
	 * @return Una cadena con el nombre del empleado.
	 */
	public static String leerNomEmple() {
		String nomEmple;
		do {
			System.out.println("NOMBRE (max 10 caracteres): ");
			nomEmple = teclado.nextLine();
		}while(nomEmple.length()>10);		
		return nomEmple;
	}

	/**
	 * M�todo que lee por teclado la antig�edad del empleado.
	 * @return Un entero con el n�mero de meses de antig�edad del empleado.
	 */
	public static int leerMeses() {
		int meses;
		do {
			System.out.println("MESES DE TRABAJO: ");
			meses = teclado.nextInt();
		}while(meses<0);
		teclado.nextLine();
		return meses;
	}

	/** M�todo que lee por teclado si un empleado es directivo o no.
	 * @return + si es directivo y - si no es directivo.
	 */
	public static char leerEsDirectivo() {
		char esDirectivo;
		do {
			System.out.println("�ES DIRECTIVO? (+/-): ");
			esDirectivo = teclado.nextLine().charAt(0);
		}while(esDirectivo!='+' && esDirectivo!='-');
		return esDirectivo;
	}
}
