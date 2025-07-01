package Practica;

import javax.swing.JOptionPane;

public class gananciasEmpleado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nombre = JOptionPane.showInputDialog("Ingrese el nombre del empleado: ");
		int documento = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de identificacion del empleado: "));
		
		int horas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese las horas trabajadas: "));
		double salarioBruto = horas * 2000;
		double impuestoSeguridad = salarioBruto * 0.1;
		double salarioNeto = salarioBruto - impuestoSeguridad;
		JOptionPane.showConfirmDialog(null, "El salario neto del empleado " +nombre+ " con identificacion "+documento+ " es: "+salarioNeto);
		JOptionPane.showConfirmDialog(null, "El descuento realizado por impuesto de seguridad fue de: " +impuestoSeguridad);
		

	}

}

