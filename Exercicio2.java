package Exerc�ciosJava0410;

import java.util.Scanner;

public class Exerc�cio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

int a,b,c;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("\nEntre com A: ");
		a = leia.nextInt();
		System.out.println("\nEntre com B: ");
		b = leia.nextInt();
		System.out.println("\nEntre com C: ");
		c = leia.nextInt();
		
		if(a<=b && b<=c)
		{
			System.out.println("\nOrdem crescente: "+a+" , "+b+" , "+c);		
		}
		else if(a<=c && c<=b)
		{
			System.out.println("\nOrdem crescente: "+a+" , "+c+" , "+b);
		}
		else if(b<=a && a<=c)
		{
			System.out.println("\nOrdem crescente: "+b+" , "+a+" ,"+c);
		}
		else if(b<=c && c<=a)
		{
			System.out.println("\nOrdem crescente: "+b+" , "+c+" , "+a);
		}
		else if(c<=a && a<=b)
		{
			System.out.println("\nOrdem crescente: "+c+" , "+a+" , "+b);
		}
		else
		{
			System.out.println("\nOrdem crescente: "+c+" ,"+b+" , +a");
		}
	}

}
