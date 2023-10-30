package entites;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
public class NutritionScore {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	char note;
	
	@OneToMany(mappedBy = "nutriscore")
	List<Produit> listeProduit = new ArrayList<Produit>();
	
	/**Constructor without param
	 */
	public NutritionScore() {
	}
	
	/**Constructor
	 * @param note
	 */
	public NutritionScore(char note) {
		super();
		this.note = note;
	}

	@Override
	public String toString() {
		return "NutritionScore [id=" + id + ", note=" + note + "]";
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
	 * @return the note
	 */
	public char getNote() {
		return note;
	}

	/**Setter
	 * @param note the note to set
	 */
	public void setNote(char note) {
		this.note = note;
	}
	
	
}
