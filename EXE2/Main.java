package EXE2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dosen d = new Dosen("Arguin", "1 May 1978", "Ar15", 60);
		Mahasiswa m = new Mahasiswa("Melvin", "26 February 2000", "Me262", 10);
		Person p = new Person("Larry", "20 February 1998");
		Scanner s = new Scanner(System.in);
		System.out.println("1");
		int input = -1;
		while(input != 4) {
			input = s.nextInt();
			if(input == 1) {
				m.sleep();
				m.HelpingDosen();
				m.print();
			}
			else if(input == 2) {
				d.sleep();
				d.selfDev();
				d.teach();
				d.p2m();
				d.research();
				d.otherWorks();
				d.print();
			}
			else if(input == 3) {
				p.sleep();
				p.print();
			}
		}
		s.close();
	}

}
