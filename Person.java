class Person {
    protected String myName;   // name of the person
    protected int myAge;       // person’s age
    protected String myGender; // “M” for male, “F” for female

    public Person(String name, int age, String gender) {
        myName = name;
        myAge = age;
        myGender = gender;
    }

    // Getter for name
    public String getName() {
        return myName;
    }

    // Setter for name
    public void setName(String name) {
        myName = name;
    }

    // Getter for age
    public int getAge() {
        return myAge;
    }

    // Setter for age
    public void setAge(int age) {
        myAge = age;
    }

    // Getter for gender
    public String getGender() {
        return myGender;
    }

    // Setter for gender
    public void setGender(String gender) {
        myGender = gender;
    }

    @Override
    public String toString() {
        return myName + ", age: " + myAge + ", gender: " + myGender;
    }
}