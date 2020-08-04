public class Prueba{
	public static void Sumar(int a, int b){
		int c;		
		c=a+b;
		System.out.println("El resultado de la suma es: "+c);
	}
	
	public static int Restar(int a, int b){
		int c;		
		c=a-b;
		return c;
	}
	
	public static void main(String[] args){
		Sumar(15,20);
		int resta=Restar(35,26);
		System.out.println("El resultado de la resta es: "+resta);
	}
}

