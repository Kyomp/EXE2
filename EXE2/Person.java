package EXE2;

public class Person {
	String name;
	String dob;
	public Person(String name, String dob){
		this.name = name;
		this.dob = dob;
	}
	public void sleep() {
		System.out.println(name + ": ZZZZZZZZ");
	}
	public void print() {
		System.out.print("name: "+name+"\ndob: "+dob+"\n");
	}
}
