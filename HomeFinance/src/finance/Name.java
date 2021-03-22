/**
 * 
 */
package finance;

/**
 * @author USER
 *
 */
public class Name {
	private String firstName_;
	private String middleName_;
	private String lastName_;
	
	/**
	 * Constructor to set the name for a model.passenger with a full name
	 * @param fullName The full name of a model.passenger
	 * @author Asha
	 */
	public Name (String fullName) {
		  int spacePos1 = fullName.indexOf(' ');
		  firstName_ = fullName.substring(0, spacePos1);
		  int spacePos2 = fullName.lastIndexOf(' ');
		  if (spacePos1 == spacePos2)
			  middleName_ = "";
		  else 
			  middleName_ = fullName.substring(spacePos1+1, spacePos2);
		  lastName_ = fullName.substring(spacePos2 + 1);
	  }

	// constructor to create object with a first and last name
	public Name(String fName, String lName) {
		
		if( lName.trim().length() ==0)    
        {
          throw new StringIndexOutOfBoundsException(
             "Cannot have blank last name");
        }

		firstName_ = fName;
		middleName_ = "";
		lastName_ = lName;
	}

	// constructor to create object with first, middle and last name
	// if there isn't a middle name, that parameter could be an empty String
	public Name(String fName, String mName, String lName) {
		if( lName.trim().length() ==0)    
        {
          throw new IllegalStateException(
             "Cannot have blank last name");
        }

		firstName_ = fName;
		middleName_ = mName;
		lastName_ = lName;
	}
	// either first name then space then last name
	// or first name then space then middle name then space
	// and then last name

	public String getFullName() {
		String result = firstName_ + " ";
		if (!middleName_.equals("")) {
			result += middleName_ + " ";
		}
		result += lastName_;
		return result;
	}
	// method for getting the first name
	public String getLastName() {
		return lastName_;
	}
	
	public String getFirstName() {
		return firstName_;
	}

	public char getInitFirst() {
		return firstName_.charAt(0);
	}

	public char getInitMiddle() {
		return middleName_.charAt(0);
	}

	public char getInitLast() {
		return lastName_.charAt(0);
	}
	// method to get the full initials. This methods is useful in general 
	// but not necessarily required for this program.
	
	public String getFullInit() {
		String initials = "";

		if (firstName_ != null && !firstName_.isEmpty()) {
			initials += firstName_.substring(0, 1);
		}
		if (middleName_ != null && !middleName_.isEmpty()) {
			initials += middleName_.substring(0, 1);
		}
		if (lastName_ != null && !lastName_.isEmpty()) {
			initials += lastName_.substring(0, 1);
		}
		return initials;
	}
}
