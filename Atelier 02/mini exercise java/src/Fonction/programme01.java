package Fonction;

import java.util.Scanner;

public class programme01 {
        private static String firstName;
        private static String lastName;
        private static String Age;
        
    	public static void main(String[] args) {

            Scanner Var = new Scanner(System.in);
            System.out.println("Quelle est votre prenom");
            firstName = Var.nextLine();
            System.out.println("Quelle est votre nom");

            lastName = Var.nextLine();
            System.out.println("Quelle est votre  age");

            Age = Var.nextLine(); 
            
       
            System.out.println("Bounjour " +   firstName  +   lastName  + ",tu as " + Age +" ans");  // Output user input
            Var.close();
          
    	}
 }
