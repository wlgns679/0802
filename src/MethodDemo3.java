
public class MethodDemo3 {
	public static void main(String[] args) {
//		System.out.println(mymethod(5));
	}
	static Student mymethod() {
		Student jimin = new Student();
		jimin.name = "한지민";
		jimin.age = 26;
		return jimin;
	}
/*	static int [] mymethod() {
		return new int[] {5, 9, 4, 5, 6, 7, 8, 9};
	}	*/

/*	static String mymethod(int su) {		// 한 번에, 한 개만 리턴
		if (su % 2 == 0)
			return "Hello";
		else	return "World";
	}		*/
}
