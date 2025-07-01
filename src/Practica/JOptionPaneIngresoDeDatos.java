package Practica;
import javax.swing.JOptionPane;

public class JOptionPaneIngresoDeDatos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nombre = JOptionPane.showInputDialog("Ingresa tu nombre");
		int opcion = JOptionPane.showConfirmDialog(null, "¿Desea guardar los cambios?", "GuardarCambios", JOptionPane.YES_NO_CANCEL_OPTION);
		System.out.println(nombre);
		System.out.println(opcion);

	}

}


