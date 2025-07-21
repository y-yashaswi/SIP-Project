public class Student {
	String name;
    int rollNo;

    // To display student details
    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
    }

    public static void main(String[] args) {
        Student s = new Student();
        s.name = "Yashaswi";
        s.rollNo = 118;
        s.displayDetails();
    }

}

