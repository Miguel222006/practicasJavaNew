package Practica;

import javax.swing.JOptionPane;

public class mayorEdad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su edad: "));
		
		if (edad < 18) {
			JOptionPane.showMessageDialog(null, "Usted es menor de edad");
			
		}else {
			JOptionPane.showMessageDialog(null, "Usted es mayor de edad");
		}

	}

}
