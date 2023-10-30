package utils;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import entites.Ingredient;
import entites.Marque;
import entites.NutritionScore;

public class ParseurIngredient {
	public static void ajoutIngredient(List<String> lignes,EntityManager em, EntityTransaction et) {
		et.begin();
		Set listeIngredient = new HashSet<>();
		for (String ligne : lignes) {
			String[] morceaux = ligne.split("\\|",-1);
			String[] alliments = morceaux[4].split("[,.-;]");
			for (String alliment : alliments) {
				alliment = alliment.replaceAll("[_\\d%*:;)]", "");
				alliment = alliment.replaceAll("\\[", "");
				alliment = alliment.replaceAll("\\]", "");
				alliment = alliment.trim();
				if (alliment.startsWith("-")) {
	                alliment = alliment.substring(1);
	            }
				alliment = alliment.trim();
				listeIngredient.add(alliment);
				
			}
		}
		for (Object objet : listeIngredient) {
			Ingredient ingredient = new Ingredient(objet.toString());
			em.persist(ingredient);
			
		}
		et.commit();
	}
}
