package entites;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestJpa {

	public static void main(String[] args) {
		// Création de l'entity Manager
				EntityManagerFactory emf = Persistence.createEntityManagerFactory("open-food-facts");
				EntityManager em = emf.createEntityManager();
				// Création de la transaction et ouverture de celle-ci
				EntityTransaction et = em.getTransaction();
				et.begin();
				
				//création d'un AdditifAlimentaire
				Categorie categorie = new Categorie("Additifs alimentaires");
				em.persist(categorie);
				
				//création d'une Marque
				Marque marque = new Marque("La patelière");
				em.persist(marque);
				
				//création d'un NutritionScore
				NutritionScore nutriscore = new NutritionScore('d');
				em.persist(nutriscore);
				
				//création de divers ingrédients
				Ingredient ingredient1 = new Ingredient("sucre");
				Ingredient ingredient2 = new Ingredient("amidon de riz");
				Ingredient ingredient3 = new Ingredient("amidon de maïs");
				Ingredient ingredient4 = new Ingredient("sirop de glucose");
				Ingredient ingredient5 = new Ingredient("arôme");
				Ingredient ingredient6 = new Ingredient("colorant: argent");
				em.persist(ingredient1);
				em.persist(ingredient2);
				em.persist(ingredient3);
				em.persist(ingredient4);
				em.persist(ingredient5);
				em.persist(ingredient6);

				//ajoute les ingrédients dans la listeIngredient
				List<Ingredient> listeIngredient =new ArrayList<Ingredient>();
				listeIngredient.add(ingredient1);
				listeIngredient.add(ingredient2);
				listeIngredient.add(ingredient3);
				listeIngredient.add(ingredient4);
				listeIngredient.add(ingredient5);
				listeIngredient.add(ingredient6);
				
				
				//création d'éléments nutritifs
				ElementNutritif elementNutritif = new ElementNutritif(1671, 0.5, 91.2, 0, 0.5, 0.0001);
				em.persist(elementNutritif);
				//Création des vitamines
				Vitamine vitamine = new Vitamine(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
				em.persist(vitamine);
				
				//Création des "mineraux"
				Mineraux mineraux = new Mineraux(0, 0, 0, 0);
				em.persist(mineraux);
				
				//Création des allergenes
				Allergene allergene1 = new Allergene("lait");
				Allergene allergene2 = new Allergene("noix");
				em.persist(allergene1);
				em.persist(allergene2);
				List<Allergene> listeAllergene =new ArrayList<Allergene>();
				listeAllergene.add(allergene1);
				listeAllergene.add(allergene2);
				
				//Création des additifs
				Additif additif1 = new Additif("E500 - Carbonates de sodium");
				Additif additif2 = new Additif("E500ii - Carbonate acide de sodium");
				em.persist(additif1);
				em.persist(additif2);
				List<Additif> listeAdditif = new ArrayList<Additif>();
				listeAdditif.add(additif1);
				listeAdditif.add(additif2);
				
				
				em.persist(new Produit("Perle argentées",categorie,marque,nutriscore,listeIngredient,elementNutritif,vitamine,mineraux,false,listeAllergene,listeAdditif));
				// Commit de la transaction
				et.commit();
	}
}
