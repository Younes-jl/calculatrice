package first_project_java;


import java.util.Scanner;

public class Calculatrice {
	
	public static void Operation(double num1,double num2, char operateur)
	{
		
		switch(operateur)
		{
		case '1':
			 double somme=num1+num2;
				System.out.println("la somme est:"+somme);
				break;
		case '2':
			 double soustraction=num1-num2;
				System.out.println("la soustraction est:"+soustraction);
				break;
		case '3':
			double produit=num1*num2;
			System.out.println("le produit est:"+produit);
			break;
		
			
		case '4':	
			double division=num1/num2;
			System.out.println("la division est:"+division);
			break;
			
		case '5':
			double modulo=num1%num2;
			System.out.println("le modulo est:"+modulo);
			break;
			
		default:
			System.out.println(" hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh:");
		
		}
		
		
	}
		
	
	
	
	
		public static void main(String [] args)
		{
			
			char choix;
			
			Scanner s=new Scanner(System.in);
			do {
				
				
			
			System.out.println("*****************Calculatrice******************");
			
			System.out.println("1-Somme");
			System.out.println("2-Soustraction");
			System.out.println("3-produit");
			System.out.println("4-dividion");
			System.out.println("5-Modulo");
			System.out.println("0-Exit");
			
			
			
			
			
			System.out.print("Entrer votre option :"+" ");
			 choix=s.next().charAt(0);
			 
			 if(choix>= '1' && choix<='5')
			 {
				 
				 
		        System.out.print("entrer le premier nombre");
			    double num1=s.nextDouble();
			    System.out.print("entrer la deuxieme nombre");
			    double num2=s.nextDouble();
			
			
		        Operation(num1,num2,choix);
		    
			 }
			 else if(choix!='0')
			 {
				 System.out.println("Opuuuuuuuuuuuuuution invalide");
			 }
			 
			 
			 
			
		
			
			}while(choix!='0');
			
			System.out.println("***************Programme termine***********************");
			
			s.close();
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		}
		
	
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
