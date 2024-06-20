class CollegeStudent extends Student {
    private String major;  // Major of the student
    private int year;      // Current level in college (e.g., FROSH = 1, SOPH = 2, etc.)

    // Constructor
    public CollegeStudent(String name, int age, String gender, String idNum, double gpa, int year, String major) {
        // Use the superclass' constructor
        super(name, age, gender, idNum, gpa);
        // Initialize what's new to CollegeStudent
        this.year = year;
        this.major = major;
    }

    // Getter for year
    public int getYear() {
        return year;
    }

    // Setter for year
    public void setYear(int year) {
        this.year = year;
    }

    // Getter for major
    public String getMajor() {
        return major;
    }

    // Setter for major
    public void setMajor(String major) {
        this.major = major;
    }

    // toString method
    @Override
    public String toString() {
        return super.toString() + ", year: " + year + ", major: " + major;
    }
}