package utils;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import entites.ElementNutritif;

public class ParseurElementNutritif {
	public static void ajoutElementNutritif(List<String> lignes, EntityManager em, EntityTransaction et) {
		et.begin();
		for (String ligne : lignes) {
			double energie100g = 0;
			double graisse100g = 0;
			double sucres100g = 0;
			double fibres100g = 0;
			double proteines100g = 0;
			double sel100g = 0;
			String[] morceaux = ligne.split("\\|",-1);

			// vérifie que les données soient bien des nombre, et les arrondis à la 3eme décimale

			if (morceaux[5].matches("-?\\d+(\\.\\d+)?")) {
				energie100g = Double.valueOf(morceaux[5]);
				energie100g=Math.round(energie100g* 100.0)/100.0;
			}

			if (morceaux[6].matches("-?\\d+(\\.\\d+)?")) {
				graisse100g = Double.valueOf(morceaux[6]);
				graisse100g=Math.round(graisse100g*1000.0)/1000.0;
			}

			if (morceaux[7].matches("-?\\d+(\\.\\d+)?")) {
				sucres100g = Double.valueOf(morceaux[7]);
				sucres100g=Math.round(sucres100g*1000.0)/1000.0;
			}

			if (morceaux[8].matches("-?\\d+(\\.\\d+)?")) {
				fibres100g = Double.valueOf(morceaux[8]);
				fibres100g=Math.round(fibres100g*1000.0)/1000.0;
			}

			if (morceaux[9].matches("-?\\d+(\\.\\d+)?")) {
				proteines100g = Double.valueOf(morceaux[9]);
				proteines100g=Math.round(proteines100g*1000.0)/1000.0;
			}

			if (morceaux[10].matches("-?\\d+(\\.\\d+)?")) {
				sel100g = Double.valueOf(morceaux[10]);
				sel100g=Math.round(sel100g*1000.0)/1000.0;
			}
			ElementNutritif elementNutritif = new ElementNutritif(energie100g, graisse100g, sucres100g, fibres100g, proteines100g, sel100g);
			em.persist(elementNutritif);
		}
		et.commit();
	}
}
