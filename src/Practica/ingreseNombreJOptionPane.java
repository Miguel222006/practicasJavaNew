package Practica;

import javax.swing.JOptionPane;

public class ingreseNombreJOptionPane {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nombre ="";
		
		nombre = JOptionPane.showInputDialog("Ingrese su nombre:");
		
		JOptionPane.showMessageDialog(null, "El nombre ingresado es: "+nombre);

	}

}
