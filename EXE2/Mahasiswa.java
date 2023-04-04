package EXE2;

public class Mahasiswa extends Person{
	String studentID;
	int point;
	public Mahasiswa(String name, String dob, String studentID, int point){
		super(name, dob);
		this.studentID = studentID;
		this.point = point;
		
	}
	public void HelpingDosen() {
		point += 10;
	}
	@Override
	public void print() {
		super.print();
		System.out.print("ID :"+studentID+"\npoints: " + point + "\n");
	}
}
