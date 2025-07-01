package Practica;

import javax.swing.JOptionPane;

public class sumaConJOption {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int valorA = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de 'A'"));
		int valorB = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de 'B'"));
		int sumatoria = valorA + valorB;
		JOptionPane.showMessageDialog(null, "La sumatoria de A y B es: " +sumatoria);
		

	}

}

