package entites;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Produit {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	String nom;

	@ManyToOne
	@JoinColumn(name = "id_categorie")
	Categorie categorie;

	@ManyToOne
	@JoinColumn(name = "id_marque")
	Marque marque;

	@ManyToOne
	@JoinColumn(name = "id_nutriscore")
	NutritionScore nutriscore;

	@ManyToMany
	@JoinTable(name = "listeIngredient", joinColumns = @JoinColumn(name = "ID_PRODUIT", referencedColumnName = "ID"), inverseJoinColumns = @JoinColumn(name = "ID_INGREDIENT", referencedColumnName = "ID"))
	List<Ingredient> listeIngredient = new ArrayList<Ingredient>();

	@ManyToOne
	@JoinColumn(name = "id_element_nutritif")
	ElementNutritif elementNutritif;

	@ManyToOne
	@JoinColumn(name = "id_vitamine")
	Vitamine vitamine;
	/**
	 * Constructor without param
	 */

	@ManyToOne
	@JoinColumn(name = "id_mineraux")
	Mineraux mineraux;

	boolean presenceHuilePalme;

	@ManyToMany
	@JoinTable(name = "AllergeneProduit", joinColumns = @JoinColumn(name = "ID_PRODUIT", referencedColumnName = "ID"), inverseJoinColumns = @JoinColumn(name = "ID_ALLERGENE", referencedColumnName = "ID"))
	List<Allergene> listeAllergene = new ArrayList<Allergene>();

	@ManyToMany
	@JoinTable(name = "AdditifProduit", joinColumns = @JoinColumn(name = "ID_PRODUIT", referencedColumnName = "ID"), inverseJoinColumns = @JoinColumn(name = "ID_ADDITIF", referencedColumnName = "ID"))
	List<Additif> listeAdditif = new ArrayList<Additif>();

	/**
	 * Constructor without param
	 */
	public Produit() {
	}

	/**
	 * Constructor
	 * 
	 * @param nom
	 * @param categorie
	 */
	public Produit(String nom, Categorie categorie, Marque marque, NutritionScore nutriscore,
			List<Ingredient> listeIngredient, ElementNutritif elementNutritif, Vitamine vitamine, Mineraux mineraux,
			boolean presenceHuilePalme, List<Allergene> listeAllergene, List<Additif> listeAdditif) {
		
		super();
		this.nom = nom;
		this.categorie = categorie;
		this.marque = marque;
		this.nutriscore = nutriscore;
		this.listeIngredient = listeIngredient;
		this.elementNutritif = elementNutritif;
		this.vitamine = vitamine;
		this.mineraux = mineraux;
		this.presenceHuilePalme = presenceHuilePalme;
		this.listeAllergene = listeAllergene;
		this.listeAdditif = listeAdditif;
	}
}