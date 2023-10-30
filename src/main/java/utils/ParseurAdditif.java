package utils;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import entites.Additif;
import entites.Ingredient;
import entites.Marque;
import entites.NutritionScore;

public class ParseurAdditif {
	public static void ajoutAddittif(List<String> lignes, EntityManager em, EntityTransaction et) {
		et.begin();
		Set listeAdditif = new HashSet<>();
		for (String ligne : lignes) {
			String[] morceaux = ligne.split("\\|", -1);

			String[] additifs = morceaux[29].split("[,]");
			for (String additif : additifs) {
				additif = additif.trim();
				// Si un additif commence par '-' supprime le tirret
				if (additif.startsWith("-")) {
					additif = additif.substring(1);
				}
				// Si l'additif est = à 0 ne l'ajoute pas a la liste
				if (additif.contentEquals("0")) {
				} else {
					// si un additif est nommé "en:milk" le renomme en "Lait"
					if (additif.contains("en:milk")) {
						additif = "Lait";
					}
					// Si un additif est nommé "en:mustard" le renomme en "Moutarde"
					if (additif.contains("en:mustard")) {
						additif = "Moutarde";
					}
					// Si un additif est nommé "en:gluten" le renomme en "Gluten"
					if (additif.contains("en:gluten")) {
						additif = "Gluten";
					}
					additif = additif.trim();
					listeAdditif.add(additif);
				}
			}
		}
		for (Object objet : listeAdditif) {
			Additif additif = new Additif(objet.toString());
			System.out.println(additif.getNom());
			em.persist(additif);
			
		}
		et.commit();
	}
}
