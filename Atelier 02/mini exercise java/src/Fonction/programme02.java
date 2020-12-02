package Fonction;

import java.util.Scanner;

public class programme02 {
    
	private static String Genre;
	private static int Age;
	
	
  	public static void main(String[] args) {
  		 
  		  
  	  Scanner scanner= new Scanner(System.in);
  	  System.out.println("tu es un homme ou une femme ");
  	  Genre= scanner.nextLine();
  	  
  	  System.out.println("Votre Age s'il vous plait :");
  	  Age= scanner.nextInt();
  	   
  	  if(Age < 18) {
  		  System.out.println("Vous etes (un/une)" + Genre + "mineur");
  	  }
  	  else {
  		  System.out.println("vous etes " + Genre + " majeur");
  	  }
  	  scanner.close();
  		
  	}
}
