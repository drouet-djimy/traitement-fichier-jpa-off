package utils;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import entites.Categorie;

public class ParseurCategorie {
	public static void ajoutCategorie(List<String> lignes,EntityManager em, EntityTransaction et) {
		et.begin();
		Set listeCategories = new HashSet<>();
		for (String ligne : lignes) {
			String[] morceaux = ligne.split("\\|",-1);
			listeCategories.add(morceaux[0]);	
		}
		for (Object objet : listeCategories) {
//			System.out.println(categorie);
			Categorie categorie = new Categorie(objet.toString());
			em.persist(categorie);
		}
		et.commit();
	}
}
