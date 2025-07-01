package Practica;

import javax.swing.JOptionPane;

public class siPositivoIndique {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));
		
		if (numero > 0) {
			JOptionPane.showInternalMessageDialog(null, "El numero es positivo");
			
		}

	}

}
