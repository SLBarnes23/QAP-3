class Student extends Person {
    protected String myIdNum;  // Student Id Number
    protected double myGPA;    // grade point average

    public Student(String name, int age, String gender, String idNum, double gpa) {
        // use the superclass’ constructor
        super(name, age, gender);
        // initialize what’s new to Student
        myIdNum = idNum;
        myGPA = gpa;
    }

    // Getter for ID Number
    public String getIdNum() {
        return myIdNum;
    }

    // Setter for ID Number
    public void setIdNum(String idNum) {
        myIdNum = idNum;
    }

    // Getter for GPA
    public double getGPA() {
        return myGPA;
    }

    // Setter for GPA
    public void setGPA(double gpa) {
        myGPA = gpa;
    }

    @Override
    public String toString() {
        return super.toString() + ", ID: " + myIdNum + ", GPA: " + myGPA;
    }
}