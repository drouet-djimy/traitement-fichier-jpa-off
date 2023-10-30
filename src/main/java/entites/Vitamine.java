package entites;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
public class Vitamine {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	
	double vitA_100g; 
	double vitD_100g;
	double vitE_100g;
	double vitK_100g;
	double vitC_100g;
	double vitB1_100g;
	double vitB2_100g;
	double vitPP_100g;
	double vitB6_100g;
	double vitB9_100g;
	double vitB12_100g;
	
	@OneToMany(mappedBy = "vitamine")
	List<Produit> listeProduit = new ArrayList<Produit>();
	/**Constructor without param
	 */
	public Vitamine() {
	}
	
	/**Constructor
	 * @param vitA_100g
	 * @param vitD_100g
	 * @param vitE_100g
	 * @param vitK_100g
	 * @param vitC_100g
	 * @param vitB1_100g
	 * @param vitB2_100g
	 * @param vitPP_100g
	 * @param vitB6_100g
	 * @param vitB9_100g
	 * @param vitB12_100g
	 */
	public Vitamine(double vitA_100g, double vitD_100g, double vitE_100g, double vitK_100g, double vitC_100g,
			double vitB1_100g, double vitB2_100g, double vitPP_100g, double vitB6_100g, double vitB9_100g,
			double vitB12_100g) {
		super();
		this.vitA_100g = vitA_100g;
		this.vitD_100g = vitD_100g;
		this.vitE_100g = vitE_100g;
		this.vitK_100g = vitK_100g;
		this.vitC_100g = vitC_100g;
		this.vitB1_100g = vitB1_100g;
		this.vitB2_100g = vitB2_100g;
		this.vitPP_100g = vitPP_100g;
		this.vitB6_100g = vitB6_100g;
		this.vitB9_100g = vitB9_100g;
		this.vitB12_100g = vitB12_100g;
	}

	@Override
	public String toString() {
		return "Vitamine [id=" + id + ", vitA_100g=" + vitA_100g + ", vitD_100g=" + vitD_100g + ", vitE_100g="
				+ vitE_100g + ", vitK_100g=" + vitK_100g + ", vitC_100g=" + vitC_100g + ", vitB1_100g=" + vitB1_100g
				+ ", vitB2_100g=" + vitB2_100g + ", vitPP_100g=" + vitPP_100g + ", vitB6_100g=" + vitB6_100g
				+ ", vitB9_100g=" + vitB9_100g + ", vitB12_100g=" + vitB12_100g + "]";
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
	 * @return the vitA_100g
	 */
	public double getVitA_100g() {
		return vitA_100g;
	}

	/**Setter
	 * @param vitA_100g the vitA_100g to set
	 */
	public void setVitA_100g(double vitA_100g) {
		this.vitA_100g = vitA_100g;
	}

	/**Getter
	 * @return the vitD_100g
	 */
	public double getVitD_100g() {
		return vitD_100g;
	}

	/**Setter
	 * @param vitD_100g the vitD_100g to set
	 */
	public void setVitD_100g(double vitD_100g) {
		this.vitD_100g = vitD_100g;
	}

	/**Getter
	 * @return the vitE_100g
	 */
	public double getVitE_100g() {
		return vitE_100g;
	}

	/**Setter
	 * @param vitE_100g the vitE_100g to set
	 */
	public void setVitE_100g(double vitE_100g) {
		this.vitE_100g = vitE_100g;
	}

	/**Getter
	 * @return the vitK_100g
	 */
	public double getVitK_100g() {
		return vitK_100g;
	}

	/**Setter
	 * @param vitK_100g the vitK_100g to set
	 */
	public void setVitK_100g(double vitK_100g) {
		this.vitK_100g = vitK_100g;
	}

	/**Getter
	 * @return the vitC_100g
	 */
	public double getVitC_100g() {
		return vitC_100g;
	}

	/**Setter
	 * @param vitC_100g the vitC_100g to set
	 */
	public void setVitC_100g(double vitC_100g) {
		this.vitC_100g = vitC_100g;
	}

	/**Getter
	 * @return the vitB1_100g
	 */
	public double getVitB1_100g() {
		return vitB1_100g;
	}

	/**Setter
	 * @param vitB1_100g the vitB1_100g to set
	 */
	public void setVitB1_100g(double vitB1_100g) {
		this.vitB1_100g = vitB1_100g;
	}

	/**Getter
	 * @return the vitB2_100g
	 */
	public double getVitB2_100g() {
		return vitB2_100g;
	}

	/**Setter
	 * @param vitB2_100g the vitB2_100g to set
	 */
	public void setVitB2_100g(double vitB2_100g) {
		this.vitB2_100g = vitB2_100g;
	}

	/**Getter
	 * @return the vitPP_100g
	 */
	public double getVitPP_100g() {
		return vitPP_100g;
	}

	/**Setter
	 * @param vitPP_100g the vitPP_100g to set
	 */
	public void setVitPP_100g(double vitPP_100g) {
		this.vitPP_100g = vitPP_100g;
	}

	/**Getter
	 * @return the vitB6_100g
	 */
	public double getVitB6_100g() {
		return vitB6_100g;
	}

	/**Setter
	 * @param vitB6_100g the vitB6_100g to set
	 */
	public void setVitB6_100g(double vitB6_100g) {
		this.vitB6_100g = vitB6_100g;
	}

	/**Getter
	 * @return the vitB9_100g
	 */
	public double getVitB9_100g() {
		return vitB9_100g;
	}

	/**Setter
	 * @param vitB9_100g the vitB9_100g to set
	 */
	public void setVitB9_100g(double vitB9_100g) {
		this.vitB9_100g = vitB9_100g;
	}

	/**Getter
	 * @return the vitB12_100g
	 */
	public double getVitB12_100g() {
		return vitB12_100g;
	}

	/**Setter
	 * @param vitB12_100g the vitB12_100g to set
	 */
	public void setVitB12_100g(double vitB12_100g) {
		this.vitB12_100g = vitB12_100g;
	}
	
	
}
