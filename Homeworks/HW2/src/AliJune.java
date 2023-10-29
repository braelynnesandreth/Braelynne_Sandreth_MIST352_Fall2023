public class AliJune {
    private String courseCode;
    private String courseTitle;
    private String instructorName;
    private int maximumCapacity;
    private int currentEnrollment;

    public AliJune(String courseCode, String courseTitle, String instructorName) {
        this.courseCode = courseCode;
        this.courseTitle = courseTitle;
        this.instructorName = instructorName;
        this.maximumCapacity = 30;
        this.currentEnrollment = 29;
    }

    public boolean enrollStudent() {
        if (currentEnrollment < maximumCapacity) {
            currentEnrollment++;
            return true;
        } else {
            return false;
        }
    }

    public String getCourseCode() {
        return courseCode;
    }

    public String getCourseTitle() {
        return courseTitle;
    }

    public String getInstructorName() {
        return instructorName;
    }

    public int getMaximumCapacity() {
        return maximumCapacity;
    }

    public int getCurrentEnrollment() {
        return currentEnrollment;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public void setCourseTitle(String courseTitle) {
        this.courseTitle = courseTitle;
    }

    public void setInstructorName(String instructorName) {
        this.instructorName = instructorName;
    }

    public void setMaximumCapacity(int maximumCapacity) {
        this.maximumCapacity = maximumCapacity;
    }

    public static void main(String[] args) {
        AliJune mist352 = new AliJune("MIST352", "Database Management", "Dr. Johnson");
        AliJune cs101 = new AliJune("CS101", "Introduction to Computer Science", "Prof. Smith");

        // a. Enrolling Ali June in MIST352
        if (!mist352.enrollStudent()) {
            System.out.println("Enrolling Ali June in MIST352 was not successful.");
        }

        // b. Enrolling Ali June in CS101
        if (!cs101.enrollStudent()) {
            System.out.println("Enrolling Ali June in CS101 was not successful.");
        }

        // c. Why do you think the program won't enroll Ali to those classes?
        // The program won't enroll Ali June in those classes because the maximum capacity for both MIST352 and CS101 courses is set to 30, and the current enrollment is already 30 students. Since there is no room for more students, the enrollment attempts for Ali June fail.
    }
}

