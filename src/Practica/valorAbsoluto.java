package Practica;

import javax.swing.JOptionPane;

public class valorAbsoluto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));
		
		int absoluto = numero ;
		
		if (numero < 0) {
			absoluto = numero * -1;
			
		}
		JOptionPane.showMessageDialog(null, "El valor absoluto de " +numero+ " es: "+absoluto);
		

	}

}
