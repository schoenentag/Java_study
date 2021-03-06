package array;

public class Student {
	
	// Field
		private int studentNo; // 학번
		private String studentName; //이름
		private int kor;
		private int eng;
		private int math;
		
		// Constructor
		
		public Student() {
			
		}
		
		public Student(int studentNo, String studentName, int kor, int eng, int math) {
			super();
			this.studentNo = studentNo;
			this.studentName = studentName;
			this.kor = kor;
			this.eng = eng;
			this.math = math;
		}
		
		public int getStudentNo() {
			return studentNo;
		}
		public void setStudentNo(int studentNo) {
			this.studentNo = studentNo;
		}
		public String getStudentName() {
			return studentName;
		}
		public void setStudentName(String studentName) {
			this.studentName = studentName;
		}
		public int getKor() {
			return kor;
		}
		public void setKor(int kor) {
			if (kor < 0) {
				kor = 0;
			}
			this.kor = kor;
		}
		public int getEng() {
			return eng;
		}
		public void setEng(int eng) {
			if (eng < 0 ) {
				eng = 0;
			}
			this.eng = eng;
		}
		public int getMath() {
			return math;
		}
		public void setMath(int math) {
			if (math < 0) {
				math = 0;
			}
			this.math = math;
		}
		
		// Method
		
		public int info() {
			System.out.println("학번 : " + getStudentNo());
			System.out.println("이름 : " + getStudentName());
			System.out.println("국어 점수 : " + getKor());
			System.out.println("영어 점수 : " + getEng());
			System.out.println("수학 점수 : " + getMath());
			System.out.println("평균 : " + getAvg());
			return 1;
		}
		
		public double getAvg() {
			return (kor + eng + math)/3.0;
		}

}
