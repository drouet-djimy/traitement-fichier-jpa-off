package entites;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
public class Allergene {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	String nom;
	
	@ManyToMany(mappedBy = "listeAllergene")
	List<Produit> listeProduit = new ArrayList<Produit>();

	/**Constructor without param
	 */
	public Allergene() {
	}
	
	/**Constructor
	 * @param nom
	 */
	public Allergene(String nom) {
		super();
		this.nom = nom;
	}

	@Override
	public String toString() {
		return "Allergene [id=" + id + ", nom=" + nom + "]";
	}

	/**Getter
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**Setter
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**Getter
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**Setter
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**Getter
	 * @return the listeProduit
	 */
	public List<Produit> getListeProduit() {
		return listeProduit;
	}

	/**Setter
	 * @param listeProduit the listeProduit to set
	 */
	public void setListeProduit(List<Produit> listeProduit) {
		this.listeProduit = listeProduit;
	}
	
	
}
