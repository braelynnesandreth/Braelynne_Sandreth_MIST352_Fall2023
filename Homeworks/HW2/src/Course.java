
public class Course {
	    private String courseCode;
	    private String courseTitle;
	    private String instructorName;
	    private int maximumCapacity;
	    private int currentEnrollment;

	    // Constructor
	    public Course(String courseCode, String courseTitle, String instructorName) {
	        this.courseCode = courseCode;
	        this.courseTitle = courseTitle;
	        this.instructorName = instructorName;
	        this.maximumCapacity = 30;
	        this.currentEnrollment = 29;
	    }

	    // Accessors and Mutators
	    public String getCourseCode() {
	        return courseCode;
	    }

	    public void setCourseCode(String courseCode) {
	        this.courseCode = courseCode;
	    }

	    public String getCourseTitle() {
	        return courseTitle;
	    }

	    public void setCourseTitle(String courseTitle) {
	        this.courseTitle = courseTitle;
	    }

	    public String getInstructorName() {
	        return instructorName;
	    }

	    public void setInstructorName(String instructorName) {
	        this.instructorName = instructorName;
	    }

	    public int getMaximumCapacity() {
	        return maximumCapacity;
	    }

	    public void setMaximumCapacity(int maximumCapacity) {
	        this.maximumCapacity = maximumCapacity;
	    }

	    public int getCurrentEnrollment() {
	        return currentEnrollment;
	    }

	    public void setCurrentEnrollment(int currentEnrollment) {
	        this.currentEnrollment = currentEnrollment;
	    }

	    // Method to enroll a student
	    public boolean enrollStudent() {
	        if (currentEnrollment < maximumCapacity) {
	            currentEnrollment++;
	            return true;
	        } else {
	            return false;
	        }
	    }

	    public static void main(String[] args) {
	        Course javaCourse = new Course("CS101", "Java Programming", "John Smith");
	        
	        // Attempting to enroll a student
	        boolean enrolled = javaCourse.enrollStudent();

	        if (enrolled) {
	            System.out.println("Student enrolled successfully!");
	        } else {
	            System.out.println("No available seats. Enrollment failed.");
	        }

	        // Printing current enrollment after attempting to enroll a student
	        System.out.println("Current Enrollment: " + javaCourse.getCurrentEnrollment());
	    }
	}

