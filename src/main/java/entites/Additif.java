package entites;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
public class Additif {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	String nom;
	
	@ManyToMany(mappedBy = "listeAdditif")
	List<Produit> listeProduit = new ArrayList<Produit>();
	
	/**Constructor without param
	 */
	public Additif() {
	}
	
	/**Constructor
	 * @param nom
	 */
	public Additif(String nom) {
		super();
		this.nom = nom;
	}

	@Override
	public String toString() {
		return "Additif [id=" + id + ", nom=" + nom + "]";
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
	
	
}
