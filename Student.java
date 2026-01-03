class Student {
    private String name;
    private int age;
    private char grade;


    public Student(String name, int age, char grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public char getGrade() {
        return grade;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }



    public String toString() {
        return "Name: " + name + ", Age: " + age + ", Grade: " + grade;
    }
}
