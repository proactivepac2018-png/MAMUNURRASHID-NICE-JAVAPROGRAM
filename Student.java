public class Student {
    String name;
    int id;
    double cgpa;
    String dept;

    Student(String name, int id, double cgpa, String dept) {
        this.name=name;
        this.id=id;
        this.cgpa=cgpa;
        this.dept=dept;
    }

    void display() {
        System.out.println("Name : "+name+"\nID : "+id+"\nCGPA : "+cgpa+"\nDepartment : "+dept+"\n");
    }

    public static void main(String[] args) {
        Student std60 = new Student("MAMUNUR RASHID", 60, 3.71, "CSE");
        Student std036 = new Student("Nice", 36, 3.93, "CSE");
        Student std37 = new Student("M.R.N", 37, 3.00, "CSE");
        
        System.out.println("Student Info : ");
        System.out.println("--------------");

        std60.display();
        std036.display();
        std37.display();

    }
}
