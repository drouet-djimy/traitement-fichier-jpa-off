package utils;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import entites.Allergene;
import entites.Ingredient;
import entites.Marque;
import entites.NutritionScore;

public class ParseurAllergene {
	public static void ajoutAllergene(List<String> lignes,EntityManager em, EntityTransaction et) {
		et.begin();
		Set listeAllergene = new HashSet<>();
		for (String ligne : lignes) {
			String[] morceaux = ligne.split("\\|",-1);
			String[] allergenes = morceaux[28].split("[,]");
			for (String allergene : allergenes) {
				allergene = allergene.toString().toLowerCase().trim();
				if (allergene.startsWith("-")) {
					allergene = allergene.substring(1);
	            }
				allergene=allergene.replaceAll("\\*", "");
				allergene=allergene.replaceAll("_", "");
				allergene=allergene.replaceAll("fr:", "");
				allergene=allergene.replaceAll("lait1", "lait");
				if(allergene.contentEquals(" %")||allergene.contentEquals("/")||allergene.contentEquals("0")||allergene.contentEquals("")) {
				}
				else {
					// la liste de if permet de traduire les allergene ou bien leurs attribuer le bon nom
					if(allergene.contentEquals("en:crustaceans")) {
						allergene="crustacés";
					}
					if(allergene.contentEquals("en:sesame-seeds")) {
						allergene="graines de sésame";
					}
					if(allergene.contentEquals("en:fish")) {
						allergene="poisson";
					}
					if(allergene.contentEquals("en:nuts")) {
						allergene="noisettes";
					}
					if(allergene.contentEquals(": gluten")||allergene.contentEquals("en:gluten")) {
						allergene="gluten";
					}
					if (allergene.contentEquals("en:sulphur-dioxide-and-sulphites")) {
						allergene = "dioxyde-de-soufre-et-sulfites";
					}
					if (allergene.contentEquals("en:lupin")) {
						allergene = "lupin";
					}
					if (allergene.contentEquals("en:fromage frais")) {
						allergene = "fromage frais";
					}
					if (allergene.contentEquals("de:gluten-enthaltendes-getreide")) {
						allergene = "céréales contenant du gluten";
					}
					if (allergene.contentEquals("en:mustard")) {
						allergene = "moutarde";
					}
					if (allergene.contentEquals("en:peanuts")) {
						allergene = "cacahuètes";
					}
					if (allergene.contentEquals("en:soybeans")) {
						allergene = "graines de soja";
					}
					if (allergene.contentEquals("en:milk") || allergene.contentEquals("milk")) {
						allergene = "lait";
					}
					if (allergene.contentEquals("en:blé")) {
						allergene = "blé";
					}
					if (allergene.contentEquals("en:eggs")) {
						allergene = "oeufs";
					}
					if (allergene.contentEquals("en:celery")) {
						allergene = "céleri";
					}
					if (allergene.contentEquals("soia")) {
						allergene = "soja";
					}
					if (allergene.contentEquals("en:tomme")) {
						allergene = "tomme";
					}
					if (allergene.contentEquals("milkwort")) {
						allergene = "produit laitier";
					}
					//permet de supprimer les espace en début de String
					allergene = allergene.trim();
					listeAllergene.add(allergene);
				}
				
				
			}
		}
		//pour chaque objet de la listeAllergene créer un allergene et le rends peristant
		for (Object objet : listeAllergene) {
			Allergene allergene = new Allergene(objet.toString());
			em.persist(allergene);
		}
		et.commit();
	}
}
