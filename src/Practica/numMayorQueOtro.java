package Practica;

import javax.swing.JOptionPane;

public class numMayorQueOtro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer numero: "));
		int num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo numero: "));
		
		if (num1 > num2) {
			JOptionPane.showConfirmDialog(null, "El primer numero es mayor que el segundo numero");
			
		}else {
			JOptionPane.showConfirmDialog(null, "El segundo numero es mayor que el primero");
	}

	}
	}
