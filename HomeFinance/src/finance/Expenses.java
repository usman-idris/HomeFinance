/**
 * Expenses that are to be spent
 */
package finance;

/**
 * @author Usman Idris Kwaru
 *
 */
public class Expenses {
	private String name_;
	private float expense_;
	private String description_;
	
	public Expenses(String name) {
		this.name_ = name;
		this.expense_ = 0.00f;
		this.description_ = "";
	}

	/**
	 * @return the name_
	 */
	public String getName_() {
		return name_;
	}

	/**
	 * @param name_ the name_ to set
	 */
	public void setName_(String name_) {
		this.name_ = name_;
	}

	/**
	 * @return the expense_
	 */
	public float getExpense_() {
		return expense_;
	}

	/**
	 * @param expense_ the expense_ to set
	 */
	public void setExpense_(float expense_) {
		this.expense_ = expense_;
	}

	/**
	 * @return the description_
	 */
	public String getDescription_() {
		return description_;
	}

	/**
	 * @param description_ the description_ to set
	 */
	public void setDescription_(String description_) {
		this.description_ = description_;
	}
	
	
}
