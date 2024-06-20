class Teacher extends Person {
    private String subject;    // Subject the teacher teaches
    private double salary;     // Teacher's salary

    // Constructor
    public Teacher(String name, int age, String gender, String subject, double salary) {
        // Use the superclass' constructor
        super(name, age, gender);
        // Initialize what's new to Teacher
        this.subject = subject;
        this.salary = salary;
    }

    // Getter for subject
    public String getSubject() {
        return subject;
    }

    // Setter for subject
    public void setSubject(String subject) {
        this.subject = subject;
    }

    // Getter for salary
    public double getSalary() {
        return salary;
    }

    // Setter for salary
    public void setSalary(double salary) {
        this.salary = salary;
    }

    // toString method
    @Override
    public String toString() {
        return super.toString() + ", subject: " + subject + ", salary: $" + salary;
    }
}