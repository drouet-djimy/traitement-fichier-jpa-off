package utils;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import entites.ElementNutritif;
import entites.Vitamine;

public class ParseurVitamine {
	public static void ajoutVitamine(List<String> lignes, EntityManager em, EntityTransaction et) {
		et.begin();
		for (String ligne : lignes) {
			double vitA_100g=0; 
			double vitD_100g=0;
			double vitE_100g=0;
			double vitK_100g=0;
			double vitC_100g=0;
			double vitB1_100g=0;
			double vitB2_100g=0;
			double vitPP_100g=0;
			double vitB6_100g=0;
			double vitB9_100g=0;
			double vitB12_100g=0;
			String[] morceaux = ligne.split("\\|",-1);

			// vérifie que les données soient bien des nombre, et les arrondis à la 3eme décimale

			if (morceaux[11].matches("-?\\d+(\\.\\d+)?([Ee][-+]?\\d+)?")) {
				vitA_100g = Double.valueOf(morceaux[11]);
			}

			if (morceaux[12].matches("-?\\d+(\\.\\d+)?([Ee][-+]?\\d+)?")) {
				vitD_100g = Double.valueOf(morceaux[12]);
			}

			if (morceaux[13].matches("-?\\d+(\\.\\d+)?([Ee][-+]?\\d+)?")) {
				vitE_100g = Double.valueOf(morceaux[13]);
			}

			if (morceaux[14].matches("-?\\d+(\\.\\d+)?([Ee][-+]?\\d+)?")) {
				vitK_100g = Double.valueOf(morceaux[14]);
			}

			if (morceaux[15].matches("-?\\d+(\\.\\d+)?([Ee][-+]?\\d+)?")) {
				vitC_100g = Double.valueOf(morceaux[15]);
			}

			if (morceaux[16].matches("-?\\d+(\\.\\d+)?([Ee][-+]?\\d+)?")) {
				vitB1_100g = Double.valueOf(morceaux[16]);
			}
			if (morceaux[17].matches("-?\\d+(\\.\\d+)?([Ee][-+]?\\d+)?")) {
				vitB2_100g = Double.valueOf(morceaux[17]);
			}
			if (morceaux[18].matches("-?\\d+(\\.\\d+)?([Ee][-+]?\\d+)?")) {
				vitPP_100g = Double.valueOf(morceaux[18]);
			}
			if (morceaux[19].matches("-?\\d+(\\.\\d+)?([Ee][-+]?\\d+)?")) {
				vitB6_100g = Double.valueOf(morceaux[19]);
			}
			if (morceaux[20].matches("-?\\d+(\\.\\d+)?([Ee][-+]?\\d+)?")) {
				vitB9_100g = Double.valueOf(morceaux[20]);
			}
			if (morceaux[21].matches("-?\\d+(\\.\\d+)?([Ee][-+]?\\d+)?")) {
				vitB12_100g = Double.valueOf(morceaux[21]);
			}
			Vitamine vitamine = new Vitamine(vitA_100g, vitD_100g, vitE_100g, vitK_100g, vitC_100g, vitB1_100g, vitB2_100g, vitPP_100g, vitB6_100g, vitB9_100g, vitB12_100g);
			em.persist(vitamine);
		}
		et.commit();
	}
}
