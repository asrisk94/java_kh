package kh.java.oop.student;

public class Run {

	public static void main(String[] args) {
		//객체생성
		Student s1 = new Student();
//		s1.name = "김철수";
//		s1.gender = '남';
//		s1.age = 20;
//		s1.introduce();

		s1.setName("김철수");
		s1.setGender('남');
		s1.setAge(30);
		s1.introduce();
		
		Student s2 = new Student();
//		s2.name = "이영희";
//		s2.gender = '여';
//		s2.age = 20;
//		s2.introduce();
		s2.setName("이영희");
		s2.setGender('여');
		s2.setAge(20);
		s2.introduce();

	}
}
