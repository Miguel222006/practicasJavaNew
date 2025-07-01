package Practica;

import javax.swing.JOptionPane;

public class promedioNotaConJOption {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nombre = JOptionPane.showInputDialog("Ingresa tu nombre: ");
		int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad de: "+nombre));
		double nota1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la primera nota:"));
		double nota2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la segunda nota: "));
		double nota3 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la tercera nota: "));
		double promedio = (nota1 + nota2 + nota3) / 3;
		JOptionPane.showMessageDialog(null, "El promedio de " +nombre + " es: " +promedio);
		
	}

}
