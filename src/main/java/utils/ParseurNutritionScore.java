package utils;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import entites.Marque;
import entites.NutritionScore;

public class ParseurNutritionScore {
	public static void ajoutNutritionScore(List<String> lignes,EntityManager em, EntityTransaction et) {
		et.begin();
		Set listeNutritionScore = new HashSet<>();
		for (String ligne : lignes) {
			String[] morceaux = ligne.split("\\|",-1);
			listeNutritionScore.add(morceaux[3]);	
		}
		for (Object objet : listeNutritionScore) {
//			System.out.println(objet);
			NutritionScore nutritionScore = new NutritionScore(objet.toString().charAt(0));
			em.persist(nutritionScore);
		}
		et.commit();
	}
}
