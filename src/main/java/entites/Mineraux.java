package entites;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
public class Mineraux {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	double calcium100g;
	double magnesium100g;
	double fer100g;
	double betaCarotene100g;
	
	@OneToMany(mappedBy = "mineraux")
	List<Produit> listeProduit = new ArrayList<Produit>();

	/**Constructor without param
	 */
	public Mineraux() {
		super();
	}

	/**Constructor
	 * @param calcium100g
	 * @param magnesium100g
	 * @param fer100g
	 * @param betaCarotene100g
	 */
	public Mineraux(double calcium100g, double magnesium100g, double fer100g,
			double betaCarotene100g) {
		super();
		this.calcium100g = calcium100g;
		this.magnesium100g = magnesium100g;
		this.fer100g = fer100g;
		this.betaCarotene100g = betaCarotene100g;
	}

	@Override
	public String toString() {
		return "mineraux [id=" + id + ", calcium100g=" + calcium100g + ", magnesium100g=" + magnesium100g
				+ ", fer100g=" + fer100g + ", betaCarotene100g=" + betaCarotene100g + "]";
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
	 * @return the calcium100g
	 */
	public double getCalcium100g() {
		return calcium100g;
	}

	/**Setter
	 * @param calcium100g the calcium100g to set
	 */
	public void setCalcium100g(double calcium100g) {
		this.calcium100g = calcium100g;
	}

	/**Getter
	 * @return the magnesium100g
	 */
	public double getMagnesium100g() {
		return magnesium100g;
	}

	/**Setter
	 * @param magnesium100g the magnesium100g to set
	 */
	public void setMagnesium100g(double magnesium100g) {
		this.magnesium100g = magnesium100g;
	}

	/**Getter
	 * @return the fer100g
	 */
	public double getFer100g() {
		return fer100g;
	}

	/**Setter
	 * @param fer100g the fer100g to set
	 */
	public void setFer100g(double fer100g) {
		this.fer100g = fer100g;
	}

	/**Getter
	 * @return the betaCarotene100g
	 */
	public double getBetaCarotene100g() {
		return betaCarotene100g;
	}

	/**Setter
	 * @param betaCarotene100g the betaCarotene100g to set
	 */
	public void setBetaCarotene100g(double betaCarotene100g) {
		this.betaCarotene100g = betaCarotene100g;
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
