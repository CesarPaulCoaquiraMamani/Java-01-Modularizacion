import java.util.Scanner; 
public class Prueba1 { 
 Scanner dato=new Scanner(System.in); 
 public void multiplicar(int n1){
System.out.println("Ingrese el numero");
  n1 = dato.nextInt(); 
 for(int a=1;a<=12;a++){ 
 int resul=a*n1;  
System.out.println(" � "+ a + " x " +n1+ " = " +resul); 
 } 
 } 
public static void main(String[]args){
 Prueba1 tabla = new Prueba1();
 tabla.multiplicar(0); 
} 
}


