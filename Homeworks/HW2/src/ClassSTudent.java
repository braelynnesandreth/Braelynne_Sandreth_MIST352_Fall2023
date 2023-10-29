
public class ClassSTudent {
	    private String name;
	    private int id;
	    private String major;
	    private String dob;
	    private int hours;

	    public void setName(String theName) {
	        this.name = theName;
	    }

	    public void setID(int theID) {
	        this.id = theID;
	    }

	    public void setMajor(String theMajor) {
	        this.major = theMajor;
	    }

	    public void setDOB(String theDOB) {
	        this.dob = theDOB;
	    }

	    public void setHours(int hours, String action) {
	        if (action.equals("add")) {
	            this.hours += hours;
	        } else if (action.equals("subtract")) {
	            this.hours -= hours;
	        }
	    }

	    public String getName() {
	        return this.name;
	    }

	    public int getID() {
	        return this.id;
	    }

	    public String getMajor() {
	        return this.major;
	    }

	    public String getDOB() {
	        return this.dob;
	    }

	    public int getHours() {
	        return this.hours;
	    }
	}

