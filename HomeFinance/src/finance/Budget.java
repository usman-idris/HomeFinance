/**
 * 
 */
package finance;

import java.util.Date;

/**
 * @author USMAN IDRIS KWARU
 *
 */
public class Budget {
	private String budgetName_;
	private Date startDate_;
	private Date endDate_;
	
	private IncomeList incomeList_;
	
	public Budget() {
		incomeList_ = new IncomeList();
	}
	
	
}
