package program;

import java.util.Scanner;

public class acceuil_affichage {

	private static String firstName;
	private static String lastName;
	private static int numbre;
	private static int tarif;
	private static double tarifextra;
	
	 
	
	
	public static void main(String[] args) {

		 Scanner Var = new Scanner(System.in);
		 System.out.println("BienVenu Chez Nous ");
		 Var.nextLine();
       
        System.out.println("Quelle est votre prenome");
        firstName = Var.nextLine();
        
        System.out.println("Quelle est votre nom");
        lastName = Var.nextLine();
        System.out.println("Bienvenu " + firstName+ " "+ lastName );  // Output user input
        Var.nextLine();
        System.out.println("introduire le nombre d'heures travaillées");
        numbre= Var.nextInt();
        
        if(numbre < 60) {
        	 tarif = numbre * 100;
        	  if(numbre <=40){
        		  tarif = numbre * 100;
        		  System.out.println(" votre indemnisation est de" + tarif + "MAD");
        		  }
    		
    	  else {
    		  tarifextra = (tarif) + 0.5 *(tarif);
    		  System.out.println(" votre indemnisation est de" + tarifextra + "MAD");
    	  }
        	  
        }
        else {
        	
        	 System.out.println("informations erronés !");
        }
        Var.close();
      }
}
