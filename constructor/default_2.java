package constructor;

		//Car Details
public class default_2 {

	public static void main(String[] args) {
		cars c1=new cars("2025","BMW",1200000);
		c1.Display();

	}

}

class cars {
	String year;
	String name;
	double price;
	
	cars(String year,String name,double price){
		this.year=year;
		this.price=price;
		this.name=name;
		
		
		
	}
	void Display(){
		System.out.println("car name = "+name);
		System.out.println("year = "+year);
		System.out.println("car price = "+price);
		
	}
}