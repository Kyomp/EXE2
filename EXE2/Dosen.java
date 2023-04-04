package EXE2;

public class Dosen extends Person{
	String code_dosen;
	int point;
	public Dosen(String name, String dob, String code_dosen, int point){
		super(name,dob);
		this.code_dosen = code_dosen;
		this.point = point;
	}
	public void selfDev() {
		System.out.println("Hiking Mount Everest...");
	}
	public void teach() {
		System.out.println(name+": blah blah blah blah");
	}
	public void p2m() {
		System.out.println("\"Helping\" the nation");
	}
	public void research() {
		System.out.println("*click clack click*");
	}
	public void otherWorks() {
		System.out.println(" ¯\\_(ツ)_/¯");
	}
	@Override
	public void print() {
		super.print();
		System.out.print("dosen code :"+code_dosen+"\npoints: " + point + "\n");
	}
}
