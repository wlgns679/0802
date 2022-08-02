import java.util.Scanner;

public class SungjukMgmt {
	public static void main(String[] args) {
		System.out.println("성적관리 프로그램 시작");
		Student jimin = new Student();
		input(jimin);
		calc(jimin);
		output(jimin);
		System.out.println("성적관리 프로그램 종료");
	}
	static void output(Student student) {
		System.out.println("<<<<부산정보산업고등학교 성적관리프로그램>>>>");
		System.out.println("학번\t이름\t국어\t영어\t수학\t총점\t평균\t평점");
		System.out.println("-------------------------------------------------");
		System.out.printf("%s\t%s\t%d\t%d\t%d\t%d\t%.2f\t%c\n", student.hakbun, student.name,
				student.kor, student.eng, student.mat, student.tot, student.avg, student.grade);
	}
	static void calc(Student student) {
		student.tot = student.kor + student.eng + student.mat;
		student.avg = student.tot / 3.;
		student.grade =(student.avg >= 90 && student.avg <= 100) ? 'A' :
			(student.avg < 90) ? 'B' :
				(student.avg < 80) ? 'C' :
					(student.avg < 70) ? 'D' : 'E';
	}
	static void input(Student student) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Name : ");			student.name = sc.nextLine();
		System.out.print("Hakbun : ");		student.hakbun = sc.nextLine();
		System.out.print("Korean : ");		student.kor = sc.nextInt();
		System.out.print("English : ");		student.eng = sc.nextInt();
		System.out.print("Match : ");			student.mat = sc.nextInt();
	}
}
