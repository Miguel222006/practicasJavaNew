package Practica;

public class operadoresLogicos {
	public static void main(String[] args) {
		
		int x = -1;
		
		boolean operacion1 = (x>0 && x<=6);
		System.out.println(operacion1);
		
		int a = -1;
		boolean operacion2 = (a<0 || a>6);
		System.out.println(operacion2);
		
		int b = 4;
		boolean operacion3 =! (b<0);
		System.out.println(operacion3);
		
		int c =2 ;
		int d =7 ;
		boolean operacion4 = (c ++ != c ++);
		System.out.println(operacion4);
		
		int e =19 ;
		boolean operacion5 = (7>10 || 10>2&& 3==4);
		System.out.println(operacion5);
		
		int y = 5;
		boolean f = (y>4)&&(y<7);
		System.out.println(f);
	}

}
