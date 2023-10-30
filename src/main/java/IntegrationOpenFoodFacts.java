import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import utils.LectureFichier;
import utils.ParseurAdditif;
import utils.ParseurAllergene;
import utils.ParseurCategorie;
import utils.ParseurElementNutritif;
import utils.ParseurIngredient;
import utils.ParseurMarque;
import utils.ParseurNutritionScore;
import utils.ParseurProduit;
import utils.ParseurVitamine;

public class IntegrationOpenFoodFacts {
	public static void main(String[] args) {
		String filePath = ClassLoader.getSystemClassLoader().getResource("open-food-facts.csv").getFile();
		List<String> fichier = new LectureFichier().lire(filePath);
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("open-food-facts");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		ParseurCategorie.ajoutCategorie(fichier,em,et);
		ParseurMarque.ajoutMarque(fichier,em,et);
		ParseurNutritionScore.ajoutNutritionScore(fichier, em, et);
		ParseurIngredient.ajoutIngredient(fichier, em, et);
		ParseurElementNutritif.ajoutElementNutritif(fichier, em, et);
		ParseurVitamine.ajoutVitamine(fichier, em, et);
		ParseurAdditif.ajoutAddittif(fichier, em, et);
		ParseurAllergene.ajoutAllergene(fichier, em, et);
		ParseurProduit.ajoutProduit(fichier, em, et);
		em.close();
		System.out.println("\n\nAjout des éléments en base de donnée terminé");
	}
}
