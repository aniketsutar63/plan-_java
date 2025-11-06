package variables_3_type;

public class Static_1_program {

	public static void main(String[] args) {
		 
		School DSK=new School();
		DSK.id=15;
		DSK.name="Aniket";
		 DSK.info();
		 
		 School VDK=new School();
		 VDK.id=14;
		 VDK.name="Rohan";
		 VDK.info();
		 
		
	}

}
class School{
	int id;
	String name;
	
	public void info() {
		System.out.println("School student id : "+id);
		System.out.println("Student  name :  "+name);
	}
}

