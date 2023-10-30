package utils;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import entites.*;

public class ParseurProduit {
	public static void ajoutProduit(List<String> lignes, EntityManager em, EntityTransaction et) {
		String nomProduit;
		Categorie categorie;
		Marque marque;
		NutritionScore nutriscore;
		List<Ingredient> listeIngredient = new ArrayList<Ingredient>();
		ElementNutritif elementNutritif;
		Vitamine vitamine;
		Mineraux mineraux;
		boolean presenceHuilePalme;
		List<Allergene> listeAllergene = new ArrayList<Allergene>();
		List<Additif> listeAdditif = new ArrayList<Additif>();
		et.begin();
		
		for (String ligne : lignes) {
			String[] morceaux = ligne.split("\\|",-1);
			nomProduit=morceaux[2].toString();
			System.out.println(nomProduit);
//			Produit produit = new Produit(nomProduit, categorie, marque, nutriscore, listeIngredient, elementNutritif, vitamine, mineraux, presenceHuilePalme, listeAllergene, listeAdditif);
		}
	}
}
