/**
 * 
 */
package finance;

import java.util.HashMap;

/**
 * @author USMAN IDRIS KWARU
 *
 */
public class IncomeList {
	private HashMap<String, Income> incomeList_;
	
	public IncomeList() {
		this.incomeList_ = new HashMap<String, Income>();
		this.AddDefaultIncome();
	}

	/**
	 * @return the incomeList_
	 */
	public HashMap<String, Income> getIncomeList_() {
		return incomeList_;
	}

	/**
	 * @param incomeList_ the incomeList_ to set
	 */
	public void setIncomeList_(HashMap<String, Income> incomeList_) {
		this.incomeList_ = incomeList_;
	}
	
	private void addToList(Income income) {
		this.incomeList_.put(income.getName_(), income);
	}
	
	private void AddDefaultIncome() {
		Income n = new Income("Salary", 0.00f);
		this.insertIncome(n);
	}
	
	public Income searchIncome(String key) {
		Income income;
		if (this.incomeList_.containsKey(key)) {
			income = this.incomeList_.get(key);
			return income;
		}
		
		return null;
	}
	
	public void insertIncome(Income income) {
		if (searchIncome(income.getName_()) == null) {
			this.addToList(income);
		}
		else {
			System.out.println("This Income already exists");
		}
	}
	
	@Override
	public String toString() {
		String s = "";
		for (Income income : incomeList_.values()) {
			s += income.getName_() + "\n";
		}
		
		return s;
	}
}
