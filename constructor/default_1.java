package constructor;
 
// Display Student Information
public class default_1 {

	public static void main(String[] args) {
		 
		   Student s = new Student();
	        s.display();
	    }
	}

	class Student {
	    String name;
	    int rollNo;

	    // Default constructor
	    Student() {
	        name = "Aniket";
	        rollNo = 101;
	    }

	    void display() {
	        System.out.println("Name: " + name + ", Roll No: " + rollNo);
	    }
	}