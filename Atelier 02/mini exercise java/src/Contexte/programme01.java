package Contexte;

import java.util.Scanner;

public class programme01 {

	public static void main(String[] args) {

        Scanner Var = new Scanner(System.in);
        System.out.println("Quelle est votre prenome");

        String userName = Var.nextLine();
        System.out.println("bounjour: " + userName);  // Output user input
        Var.close();
      }
}
