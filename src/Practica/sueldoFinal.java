package Practica;

public class sueldoFinal {
	public static final double PORCENTAJE_AUMENTO = 0.3;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double sueldoBase = 1000;
		double aumento = sueldoBase * PORCENTAJE_AUMENTO;
		double sueldoFinal = sueldoBase + aumento;
		
		System.out.println("Sueldo base: $"+sueldoBase);
		System.out.println("Aumento: $"+aumento);
		System.out.println("sueldo final: $"+sueldoFinal);

	}

}
