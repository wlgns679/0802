import java.util.Scanner;

public class Input {
	static void input(Student student) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Name : ");			student.name = sc.nextLine();
	System.out.print("Hakbun : ");		student.hakbun = sc.nextLine();
	System.out.print("Korean : ");		student.kor = sc.nextInt();
	System.out.print("English : ");		student.eng = sc.nextInt();
	System.out.print("Match : ");			student.mat = sc.nextInt();
	}
}
