package entites;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
public class Marque {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	String nom;
	
	@OneToMany(mappedBy = "marque")
	List<Produit> listeProduit = new ArrayList<Produit>();
	
	/**Constructor without param
	 */
	public Marque() {
	}
	
	/**Constructor
	 * @param nom
	 */
	public Marque(String nom) {
		super();
		this.nom = nom;
	}

	@Override
	public String toString() {
		return "Marque [id=" + id + ", nom=" + nom + "]";
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
