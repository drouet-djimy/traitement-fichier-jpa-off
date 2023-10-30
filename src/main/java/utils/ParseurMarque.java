package utils;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import entites.Marque;

public class ParseurMarque {
	public static void ajoutMarque(List<String> lignes,EntityManager em, EntityTransaction et) {
		et.begin();
		Set listeMarque = new HashSet<>();
		for (String ligne : lignes) {
			String[] morceaux = ligne.split("\\|",-1);
			listeMarque.add(morceaux[1]);	
		}
		for (Object objet : listeMarque) {
//			System.out.println(categorie);
			Marque marque = new Marque(objet.toString());
			em.persist(marque);
		}
		et.commit();
	}
}
