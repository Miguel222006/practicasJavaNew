package Practica;

import javax.swing.JOptionPane;

public class calcularPorcentajeDeNumIngresado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int porc = 15;
		int valor = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));
		int porcFinal = (valor * porc) / 100;
		
		JOptionPane.showConfirmDialog(null, "El " +porc+ "% de " + valor + " es:" +porcFinal);

	}

}
