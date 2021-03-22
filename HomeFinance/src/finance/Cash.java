/**
 * Tracks the cash currently at hand
 */
package finance;

/**
 * @author Usman Idris Kwaru
 *
 */
public class Cash {
	private float budget; //The budget for the household for a month
	private float currentCash;
	
	public Cash(float currentCash) {
		this.currentCash = currentCash;
	}

	/**
	 * Returns the the budget
	 * @return the budget
	 */
	public float getBudget() {
		return budget;
	}

	/**
	 * Sets the budget for the household
	 * @param budget the budget to set
	 */
	public void setBudget(float budget) {
		this.budget = budget;
	}

	/**
	 * @return the currentCash
	 */
	public float getCurrentCash() {
		return currentCash;
	}

	/**
	 * @param currentCash the currentCash to set
	 */
	public void setCurrentCash(float currentCash) {
		this.currentCash = currentCash;
	}
	
	
}
