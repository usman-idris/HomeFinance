/**
 * 
 */
package finance;

import java.util.Date;

/**
 * @author Usman Idris Kwaru
 *
 */
public class Income {
	private String name_;
	private float value_;
	private String description_;
	private Date date_;
	
	public Income(String name, float value) {
		this.name_ = name;
		this.value_ = value;
	}
	
	public Income(String name, float value, String description) {
		this.name_ = name;
		this.value_ = value;
		this.description_ = description;
	}
	
	public Income(String name, float value, String description, Date date) {
		this.name_ = name;
		this.value_ = value;
		this.description_ = description;
		this.date_ = date;
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
	 * @return the value_
	 */
	public float getValue_() {
		return value_;
	}

	/**
	 * @param value_ the value_ to set
	 */
	public void setValue_(float value_) {
		this.value_ = value_;
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

	/**
	 * @return the date_
	 */
	public Date getDate_() {
		return date_;
	}

	/**
	 * @param date_ the date_ to set
	 */
	public void setDate_(Date date_) {
		this.date_ = date_;
	}
	
	
	
}
