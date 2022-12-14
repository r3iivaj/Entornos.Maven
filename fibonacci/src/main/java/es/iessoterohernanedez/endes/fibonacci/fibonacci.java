package es.iessoterohernanedez.endes.fibonacci;

import java.util.*;

public class fibonacci 
{
	private Scanner sc;

	public void mostrarFibonacci (){
		sc = new Scanner(System.in);
		int num;
		int a = 0,b=1,c;
	System.out.println("Cuantos numeros quieres ver de fibonacci?");
	num = sc.nextInt();
		for (int i = 0;i<=num;i++) {
			c = a+b;
			System.out.print(c+ ", ");
			c = a+b;
			a = b;
			b = c;
		}
	}
}
