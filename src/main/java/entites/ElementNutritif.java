package entites;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
public class ElementNutritif {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	
	double energie100g;
	double graisse100g;
	double sucres100g;
	double fibres100g;
	double proteines100g;
	double sel100g;
	
	@OneToMany(mappedBy = "elementNutritif")
	List<Produit> listeProduit = new ArrayList<Produit>();
	
	/**Constructor
	 */
	public ElementNutritif() {
	}

	/**Constructor
	 * @param energie100g
	 * @param graisse100g
	 * @param sucres100g
	 * @param fibres100g
	 * @param proteines100g
	 * @param sel100g
	 * @param listeProduit
	 */
	public ElementNutritif(double energie100g, double graisse100g, double sucres100g, double fibres100g,
			double proteines100g, double sel100g) {
		super();
		this.energie100g = energie100g;
		this.graisse100g = graisse100g;
		this.sucres100g = sucres100g;
		this.fibres100g = fibres100g;
		this.proteines100g = proteines100g;
		this.sel100g = sel100g;
	}

	@Override
	public String toString() {
		return "ElementNutritif [id=" + id + ", energie100g=" + energie100g + ", graisse100g=" + graisse100g
				+ ", sucres100g=" + sucres100g + ", fibres100g=" + fibres100g + ", proteines100g=" + proteines100g
				+ ", sel100g=" + sel100g + "]";
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
	 * @return the energie100g
	 */
	public double getEnergie100g() {
		return energie100g;
	}

	/**Setter
	 * @param energie100g the energie100g to set
	 */
	public void setEnergie100g(double energie100g) {
		this.energie100g = energie100g;
	}

	/**Getter
	 * @return the graisse100g
	 */
	public double getGraisse100g() {
		return graisse100g;
	}

	/**Setter
	 * @param graisse100g the graisse100g to set
	 */
	public void setGraisse100g(double graisse100g) {
		this.graisse100g = graisse100g;
	}

	/**Getter
	 * @return the sucres100g
	 */
	public double getSucres100g() {
		return sucres100g;
	}

	/**Setter
	 * @param sucres100g the sucres100g to set
	 */
	public void setSucres100g(double sucres100g) {
		this.sucres100g = sucres100g;
	}

	/**Getter
	 * @return the fibres100g
	 */
	public double getFibres100g() {
		return fibres100g;
	}

	/**Setter
	 * @param fibres100g the fibres100g to set
	 */
	public void setFibres100g(double fibres100g) {
		this.fibres100g = fibres100g;
	}

	/**Getter
	 * @return the proteines100g
	 */
	public double getProteines100g() {
		return proteines100g;
	}

	/**Setter
	 * @param proteines100g the proteines100g to set
	 */
	public void setProteines100g(double proteines100g) {
		this.proteines100g = proteines100g;
	}

	/**Getter
	 * @return the sel100g
	 */
	public double getSel100g() {
		return sel100g;
	}

	/**Setter
	 * @param sel100g the sel100g to set
	 */
	public void setSel100g(double sel100g) {
		this.sel100g = sel100g;
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
