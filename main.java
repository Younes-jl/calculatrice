package first_project_java;

import java.util.Scanner;
public class main {
	
	public	static void main(String [] args)
	{
		double a;
		double b;
		Scanner s=new Scanner(System.in);
		System.out.println("hello Younes ");
		
		System.out.println("entrer le premier nombre");
		a=s.nextDouble();
		System.out.println("entrer la deuxieme nombre");
		b=s.nextDouble();
	    double somme=a+b;
		System.out.println("la somme est:"+somme);
		
		double sou=a-b;
		System.out.println("la soustraction est:"+sou);
		
		double div=0;
		
		if(a>b)
			div=a/b;
		else
			System.out.println("les nombre sont invalid");
			
			
		
		System.out.println("la division est:"+div);
		
		double prod=a*b;
		System.out.println("la produit est:"+prod);
		
		double mod=a%b;
		System.out.println("la modulo est:"+mod);
		
		System.out.println("le maximum est:"+Math.max(a,b));
        
		double min=Math.min(a, b);
		System.out.println("le minimum est :"+min);
		
		System.out.println("*********************************************");
		
		if(a<0&&b<0)
		{
			System.out.println("le racine caree de a est :"+Math.sqrt(Math.abs(a)));
			System.out.println("le racine caree de b est :"+Math.sqrt(Math.abs(b)));
			
			
		}
		else
		{
			System.out.println("le racine caree de a est :"+Math.sqrt(a));
			System.out.println("le racine caree de b est :"+Math.sqrt(b));
			
		}
		
		System.out.println("*****************************************");
		System.out.println("la puissance de deux nombre est :"+Math.pow(a, b));
	
		
		
	
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	

}
