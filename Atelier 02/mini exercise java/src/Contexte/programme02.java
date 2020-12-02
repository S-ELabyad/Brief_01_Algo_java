package Contexte;

import java.util.Scanner;

public class programme02 {
	
	public static void main (String[] args) {
		
		double oldPrice, newPrice, TVA,numberOfItem, total;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Créer le prix HT d'un article: ");
		oldPrice = scanner.nextDouble();
		System.out.println("Créer le pourcentage de TVA :");
		TVA = scanner.nextDouble();
		System.out.println("Créer le nombre des articles:");
		numberOfItem = scanner.nextDouble();
		
		newPrice = oldPrice +(oldPrice * TVA /100);
		total = newPrice * numberOfItem;
		
		System.out.println("Le prix d'un article TTC est : " + newPrice);
		System.out.println("Le Total est: " + total);
		
		scanner.close();
	}

}
