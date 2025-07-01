package Practica;

import javax.swing.JOptionPane;

public class promedioNombreEdadPersona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nombre = JOptionPane.showInputDialog("Ingrese su nombre: ");
		int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su edad: "));
		
		double nota1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese nota 1: "));
		double nota2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese nota 2: "));
		double nota3 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese nota 3: "));
		
		double promedio = (nota1 + nota2 + nota3) / 3;
		JOptionPane.showConfirmDialog(null, "El promedio de " +nombre+ " es: " +promedio);
		JOptionPane.showConfirmDialog(null, "Y la edad de "+nombre+ " es: " +edad);

	}

}
